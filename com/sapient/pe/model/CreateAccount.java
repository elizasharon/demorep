package com.sapient.pe.model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;

public class CreateAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int num=1;
		TreeSet<BankAccount> accts = new TreeSet<BankAccount>(); 
		//List<BankAccount> accts=new ArrayList<>();
		/*
		while(num<3)
		{
		System.out.println("Account Creation");
		
		Scanner sc=new Scanner(System.in);
		
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
		
		*/
		
		
		
		Address addr;
		addr=new Address("ygftudr","jxdfghj","fghkj");
		Person pr;
		pr=new Person(5,"fh","a",1,"gh","dfhg",addr);
		BankAccount acc;
		acc=new Savings(pr,"savings");
		accts.add(acc);
		
		
		pr=new Person(6,"fh","b",2,"gh","dfhg",addr);
		acc=new Savings(pr,"current");
		accts.add(acc);
		
		pr=new Person(7,"fh","c",2,"gh","dfhg",addr);
		acc=new Savings(pr,"salary");
		accts.add(acc);
		
		
		
		
		
		
		Iterator<BankAccount> it = accts.iterator(); 
		
		System.out.println("List elements : ");
		while(it.hasNext())
		{
			BankAccount temp=it.next();
			temp.getAccount();
		}
			
		  
        
        
      //  while (iterator.hasNext()) 
         //   System.out.print(iterator.next() + " "); 
        
      /*  BankAccount acc1;
        for(int i=0;i<accts.size();i++){
        	acc1=accts.get(i);
        	acc1.getAccount();
            
        } 
  */

	}

}
