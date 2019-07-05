package com.sapient.pe.model;

public class Savings extends BankAccount{
	
	static final double min_balance=10_000;

	public Savings(Person person, String type) {
		super(person, type);
		this.balance=10_000;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void deposit(double balance) {
		// TODO Auto-generated method stub
		if((this.getBalance()+balance)>50_000)
		{
			System.out.println("exceeding the deposit limit");
		}
		else
		{
			this.balance=this.balance+balance;
			
		}
	}

	@Override
	public double withdrawal(double balance) {
		// TODO Auto-generated method stub
		if(balance>=25_000)
		{
			System.out.println("Withdrawal Exceeds limit for the day");
		}
		
		else
		{
			
		
		if((this.balance=this.balance-balance)>=min_balance)
		{
		this.balance=this.balance-balance;
		
		}
		else 
		{
			System.out.println("insufficient funds");
		}
		}
		return this.balance;
		
	}

	
}
