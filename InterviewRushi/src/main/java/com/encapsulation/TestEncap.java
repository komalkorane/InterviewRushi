package com.encapsulation;

public class TestEncap {

	public static void withdraw(Bank b) throws InsufficientAmount {
		if (b.balance > b.getWithdrawamt()) {

			System.out.println("Amount Withdraw :="+b.getWithdrawamt());
			// logic for amount withdraw
		} else {
			throw new InsufficientAmount("Amount too Large...!!!");
		}
	}

	public static void main(String[] args) throws InsufficientAmount {

		Bank b = new Bank(1234, "AAA", 4000);
		TestEncap.withdraw(b);
	}

}
