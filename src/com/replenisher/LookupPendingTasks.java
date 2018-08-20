package com.replenisher;

import java.sql.*;
import java.util.*;
public class LookupPendingTasks {
	
/*	public static PendingTaskDisplayBean by(PendingTask searchCriteria, String value) {
		PendingTaskDisplayBean elem = new PendingTaskDisplayBean();
		try {
			elem = getElementFromDb(searchCriteria, value);
		} catch(Exception e) {
			e.printStackTrace();
		}
		return elem;
	}*/
	
	public static List <PendingTaskDisplayBean> getElementFromDb(PendingTask column, String value) throws SQLException, ClassNotFoundException {
			Class.forName("org.h2.Driver");
        	Connection conn = null;
        	PreparedStatement getAnElementRow = null;
        	ResultSet theElementSet = null;
        	List <PendingTaskDisplayBean> taskList = new ArrayList<PendingTaskDisplayBean>();
        	try{
        		conn = DriverManager.getConnection("jdbc:h2:~/ReplenisherDB", "sa", "");
        		String SQLQuery = String.format("Select * from TASKS WHERE LOWER(%s) LIKE ?", column.getColumnName());
        		getAnElementRow = conn.prepareStatement(SQLQuery);
        		getAnElementRow.setString(1, String.format("%s", value));
        		
        		theElementSet = getAnElementRow.executeQuery();
        		while(theElementSet.next()) {
        			PendingTaskDisplayBean e = new PendingTaskDisplayBean();
        			e.setTaskID(theElementSet.getString("taskID"));
        			e.setTaskName(theElementSet.getString("taskName"));
        			e.setTaskDesc(theElementSet.getString("taskDescription"));
        			e.setNotes(theElementSet.getString("notes"));
        			e.setFeedback(theElementSet.getString("feedback"));
        			e.setStatus(theElementSet.getString("status"));
        			e.setRank(theElementSet.getString("rank"));
        			taskList.add(e);
            		/*e = new PendingTaskDisplayBean(
            				theElementSet.getString(PendingTask.TASKID.getColumnName()),
            				theElementSet.getString(PendingTask.TASKNAME.getColumnName()),
            				theElementSet.getString(PendingTask.TASKDESC.getColumnName()),
            				theElementSet.getString(PendingTask.NOTES.getColumnName()),
            				theElementSet.getString(PendingTask.FEEDBACK.getColumnName()),
            				theElementSet.getString(PendingTask.STATUS.getColumnName()),
            			theElementSet.getString(PendingTask.RANK.getColumnName()));*/
            	}
        	}finally{
        		 if (theElementSet != null) try { theElementSet.close(); } catch (SQLException logOrIgnore) {}
        	        if (getAnElementRow != null) try { getAnElementRow.close(); } catch (SQLException logOrIgnore) {}
        	        if (conn != null) try { conn.close(); } catch (SQLException logOrIgnore) {}
        	}
        	
        	return taskList;
	}

}