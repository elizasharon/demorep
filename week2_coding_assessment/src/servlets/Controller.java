package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import javabean.data.Emp;
import javabean.model.EmpDAOImp;

/**
 * Servlet implementation class Controller
 */
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Controller() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String id1=request.getParameter("t1");
		String uord=request.getParameter("t2");
		int id = Integer.parseInt(id1);	
		EmpDAOImp imp=new EmpDAOImp();
		
		
		Emp e1=new Emp();
		e1=imp.select(id);
		PrintWriter out=response.getWriter();
		
		 request.setAttribute("data", e1); 
		 System.out.println(e1);
		 
		 if(uord.equals("update"))
		 {
			 System.out.println("11111111111111111111111");
			 RequestDispatcher rd = request.getRequestDispatcher("update.jsp");
			 rd.forward(request, response);
		 }
		 
		 if(uord.equals("delete"))
		 {
			 int res=imp.delete(e1);
			 if(res!=0)
			 {
				 out.println("Successfully deleted following record");
			 }
			 RequestDispatcher rd = request.getRequestDispatcher("delete.jsp");
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
