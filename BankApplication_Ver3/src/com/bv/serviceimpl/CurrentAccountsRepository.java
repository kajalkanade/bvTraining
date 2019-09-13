package com.bv.serviceimpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.bv.database.DatabaseClass;
import com.bv.model.Account;
import com.bv.model.CurrentAccount;

public class CurrentAccountsRepository {

	private Map<Integer,CurrentAccount> currentAccounts = DatabaseClass.getCurrentAccount();
	
	public CurrentAccountsRepository(){
		currentAccounts.put(111, new CurrentAccount(111, "1st current acc holder", 4500));
		currentAccounts.put(122, new CurrentAccount(122, "2nd current acc holder", 6500));
		
	}
	
	public List<CurrentAccount> getAllAccounts()
	{
		return new ArrayList<CurrentAccount>(currentAccounts.values());
	}
	
	public CurrentAccount getAccount(int acc_no)
	{
		return currentAccounts.get(acc_no);
	}
	
	public CurrentAccount addAccount(CurrentAccount currentAccount) {
		currentAccount.setAcc_no(currentAccount.getAcc_no()+0);
		currentAccounts.put(currentAccount.getAcc_no(),currentAccount);
		return currentAccount;
	}
	
	public Account updateAccount(CurrentAccount currentAccount)
	{
		if(currentAccount.getHolder_name().isEmpty())
		{
			return null;
		}
		currentAccounts.put(currentAccount.getAcc_no(), currentAccount);
		return currentAccount;
			
	}
	public Account removeAccount(int acc_no)
	{
		return currentAccounts.remove(acc_no);
	}
}