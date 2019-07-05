package com.sapient.pe.model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Accountant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int num=1;
		List<BankAccount> accts=new ArrayList<>();
		Scanner sc=new Scanner(System.in);
		
		while(num<3)
		{
		System.out.println("Account Creation");
		
		
		System.out.println("enter city");
		String city=sc.nextLine();
		
		System.out.println("enter street");
		String street=sc.nextLine();
		
		System.out.println("enter state");
		String state=sc.nextLine();
		
		Address addr=new Address(street,city,state);
		
		//===========================================
		
		System.out.println("enter age");
		int age=sc.nextInt();
		//hsdSystem.out.println();
		sc.nextLine();
		
		System.out.println("enter marital status \n");
		String ms=sc.nextLine();
		
		System.out.println("enter name");
		String name=sc.nextLine();
		
		System.out.println("enter aadhar num");
		long aa=sc.nextLong();
		sc.nextLine();
		
		System.out.println("enter gender");
		String gen=sc.nextLine();
		
		System.out.println("enter email");
		String em=sc.nextLine();
		
		Person pr=new Person(age,ms,name,aa,gen,em,addr);
		
		//=================================================
		
		System.out.println("Which type of account 1)Savings  2)Current  3)Salary");
		
		
		int type=sc.nextInt();
		
		BankAccount acc;
		
		if(type==1)
		{
			acc=new Savings(pr,"savings");
			
		}
		else if(type==2)
		{
			 acc=new Current (pr,"Current");
			 
		}
		else
		{
			 acc=new Salary(pr,"Salary");
			 
		}
		
		accts.add(acc);
		
		
		
		System.out.println("Account created with number "+acc.getAccount_number());
		num++;
		
		
		}
		
		//==========================================
		
		
		Iterator iterator = accts.iterator(); 
		  
        System.out.println("List elements : ");
        
        while (iterator.hasNext()) 
            System.out.print(iterator.next() + " "); 
  
		
		//=====================================================
		
		
		int i=0;
		BankAccount acc1=null;
		while(i!=4)
		{
		System.out.println("1) view your account");
		System.out.println("2) Deposit");
		System.out.println("3) withdrawal");
		System.out.println("4) exit");
		
		i=sc.nextInt();
		double amt;
		
		System.out.println("Enter acc number");
		int anum=sc.nextInt();
		sc.hasNextLine();
		 for(int i1=0;i1<accts.size();i1++)
		 {
			acc1=accts.get(i1);
			if(acc1.getAccount_number()==anum)
			{
				
				break;
			}
		 }
		 
		 if(acc1==null)
		 {
			 i=4;
			 System.out.println("Account does not exist");
		 }
		
		
		if(i==1)
		{
			acc1.getAccount();
		}
		
		else if(i==2)
		{
			
			
			System.out.println("enter the amount ");
			amt=sc.nextDouble();
			acc1.deposit(amt);
			System.out.println("Updated Balanc is "+acc1.getBalance());
			
			
			
		}
		else if(i==3)
		{
			System.out.println("enter the amount ");
			amt=sc.nextDouble();
			acc1.withdrawal(amt);
			System.out.println("Updated Balanc is "+acc1.getBalance());
			
		}
		
		}
		
		
		//System.out.println("after first deposit "+acc.getBalance());
		
		//System.out.println("after first withdrawal "+acc.withdrawal(4000));
		
		
		
				

	}

}
