package interfaces;

import java.util.ArrayList;

import javabean.data.Emp;

public interface EmpDAO {
	
	public int insert(Emp e);
	public int update(Emp e);
	public int delete(Emp e);
	public ArrayList<Emp>  retrieve();
	public Emp select(int id);
	
	

}
