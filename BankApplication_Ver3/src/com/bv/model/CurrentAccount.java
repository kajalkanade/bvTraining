package com.bv.model;

public class CurrentAccount extends Account{
	private double creditLimit;
	public CurrentAccount() {
		super();
		// TODO Auto-generated constructor stub
	}

	public double getCreditLimit() {
		return creditLimit;
	}

	public void setCreditLimit(double creditLimit){
		this.creditLimit = creditLimit;
	}

	public CurrentAccount(int acc_no, String holder_name, double balance) {
		super(acc_no, holder_name, balance);
		this.setAcc_type("Current Account");
		this.creditLimit = 5000;
	}

	@Override
	public String toString() {
		return "CurrentAccount - your creditLimit=" + getCreditLimit()  + super.toString() +"\n";
	}
	
	
	
}
