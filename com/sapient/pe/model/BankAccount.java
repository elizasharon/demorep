package com.sapient.pe.model;

/*enum AccountType {
	SAVINGS_ACCOUNT,
	CURRENT_ACCOUNT,
	SALARY_ACCOUNT,
}
*/
public class BankAccount {
	
	

	static int counter=10;
	private final int account_number;
	protected double balance;
	private String type;
	//private AccountType type;
	
	private final Person person;
	
	
	public BankAccount(Person person,String type)
	{
		this.account_number=counter;
		this.person=person;
		this.type=type;
		counter++;
	}

	public static int getCounter() {
		return counter;
	}


	

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	
	public void deposit(double balance)
	{
		this.balance=this.balance+balance;
			
	}
	
	public double withdrawal(double balance)
	{
		if((this.balance=this.balance-balance)>=0)
		{
		this.balance=this.balance-balance;
		
		}
		else 
		{
			System.out.println("insufficient funds");
		}
		return this.balance;
	}

	public int getAccount_number() {
		return account_number;
	}

	public Person getPerson() {
		return person;
	}
	
	public void getAccount()
	{
		System.out.println("Account Number: "+this.account_number);
		System.out.println("Balance: "+this.balance);
		this.person.getPerson();
	}
	
	

}
