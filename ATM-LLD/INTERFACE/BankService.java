package INTERFACE;

import CLASS.CardInfo;
import CLASS.Customer;
import CLASS.Transaction;
import CLASS.TransactionDetail;

public interface BankService {
     boolean isValidUser(String pin, CardInfo cardInfo);

     Customer getCustomerDetails(CardInfo cardInfo);

     TransactionDetail executeTransactionDetail(Transaction transaction);


}
