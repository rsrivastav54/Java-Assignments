package com.telstra.pack1;

public class Account {

	private int bId;
	private int moneyDeposited;
	private int moneyWithdrawn;
	private int balance;

	public Account(int moneyDeposited) {
		super();
		this.bId = getCount();
		this.moneyDeposited = getDeposit(moneyDeposited);
		this.moneyWithdrawn = getWithdraw(moneyWithdrawn);
		this.balance = getBalance();
	}

	@Override
	public String toString() {
		return "Account [bId=" + bId + ", balance=" + balance + "]";
	}

	private static int count;

	static {
		count = 0;
	}

	private static int getCount() {
		return (++count);
	}

	public int getDeposit(int deposit) {
		balance += deposit;
		return deposit;
	}

	public int getWithdraw(int withdraw) {
		balance -= withdraw;
		return withdraw;
	}

	private int getBalance() {
		return balance;
	}

}
