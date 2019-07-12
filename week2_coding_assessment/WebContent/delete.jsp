<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<%@page import="javabean.data.Emp"%> 
<title>Insert title here</title>
</head>
<body>

<h1>Displaying Employee</h1> 
      <table border ="1" width="500" align="center"> 
         <tr bgcolor="00FF7F"> 
          <th><b> Name</b></th> 
          <th><b>Age</b></th> 
          <th><b>id</b></th> 
          <th><b>salary</b></th>
          <th><b>position</b></th>
         </tr> 
         <%Emp e = (Emp)request.getAttribute("data");%>      
            <tr> 
                <td><%=e.getName()%></td> 
                <td><%=e.getAge() %></td> 
                <td><%= e.getId() %></td>
                <td><%= e.getSalary() %></td>
                <td><%= e.getMode() %></td> 
            </tr> 
            
        </table>  
<input type="submit" name="b1" value="delete">
</body>
</html>