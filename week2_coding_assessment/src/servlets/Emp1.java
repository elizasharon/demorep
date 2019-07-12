package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Emp1
 */
public class Emp1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Emp1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String name=request.getParameter("t1");
		String password=request.getParameter("t2");
		PrintWriter out=response.getWriter();
		int flag=0;
		
		try
		{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/week2","root","Sapient123");
		PreparedStatement pst=con.prepareStatement("select * from admins");
		ResultSet rs=pst.executeQuery();
		
		while(rs.next() && flag==0)
		{
			if(rs.getString(1).equals(name) && rs.getString(2).equals(password))
			{
				flag=1;
				
					RequestDispatcher rd=request.getRequestDispatcher("options.jsp");
					rd.forward(request, response);
				
			}
		}
		}
		catch(Exception e1)
		{
			System.out.println(e1);
		}
		
		if(flag==0)
		{
			out.println("<h1>invalid login</h1>");
			RequestDispatcher rd=request.getRequestDispatcher("login.jsp");
			rd.include(request, response);
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
