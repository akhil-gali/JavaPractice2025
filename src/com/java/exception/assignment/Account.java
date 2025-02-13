package com.java.exception.assignment;

public class Account {
	void withdraw(int amount, int balance) throws WithDrawException {
		if (amount > balance) {
			throw new WithDrawException("insufficient Balance");
		} else {
			balance = balance - amount;
			System.out.println("withdraw successfull");
		}
	}

}
