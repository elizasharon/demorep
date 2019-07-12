package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import javabean.data.Emp;
import javabean.model.EmpDAOImp;

/**
 * Servlet implementation class InsertServlet
 */
public class InsertServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InsertServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
		//out.println("go");
		String name=request.getParameter("t1");
		int id=Integer.parseInt(request.getParameter("t2"));
		int age=Integer.parseInt(request.getParameter("t3"));
		int sal=Integer.parseInt(request.getParameter("t4"));
		String pos=request.getParameter("t5");
		
		//out.println("after getting values");
		Emp e1=new Emp();
		e1.setName(name);
		e1.setAge(age);
		e1.setId(id);
		e1.setSalary(sal);
		e1.setMode(pos);
		EmpDAOImp imp=new EmpDAOImp();
		
		//out.println("before calling method");
		int res=imp.insert(e1);
		if(res==0)
		{
			out.println("Unsuccessful INSERT");
		}
		else
		{
			out.println("Successful INSERT");
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
