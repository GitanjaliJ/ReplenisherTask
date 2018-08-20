package com.replenisher;

import java.util.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONObject;

/**
 * Servlet implementation class PendingTasksServlet
 */
@WebServlet("/pendingtasks")
public class PendingTasksServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PendingTasksServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String searchCriteria = request.getParameter("searchCriteria");
		String searchTerm = request.getParameter("searchTerm").trim().toLowerCase();	
		
		List<PendingTaskDisplayBean> elem;
		try {
			elem = LookupPendingTasks.getElementFromDb(PendingTask.getOptionFromString(searchCriteria), searchTerm);
			request.setAttribute("chemicalElement", elem);
			System.out.println("Elem :\n"+elem);
			String address = "/pt.jsp";
			RequestDispatcher dispatcher = request.getRequestDispatcher(address);
			System.out.println("----");
			dispatcher.forward(request, response);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
