package com.bv.serviceimpl;

import java.util.Scanner;

import com.bv.model.Account;
import com.bv.model.CurrentAccount;
import com.bv.service.ITransaction;

public class CurrentAccountService implements ITransaction {

	CurrentAccount currentAccount;
	double originalCreditLimit;
	Scanner sc;

	public CurrentAccountService(Account account) {
		super();
		this.currentAccount = (CurrentAccount) account;
		set();

	}

	public void set() {
		currentAccount.setAcc_type("Current");
		currentAccount.setCreditLimit(50000);
		originalCreditLimit = currentAccount.getCreditLimit();
	}

	public static CurrentAccount newAccount() {
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter account number");
		int acc_no = sc1.nextInt();
		System.out.println("Enter Your Name");
		String holder_name = sc1.next();
		System.out.println("Initial amount to be deposited");
		double balance = sc1.nextDouble();
		CurrentAccount newCurrentAccount = new CurrentAccount(acc_no, holder_name, balance);
		System.out.println(newCurrentAccount);
		return newCurrentAccount;
	}
	
	@Override
	public void withdraw(double amount) {
		double balance = currentAccount.getBalance() - amount;
		double creditLimit = currentAccount.getCreditLimit();
		if (balance >= 0) {
			currentAccount.setBalance(balance);
			System.out.println(
					"Your account XXXXXXX" + currentAccount.getAcc_no() % 1000 + " has been debited with Rs." + amount);
			System.out.println("and Your account balance is " + currentAccount.getBalance() + "\n"
					+ "And your credit limit is " + currentAccount.getCreditLimit());
		} else if (balance < 0) {
			currentAccount.setBalance(balance);
			currentAccount.setCreditLimit(creditLimit + balance);
			System.out.println(
					"Your account XXXXXXX" + currentAccount.getAcc_no() % 10 + " has been debited with Rs." + amount);
			System.out.println("and Your account balance is " + currentAccount.getBalance() + "\n"
					+ "And your credit limit is " + currentAccount.getCreditLimit());
		} else {
			System.out.println("Invalid transaction you exceed credit limit");
		}

	}

	@Override
	public void deposite(double amount) {

		if (currentAccount.getBalance() < 0) {
			double bal = currentAccount.getCreditLimit() + amount - originalCreditLimit;
			currentAccount.setCreditLimit(originalCreditLimit);
			currentAccount.setBalance(bal);
			System.out.println(
					"Your account XXXXXXX" + currentAccount.getAcc_no() % 10 + " has been credited with Rs." + amount);
			System.out.println("and Your account balance is " + currentAccount.getBalance() + "\n"
					+ "And your credit limit is " + currentAccount.getCreditLimit());
		} else {
			currentAccount.setBalance(amount);
			System.out.println(
					"Your account XXXXXXX" + currentAccount.getAcc_no() % 10 + " has been credited with Rs." + amount);
			System.out.println("and Your account balance is " + currentAccount.getBalance() + "\n"
					+ "And your credit limit is " + currentAccount.getCreditLimit());

		}

	}
	

	public void chooseOperation() {
		int choice;
		boolean flag = true;
		while (flag) {

			System.out.println("\n" + "Select one of the options below");
			System.out.println(
					"1. Withdraw" + "\n" + "2. Deposite" + "\n" + "3. Display Details" + "\n" + "4. Exit" + "\n");
			sc = new Scanner(System.in);
			choice = sc.nextInt();
			switch (choice) {
			case 1: {
				System.out.println("Enter amount to be withdraw" + "\n");
				withdraw(sc.nextDouble());
				break;
			}

			case 2: {
				System.out.println("Enter amount to be deposite" + "\n");
				deposite(sc.nextDouble());
				break;
			}
			case 3: {
				System.out.println(currentAccount);
				break;
			}
			case 4: {
				System.out.println("Transaction complete\n");
				flag = false;
				break;
			}
			default: {
				System.out.println("Enter Valid operation" + "\n");
				break;
			}
			}

		}

	}

}
