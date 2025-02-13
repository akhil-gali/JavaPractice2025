package com.java.exception.assignment;

public class AtmWithdraw {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int amount = Integer.parseInt(args[1]);
		int balance = Integer.parseInt(args[0]);
		Account account = new Account();
		try {
			account.withdraw(amount, balance);
		} catch (WithDrawException e) {
			// TODO Auto-generated catch block
			System.err.println(e);
		}

	}

}
