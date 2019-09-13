package com.bv.database;

import java.util.HashMap;
import java.util.Map;

import com.bv.model.Account;
import com.bv.model.CurrentAccount;
import com.bv.model.SavingAccount;

public class DatabaseClass {

	private static Map<Integer, SavingAccount> savingAccount = new HashMap<>();
	private static Map<Integer, CurrentAccount> currentAccount = new HashMap<>();

	public static Map<Integer, SavingAccount> getSavingAccount() {
		return savingAccount;
	}

	public static Map<Integer, CurrentAccount> getCurrentAccount() {
		return currentAccount;
	}

}
