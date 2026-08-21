package com.zut;

public class BankAccount {
    // Attributes - instance variables - data
    String accountHolder;
    double balance;

    // State or behaviour
    void deposit(double ammount) {
        this.balance = this.balance + ammount;
    }

    void withdraw(double ammount) {
        if (ammount > this.balance) {
            System.out.println("Insufficient funds...");
            return;
        }
        this.balance = this.balance - ammount;
    }
}
