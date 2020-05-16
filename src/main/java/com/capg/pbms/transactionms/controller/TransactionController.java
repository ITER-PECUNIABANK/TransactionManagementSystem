package com.capg.pbms.transactionms.controller;

// import java.time.LocalDate;
import java.util.List;
  
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


import com.capg.pbms.transactionms.model.Customer;
import com.capg.pbms.transactionms.model.Transaction;
import com.capg.pbms.transactionms.service.TransactionService;


//@CrossOrigin(origins = "http://localhost:4200") 
@RestController
@RequestMapping("/transactions")
public class TransactionController {
	
	@Autowired
	RestTemplate restTemplate;
 	
	@Autowired
	TransactionService transactionservice;
  
//	@GetMapping("/listTransactionsById/id/{id}")
//	public List<Transaction> ListAllTransactionsById(@PathVariable("id") long transAccountId) {
//		return transactionservice.getAllTransactionById(transAccountId);
//	}


	@GetMapping("/allTransactionsById/id/{id}")
	public List<Transaction> getAllTransactionsById(@PathVariable("id") long transAccountId) {
		return transactionservice.getAllById(transAccountId);
	}

	
 	@GetMapping("/lastTransactionsById/id/{id}")
	public Transaction getTransactionById(@PathVariable("id") long transAccountId) {
		return transactionservice.getLastTransactionById(transAccountId);
	}

 
	@GetMapping("/allTransactions")
	public ResponseEntity<List<Transaction>> getAllTransactions(){
		List<Transaction> alltransactions=transactionservice.getAllTransactions();
		return new ResponseEntity<List<Transaction>>(alltransactions,HttpStatus.OK);
	}

 
	@PostMapping("/addAccount")
	public ResponseEntity<Customer> addAccount(@RequestBody Customer customer){
		 transactionservice.addAccount(customer);
		return new ResponseEntity<Customer>(customer,HttpStatus.CREATED); 
	}
 	
 	
 	@GetMapping("/allAccounts")
	public ResponseEntity<List<Customer>> getAllAccounts(){
		List<Customer> allaccounts=transactionservice.getAllAccounts();
		return new ResponseEntity<List<Customer>>(allaccounts,HttpStatus.OK);
	}
	
 	
	@GetMapping("/balanceById/id/{id}")
	public double getBalanceById(@PathVariable("id") long accountId) {
		return transactionservice.getBalanceById(accountId); 
		 
	}
 	
 	
	@PostMapping("/creditcheque/id/{id}/amount/{amount}")
	public Transaction creditUsingCheque(@PathVariable("id") long accountId ,@PathVariable("amount") double amount,@RequestBody Transaction transaction) {
 	  	  return transactionservice.creditUsingCheque(accountId, amount, transaction);
	}
 	 
	@PostMapping("/debitcheque/id/{id}/amount/{amount}")
	 public Transaction debitUsingCheque(@PathVariable("id") long accountId,@PathVariable("amount") double amount,@RequestBody Transaction transaction ) {
 		  return transactionservice.debitUsingCheque(accountId, amount, transaction);
 	}
  
	@PostMapping("/creditslip/id/{id}/amount/{amount}")
	public Transaction creditUsingSlip(@PathVariable("id") long accountId ,@PathVariable("amount") double amount,@RequestBody Transaction transaction) {
		 
 		  return transactionservice.creditUsingSlip(accountId, amount, transaction);
	}

	
	@PostMapping("/debitslip/id/{id}/amount/{amount}")
	 public Transaction debitUsingSlip(@PathVariable("id") long accountId,@PathVariable("amount") double amount,@RequestBody Transaction transaction ) {
 		  return transactionservice.debitUsingSlip(accountId, amount, transaction);
	}
}

//	public Transaction creditUsingChequeFallback(@PathVariable("id") long accountId ,@PathVariable("amount") double amount,@RequestBody Transaction transaction) {
//		
//			Transaction t=new Transaction(accountId,123456789012L,amount, "cheque",LocalDate.now(), 123456, 20000.00, null);
//			return t;
//		}
//}
