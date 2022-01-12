package com.company;

import java.util.List;

public class AutenticationService {

    private List<Account> accounts;

    public AutenticationService(List<Account> accounts) {
        this.accounts = accounts;
    }

    public Account validateUserAndPassword(String dni, String password){
        Account account = null;
        for (Account a: this.accounts){
            if(a.getDni().equals(dni) && a.getPassword().equals(password))
                account = a;
        }
        return account;
    }




}
