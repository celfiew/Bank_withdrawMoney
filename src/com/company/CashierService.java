package com.company;


public class CashierService {

    private Account account;

    public CashierService(Account account) {
        this.account = account;
    }

    public void giveMoney(Double amount){
        if (account.getCurrentBalance()>=amount){
            account.setCurrentBalance(account.getCurrentBalance()-amount);
            System.out.println("Successful withdraw of " + amount + " now your balance is " + account.getCurrentBalance());
        }else{
            System.out.println("You don't have enough money to do this withdraw");
        }
    }


}
