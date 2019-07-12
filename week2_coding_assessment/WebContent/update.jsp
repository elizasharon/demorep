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
<h1>Update</h1>
<hr>
<form action="UpdateServlet" method=post>
<h2>
name: <input type="text" name="t1"><br>
age: <input type="number" name="t2"><br>
id: <input type="number" name="t3"><br>
salary: <input type="number" name="t4"><br>
position: <input type="text" name="t5"><br>
<br>
<input type="submit" name="b1" value="UPDATE">
<input type="reset" name="b2" value="RESET">

</h2>
</form>

</body>
</html>