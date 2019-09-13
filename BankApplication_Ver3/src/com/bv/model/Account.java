package com.bv.model;

public class Account {
	private int acc_no;
	private String holder_name;
	private double balance;
	private String acc_type;
	
	public String getAcc_type() {
		return acc_type;
	}

	public void setAcc_type(String acc_type) {
		this.acc_type = acc_type;
	}

	public Account() {
		// TODO Auto-generated constructor stub
	}

	public Account(int acc_no, String holder_name, double balance) {
		super();
		this.acc_no = acc_no;
		this.holder_name = holder_name;
		this.balance = balance;
	}

	public int getAcc_no() {
		return acc_no;
	}

	public void setAcc_no(int acc_no) {
		this.acc_no = acc_no;
	}

	public String getHolder_name() {
		return holder_name;
	}

	public void setHolder_name(String holder_name) {
		this.holder_name = holder_name;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "\n Account Number=" + acc_no + "\n Holder Name=" + holder_name + "\n Your Balance=" + balance + "\n Account Type="
				+ acc_type;
	}
	
	

}
