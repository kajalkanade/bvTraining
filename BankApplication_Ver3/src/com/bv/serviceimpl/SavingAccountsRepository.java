package com.bv.serviceimpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.bv.database.DatabaseClass;
import com.bv.model.Account;
import com.bv.model.SavingAccount;

public class SavingAccountsRepository {

	private Map<Integer, SavingAccount> savingAccounts = DatabaseClass.getSavingAccount();

	public SavingAccountsRepository() {
		savingAccounts.put(101, new SavingAccount(101, "Parvati", 5000, true));
		savingAccounts.put(102, new SavingAccount(102, "Jaya", 7000, false));
	}

	// select all statement in sql
	// select * from accounts
	public List<SavingAccount> getAllAccounts() {
		return new ArrayList<SavingAccount>(savingAccounts.values());
	}

	
	  public SavingAccount getAccount(int acc_no) { return
	  savingAccounts.get(acc_no); }
	 

/*	public void getAccount(int acc_no) {
		Account savingAccount1 = savingAccounts.get(acc_no);

		SavingAccountService savingAccountService1 = new SavingAccountService((SavingAccount) savingAccount1);
		savingAccountService1.chooseOperation();
	}*/

	public SavingAccount addAccount(SavingAccount savingAccount) {
		savingAccount.setAcc_no(savingAccount.getAcc_no() + 0);
		savingAccounts.put(savingAccount.getAcc_no(), savingAccount);
		return savingAccount;
	}

	public Account updateAccount(SavingAccount savingAccount) {
		if (savingAccount.getHolder_name().isEmpty()) {
			return null;
		}
		savingAccounts.put(savingAccount.getAcc_no(), savingAccount);
		return savingAccount;

	}

	public Account removeAccount(int acc_no) {
		return savingAccounts.remove(acc_no);
	}
}
