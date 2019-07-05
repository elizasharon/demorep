package com.sapient.pe.model;

public class Salary extends BankAccount{
	
	public Salary(Person person, String type) {
		super(person, type);
		this.balance=0;
		// TODO Auto-generated constructor stub
	}

	static final double min_balance=0;
	
	@Override
	public void deposit(double balance) {
		// TODO Auto-generated method stub
		if(balance>=50_000)
		{
			System.out.println("Cannot deposit as it exceeds the limit");
		}
		else
		{
			this.balance=this.balance+balance;
		}
	}

	

	

}
