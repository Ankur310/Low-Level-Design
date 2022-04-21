package CLASS;

import INTERFACE.BankService;

public class Atm {
    int atmId;
    Address address;
    Screen screen;
    CardReader cardReader;
    KeyPad keyPad;
    CashDeposit cashDeposit;
    ChequeDeposit chequeDeposit;
    BankService bankService;

}
