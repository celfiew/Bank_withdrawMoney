package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

    Account account1 = new Account("1152447985","shakeandbake");
    Account account2 = new Account("123456","local");
    Bank BBVA = new Bank(new AutenticationService(Arrays.asList(account1,account2)), new AccountService(account1), new CashierService(account1));
    BBVA.withdrawMoney("1152447985","shakeandbake",500.00);
    }
}
