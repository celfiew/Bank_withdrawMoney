package com.company;

public class AccountService {

    private Account account;

    public AccountService(Account account) {
        this.account = account;
    }

    public String getAccount(){

        return account.getDni();
    }
}
