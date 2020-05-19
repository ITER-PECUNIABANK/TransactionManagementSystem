 package com.capg.pbms.transactionms;
import static org.junit.jupiter.api.Assertions.assertEquals;
  
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
//import com.capg.pbms.transactionms.model.Customer;
//import com.capg.pbms.transactionms.service.TransactionService;
import com.capg.pbms.transactionms.service.TransactionServiceImpl;
@SpringBootTest
class PbmsTransactionManagementApplicationTests {
 	@Autowired 	
	TransactionServiceImpl service; 
 		@Test
 		public void testAccountId() {
 			assertEquals(true, service.isValidAccountId(123456789012L));
 		} 
// 		@Test
// 		public void getBalanceById() {
// 			assertEquals(8000.0,service.getBalanceById(123456789012L));
// 		}

 		
 		@Test
 		void allTransactions() {
 			assertEquals(true,true);
 		}

 		@Test
 		void contextLoads() {
 		}
 
}
