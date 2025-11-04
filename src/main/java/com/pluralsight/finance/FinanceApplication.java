package com.pluralsight.finance;

import com.pluralsight.Gold;
import com.pluralsight.Portfolio;

public class FinanceApplication {
    public static void main(String[] args) {
        CheckingAccount checkingAccount = new CheckingAccount("Lewis's Checking", "548616", 500000);
        CreditCard creditCard = new CreditCard("Lewis's Black Card", "654686", 10000);
        Gold gold = new Gold("Gold watch", 16000, 20);

        Portfolio portfolio = new Portfolio("Lewis's Assets", "Lewis");
        portfolio.add(checkingAccount);
        portfolio.add(gold);
        portfolio.add(creditCard);
        System.out.println(portfolio.getValue());
    }
}
