package javabean.data;

public class Emp {
	
	@Override
	public String toString() {
		return "Emp [name=" + name + ", age=" + age + ", id=" + id + ", mode=" + mode + ", salary=" + salary + "]";
	}
	private String name;
	private int age;
	private int id;
	private String mode;
	private int salary;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMode() {
		return mode;
	}
	public void setMode(String mode) {
		this.mode = mode;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	

}
