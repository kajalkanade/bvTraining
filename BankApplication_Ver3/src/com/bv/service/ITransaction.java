package com.bv.service;

import com.exception.InsufficientBalanceException;

public interface ITransaction {

	public void withdraw(double amount) throws InsufficientBalanceException;
	public void deposite(double amount);
	
}
