package com.capg.pbms.transactionms.service;

import java.util.List;

import com.capg.pbms.transactionms.model.Customer;
//import com.capg.pbms.transactionms.model.LoanRequest;
import com.capg.pbms.transactionms.model.Transaction;
 
public interface TransactionService {

 	Transaction getLastTransactionById(long transAccountId);
 
 	 List<Customer> getAllAccounts();
 	
  	 List<Transaction> getAllTransactions();
 	
	 Customer addAccount(Customer account) ;
	 
	 double getBalanceById(long accountId) ;
  	 
	 Transaction creditUsingCheque(long accountId,double amount,Transaction transaction) ;
 	
 	 Transaction debitUsingCheque(long accountId,double amount,Transaction transaction) ;
 
	 Transaction creditUsingSlip(long accountId,double amount,Transaction transaction) ;
 	
 	 Transaction debitUsingSlip(long accountId,double amount,Transaction transaction) ;
 	 
 	public List<Transaction> getAllById(long accountId);
 	
 	//public List<Transaction> getAllTransactionById(long transAccountId);
}
