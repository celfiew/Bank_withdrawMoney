package com.company;

public class Account {
    private String dni;
    private String password;
    private Double currentBalance;

    public Account(String dni, String password) {
        this.dni = dni;
        this.password = password;
        setCurrentBalance(1000.00);
    }

    public String getDni() {
        return dni;
    }

    public String getPassword() {
        return password;
    }

    public Double getCurrentBalance() {
        return currentBalance;
    }


    public void setCurrentBalance(Double currentBalance) {
        this.currentBalance = currentBalance;
    }
}

