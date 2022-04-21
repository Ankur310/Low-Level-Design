package CLASS;

import ENUMS.CustomerStatus;
import INTERFACE.BankService;

public class Customer {
    String firstName;
    String lastName;
    CardInfo cardInfo;
    Account account;
    BankService bankServiceObj;
    CustomerStatus customerStatus;
}
