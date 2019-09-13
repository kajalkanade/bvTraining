package com.bv.execution;

import java.util.Scanner;

import com.bv.model.CurrentAccount;
import com.bv.model.SavingAccount;
import com.bv.serviceimpl.CurrentAccountService;
import com.bv.serviceimpl.SavingAccountService;

public class BankApp {

	public static void main(String[] args) {
		
		Scanner sc = null;
		int choice;
		boolean flag = true;
			while (flag) {
				
				System.out.println("\n" + "Create an Account");
				System.out.println("1. Current" + "\n" + "2. Saving" + "\n" + "3. Exit");
				sc = new Scanner(System.in);
				choice = sc.nextInt();
				switch (choice) {
				case 1: CurrentAccount newCurrent = CurrentAccountService.newAccount();
						CurrentAccountService currentServ = new CurrentAccountService(newCurrent);
						currentServ.chooseOperation();
						break;
				case 2:	SavingAccount newSaving = SavingAccountService.newAccount();
						SavingAccountService savingServ = new SavingAccountService(newSaving);
						savingServ.chooseOperation();
						break;
				case 3: System.out.println("Transaction complete \n");
						flag = false;
					 	break;
				case 4: System.out.println("1) Current Account 2) Saving Account");
						int op = sc.nextInt();
						System.out.println("Enter your acc no.");
						int accNo = sc.nextInt();
						if(op==1) {
							
						}
				default:System.out.println("Enter Valid operation \n");
						break;
				}
				
			}
		
		/*CurrentAccountsRepository currentRepo = new CurrentAccountsRepository();
		System.out.println(currentRepo.getAllAccounts()+ "\n");
		System.out.println(currentRepo.getAccount(111));
		
		
		SavingAccountsRepository savingRepo = new SavingAccountsRepository();
		System.out.println(savingRepo.getAllAccounts());
		System.out.println(savingRepo.getAccount(101));
		SavingAccount savingAccount = new SavingAccount(103, "Kajal", 10000, true);
		System.out.println(savingRepo.addAccount(savingAccount));
		System.out.println(savingRepo.getAllAccounts());
		System.out.println(savingRepo.removeAccount(102));
		System.out.println("After Deletion");
		System.out.println(savingRepo.getAllAccounts());
		*/
		/*
		 * savingAccountService.deposite(500); savingAccountService.withdraw(4600);
		 * //savingAccountService.deposite(1000); savingAccountService.withdraw(350);
		 * savingAccountService.withdraw(350); savingAccountService.deposite(1050);
		 * 
		 * System.out.println("-------------------------------");
		 * 
		 * System.out.println("Acco no: "+salAccount.getAcc_no());
		 * System.out.println("Holder name: "+salAccount.getHolder_name());
		 * System.out.println("Balance: "+salAccount.getBalance());
		 * System.out.println("Credit card Issued: "+((SalaryAccount)
		 * salAccount).isCreditCardIssued());
		 * 
		 * 
		 * SalaryAccountService salaryAccountService = new
		 * SalaryAccountService((SalaryAccount) salAccount);
		 * salaryAccountService.withdraw(1000); salaryAccountService.deposite(100);
		 */

	}

}
