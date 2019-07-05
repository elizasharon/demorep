package com.sapient.pe.model;

import java.util.Comparator;

class SortByIDASC implements Comparator<BankAccount>
{

	@Override
	public int compare(BankAccount o1, BankAccount o2) {
		// TODO Auto-generated method stub
		
		
		return Integer.valueOf(o1.getAccount_number()).compareTo(o2.getAccount_number());
		
	}
	
}

class SortByIDDSC implements Comparator<BankAccount>
{

	@Override
	public int compare(BankAccount o1, BankAccount o2) {
		// TODO Auto-generated method stub
		
		
		return Integer.valueOf(o2.getAccount_number()).compareTo(o1.getAccount_number());
		
	}
	
}


class SortByName implements Comparator<BankAccount>
{

	@Override
	public int compare(BankAccount o1, BankAccount o2) {
		// TODO Auto-generated method stub
		return o1.getPerson().getName().compareTo(o2.getPerson().getName());
	}
	
}

class SortByIDAge implements Comparator<BankAccount>
{

	@Override
	public int compare(BankAccount o1, BankAccount o2) {
		// TODO Auto-generated method stub
		
		
		return Integer.valueOf(o1.getPerson().getAge()).compareTo(o2.getPerson().getAge());
		
	}
	
}



