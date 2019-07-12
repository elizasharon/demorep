<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<%@page import="java.util.ArrayList"%> 
<%@page import="javabean.data.Emp"%> 
</head>
<body>

<h1>Displaying employee List</h1> 
      <table border ="1" width="500" align="center"> 
         <tr bgcolor="00FF7F"> 
          <th><b> Name</b></th> 
          <th><b>Age</b></th> 
          <th><b>id</b></th> 
          <th><b>salary</b></th>
          <th><b>position</b></th> 
         </tr> 
        <%-- Fetching the attributes of the request object 
             which was previously set by the servlet  
              "StudentServlet.java" 
        --%>  
        <%ArrayList<Emp> std =  
            (ArrayList<Emp>)request.getAttribute("data"); 
        for(Emp e:std){%> 
        <%-- Arranging data in tabular form 
        --%> 
            <tr> 
                <td><%=e.getName()%></td> 
                <td><%=e.getAge() %></td> 
                <td><%= e.getId() %></td>
                <td><%= e.getSalary() %></td>
                <td><%= e.getMode() %></td> 
            </tr> 
            <%}%> 
        </table>  





</body>
</html>