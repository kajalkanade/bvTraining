package com.bv.model;

public class SavingAccount extends Account {

	private double limit_charges;
	private double min_balance;
	private boolean isSalaryAccount;
	private String acc_type;

	public String getAcc_type() {
		return acc_type;
	}

	public void setAcc_type(String acc_type) {
		this.acc_type = acc_type;
	}

	public void setSalaryAccount(boolean isSalaryAccount) {
		this.isSalaryAccount = isSalaryAccount;
	}

	public boolean isSalaryAccount() {
		return isSalaryAccount;
	}

	public SavingAccount(int acc_no, String holder_name, double balance, boolean isSalaryAccount) {
		super(acc_no, holder_name, balance);
		this.isSalaryAccount = isSalaryAccount;
		this.acc_type = "Saving Account";
		if(isSalaryAccount) {
			this.limit_charges = 0.00;
			this.min_balance = 0;
		}else {
			this.limit_charges = 100;
			this.min_balance = 1000;
		}

		
	}

	public SavingAccount() {
		super();
		// TODO Auto-generated constructor stub
	}

	public double getLimit_charges() {
		return limit_charges;
	}

	public void setLimit_charges(double limit_charges) {
		this.limit_charges = limit_charges;
	}

	public double getMin_balance() {
		return min_balance;
	}

	public void setMin_balance(double min_balance) {
		this.min_balance = min_balance;
	}

	@Override
	public String toString() {
		return "SavingAccount \n Limit Charges" + limit_charges + "\n Minimum Balance: " + min_balance + " \n Is Salary Account: "
				+ isSalaryAccount + "\n Account Type: " + acc_type + "\n Account Number" + getAcc_no() + "\n Account Holder: "
				+ getHolder_name() + "\n Balance: " + getBalance();
	}

	

}
