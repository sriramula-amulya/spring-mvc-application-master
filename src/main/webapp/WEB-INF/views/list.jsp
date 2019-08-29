<%@page import="java.time.LocalDate"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"  %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>list</title>
</head>
<body>
<h1>Employees</h1>

<table border="1">
    <tr>
       
        <th> ID</th>
         <th> Name</th>
           <th>Department Name</th>
            

    </tr>
     <c:forEach items=" ${employees}" var="employee">
    
        <tr>
            
            <td>${employee.id}</td>
            <td>${employee.name}</td>
            <td>${employee.departmentName}</td>
            

        </tr>
    </c:forEach>
</table>
</body>
</html>