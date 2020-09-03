package com.telstra.pack1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account a = new Account(1000);	// Creating new account with initial deposit
		System.out.println(a);
		a.getDeposit(120);	// Depositing in account
		System.out.println(a);
		a.getWithdraw(222);	// Withdrawing from account
		System.out.println(a);

	}

}
