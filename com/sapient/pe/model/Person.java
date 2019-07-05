package com.sapient.pe.model;

public class Person {
	private int age;
	private String marital_status;
	private String name;
	private  long aadhar_number;
	private String gender;
	private String email;
	private Address addr;
	
	public Person(int age,String marital_status,String name,long aadhar_number,String gender,String email,Address add)
	{
		this.aadhar_number=aadhar_number;
		this.age=age;
		this.email=email;
		this.gender=gender;
		this.marital_status=marital_status;
		this.name=name;
		this.addr=add;
		
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getMarital_status() {
		return marital_status;
	}

	public void setMarital_status(String marital_status) {
		this.marital_status = marital_status;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getAadhar_number() {
		return aadhar_number;
	}

	public void setAadhar_number(long aadhar_number) {
		this.aadhar_number = aadhar_number;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public void getPerson()
	{
		System.out.println("Name: "+this.name);
		System.out.println("Age: "+this.age);
		//System.out.println("marital Status: "+this.marital_status);
		//System.out.println("email: "+this.email);
		//System.out.println("gender: "+this.gender);
		//System.out.println("Aadhar Number: "+this.aadhar_number);
		//this.addr.getAddress();
		
	}
	
	

}
