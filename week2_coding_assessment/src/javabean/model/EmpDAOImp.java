package javabean.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import interfaces.EmpDAO;
import javabean.data.Emp;

public class EmpDAOImp implements EmpDAO {
	
	
	
	//========INIT
	
	public void connection()
	{
		
	}
	 
	
	/*
	public  void getConnection() throws ClassNotFoundException, SQLException
	{
		Class.forName("com.mysql.jdbc.Driver");
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/week2","root","Sapient123");
		
	}
*/
	@Override
	public int insert(Emp e) {
		// TODO Auto-generated method stub
		
		
		int i=0;
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/week2","root","Sapient123");
			
		PreparedStatement pst=con.prepareStatement("insert into emp values(?,?,?,?,?)");
		pst.setString(1, e.getName());
		pst.setInt(2, e.getAge());
		pst.setInt(3, e.getId());
		pst.setInt(4,e.getSalary());
		pst.setString(5, e.getMode());
		i=pst.executeUpdate();
		
		}
		
		catch(Exception e1)
		{
			System.out.println(e1);
		}
		
		return i;
	}

	@Override
	public int update(Emp e) {
		// TODO Auto-generated method stub
		
		int i=0;
		
		
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/week2","root","Sapient123");
			
			String name=e.getName();
			int id=e.getId();
			int age=e.getAge();
			int sal=e.getSalary();
			String pos=e.getMode();
			
			PreparedStatement pst=con.prepareStatement("update emp set "
					+ "name1=?,age=?,salary=?,position=? where id=?");
			pst.setString(1, name);
			pst.setInt(2, age);
			pst.setInt(3, sal);
			pst.setString(4, pos);
			
			pst.setInt(5, id);
			
			
			i=pst.executeUpdate();
		}
		catch(Exception e1)
		{
			System.out.println(e1);
		}
		
		
		
		
		
		return i;
	}

	@Override
	public int delete(Emp e) {
		// TODO Auto-generated method stub
		
		int id=e.getId();
		int i=0;
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/week2","root","Sapient123");
			
		PreparedStatement pst=con.prepareStatement("delete from emp where id=id");
		i=pst.executeUpdate();
		}
		catch(Exception e1)
		{
			System.out.println(e1);
		}
		
		
		
		return i;
	}

	@Override
	public ArrayList<Emp> retrieve() {
		// TODO Auto-generated method stub
		
		ArrayList<Emp> arr= new ArrayList<Emp>();
		String name;
		int id;
		int age;
		int sal;
		String pos;
		
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/week2","root","Sapient123");
			
		PreparedStatement pst=con.prepareStatement("select * from emp");
		ResultSet rs=pst.executeQuery();
		while(rs.next())
		{
			Emp e=new Emp();
			e.setName(rs.getString(1));
			e.setAge(rs.getInt(2));
			e.setId(rs.getInt(3));
			e.setSalary(rs.getInt(4));
			e.setMode(rs.getString(5));
			arr.add(e);
			
		}
		}
		catch(Exception e1)
		{
			System.out.println(e1);
		}
		
		
		for(int i=0;i<arr.size();i++)
		{
			System.out.println(arr.get(i));
		}
		return arr;
	}
	
	public Emp select(int id)
	{
		
		Emp e=new Emp();
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/week2","root","Sapient123");
			
		PreparedStatement pst=con.prepareStatement("select * from emp");
		ResultSet rs=pst.executeQuery();
		int flag=0;
		while(rs.next() && flag==0)
		{
			if(rs.getInt(3)==id)
			{
				flag=1;
				e.setAge(rs.getInt(2));
				e.setId(id);
				e.setMode(rs.getString(5));
				e.setName(rs.getString(1));
				e.setSalary(rs.getInt(4));
			}
		}
		rs.close();
		}
		catch(Exception e1)
		{
			System.out.println(e1);
		}
		System.out.println(e);
		return e;
	}
	

}
