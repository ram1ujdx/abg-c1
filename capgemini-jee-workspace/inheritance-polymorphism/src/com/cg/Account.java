package com.cg;

import java.util.Random;

public class Account {

	 private long accNum;
	 private double balance;
	 private Person accHolder;
	 
	 
	 public Account() {
		// TODO Auto-generated constructor stub
	}


	public Account(double balance, Person accHolder) {
		super();
		Random random=new Random();
		accNum=Math.abs(random.nextLong()%1000000) + 99999;
		this.balance = balance;
		this.accHolder = accHolder;
	}


	public long getAccNum() {
		return accNum;
	}


	public void setAccNum(long accNum) {
		this.accNum = accNum;
	}


	public double getBalance() {
		return balance;
	}


	public void setBalance(double balance) {
		this.balance = balance;
	}


	public Person getAccHolder() {
		return accHolder;
	}


	public void setAccHolder(Person accHolder) {
		this.accHolder = accHolder;
	}
	 
	
	public void deposit(double amount) {
		this.balance+=amount;
		System.out.println("Rs. "+amount+" Deposited");
	}
	
	public void withdraw(double amount) {
		if(balance>amount) {
			this.balance-=amount;
			System.out.println("Rs. "+amount+" withdrawn");
		}
		else {
			System.out.println("Insufficient Balance");
		}
	}


	@Override
	public String toString() {
		return "Account [accNum=" + accNum + ", balance=" + balance + ", accHolder=" + accHolder + "]";
	}

	
	 
	 
	 
}
