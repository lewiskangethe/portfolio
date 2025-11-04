package com.pluralsight.finance;

public class CheckingAccount extends Account{

    public CheckingAccount(String name, String accountNumber, double balance) {
        super(name, accountNumber, balance);
    }

    public double deposit(double amount){
        double newBalance = getBalance() + amount;
        setBalance(newBalance);
        return newBalance;
    }

    public double withdraw(double amount){
        double newBalance = getBalance() - amount;
        setBalance(newBalance);
        return newBalance;

    }

    @Override
    public double getValue() {
        return getBalance();
    }
}
