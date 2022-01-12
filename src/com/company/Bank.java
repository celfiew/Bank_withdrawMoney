package com.company;

public class Bank implements interfaceBank {

    private AutenticationService autenticationService;
    private AccountService accountService;
    private CashierService cashierService;

    public Bank(AutenticationService autenticationService, AccountService accountService, CashierService cashierService) {
        this.autenticationService = autenticationService;
        this.accountService = accountService;
        this.cashierService = cashierService;
    }

    @Override
    public void withdrawMoney(String dni, String password, Double amount) {
        Account account = autenticationService.validateUserAndPassword(dni,password);
        if (account != null){
            accountService.getAccount();
            cashierService.giveMoney(amount);
        }
        else{
            System.out.println("We can't authenticate your account");
        }

    }
}
