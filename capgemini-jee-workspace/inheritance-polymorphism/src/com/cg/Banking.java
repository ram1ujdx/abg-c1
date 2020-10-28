package com.cg;

import com.sun.org.apache.bcel.internal.generic.ACONST_NULL;

public class Banking {

	public static void main(String[] args) {
		
		Person person=new Person("Smith",25);
		Account account=new Account();
		account.setAccHolder(person);
		account.setBalance(2000);
		
		account.deposit(5000);
		
		person.setAccount(account);
		System.out.println("Balance = "+account.getBalance());
		
		System.out.println(account);

	}

}
