package com.encapsulation;

public class Bank {

	private int Accno;
	private String name;

	private double withdrawamt;
	
	 static double balance =5000;

	public Bank() {
		super();
	}

	public double getWithdrawamt() {
		return withdrawamt;
	}

	public void setWithdrawamt(double withdrawamt) {
		this.withdrawamt = withdrawamt;
	}

	public Bank(int accno, String name, double withdrawamt) {
		super();
		Accno = accno;
		this.name = name;
		this.withdrawamt = withdrawamt;
	}

	public int getAccno() {
		return Accno;
	}

	public void setAccno(int accno) {
		Accno = accno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "Bank [Accno=" + Accno + ", name=" + name + ", balance=" + balance + "]";
	}


}
