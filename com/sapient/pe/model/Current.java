package com.sapient.pe.model;

public class Current extends BankAccount {
	
	static final double min_balance=25_000;
	
	public Current(Person person, String type) {
		super(person, type);
		this.balance=25_000;
		// TODO Auto-generated constructor stub
	}

	@Override
	public double withdrawal(double balance) {
		// TODO Auto-generated method stub
		if((this.balance=this.balance-balance)>=min_balance)
		{
		this.balance=this.balance-balance;
		
		}
		else 
		{
			System.out.println("insufficient funds");
		}
		return this.balance;
	}

	

}
