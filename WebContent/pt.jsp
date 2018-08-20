<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<title>Insert title here</title>
<link href="stylesheets/styles.css" rel="stylesheet">
</head>
<body>
	<table id="PendingTasksTable">
	  <tr>
	   <!--When a header is clicked, run the sortTable function, with a parameter, 0 for sorting by names, 1 for sorting by country:-->  
	    <th>TaskID</th>
	    <th>Task</th>
	    <th>Task Description</th>
	    <th>Notes</th>
	    <th>FeedBack</th>
	    <th onclick="sortTable(0)">Status </th>
	    <th onclick="sortTable(1)">Rank</th>
	  </tr>
	
	  <c:forEach items="${chemicalElement}" var="chemicalElements">
        <tr>
	        <td>${chemicalElements.taskID}</td>
		    <td>${chemicalElements.taskName}</td>
		    <td>${chemicalElements.taskDesc}</td>
		    <td>${chemicalElements.notes}</td>
		    <td>${chemicalElements.feedback}</td>
		    <td>${chemicalElements.status}</td>
		    <td>${chemicalElements.rank}</td>
		 </tr>
       </c:forEach>
  
      
	  <%-- <tr>
	    <td>${chemicalElement.taskID}</td>
	    <td>${chemicalElement.taskName}</td>
	    <td>${chemicalElement.taskDesc}</td>
	    <td>${chemicalElement.notes}</td>
	    <td>${chemicalElement.feedback}</td>
	    <td>${chemicalElement.status}</td>
	    <td>${chemicalElement.rank}</td>
	  </tr> --%>
	</table>
	<script>
function sortTable(n) {
  var table, rows, switching, i, x, y, shouldSwitch, dir, switchcount = 0;
  table = document.getElementById("PendingTasksTable");
  switching = true;
  dir = "asc"; 
  while (switching) {
    switching = false;
    rows = table.rows;
    for (i = 1; i < (rows.length - 1); i++) {
      shouldSwitch = false;
      x = rows[i].getElementsByTagName("td")[n];
      y = rows[i + 1].getElementsByTagName("td")[n];
      if (dir == "asc") {
        if (x.innerHTML.toLowerCase() > y.innerHTML.toLowerCase()) {
          shouldSwitch= true;
          break;
        }
      } else if (dir == "desc") {
        if (x.innerHTML.toLowerCase() < y.innerHTML.toLowerCase()) {
          shouldSwitch = true;
          break;
        }
      }
    }
    if (shouldSwitch) {
      rows[i].parentNode.insertBefore(rows[i + 1], rows[i]);
      switching = true;
      switchcount ++;      
    } else {
      if (switchcount == 0 && dir == "asc") {
        dir = "desc";
        switching = true;
      }
    }
  }
}
</script>
</body>
</html>