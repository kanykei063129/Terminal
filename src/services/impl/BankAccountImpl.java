package services.impl;

import classes.BankAccount;
import enums.Bank;

public class BankAccountImpl extends BankAccount {
    private BankAccount[] bankAccount;

    public BankAccountImpl(Bank bankName, double balance, String cardNumber, String password) {
        super(bankName, balance, cardNumber, password);
    }
}
