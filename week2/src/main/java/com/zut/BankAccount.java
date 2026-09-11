package com.zut;

public class BankAccount {
    // Attributes - instance variables - data
    public String accountHolder;
    public double balance;

    // State or behaviour
    public void deposit(double ammount) {
        this.balance = this.balance + ammount;
    }

    public void withdraw(double ammount) {
       
        if (ammount > balance) {
            System.out.println("Insufficient funds...");
            return;
        }
        this.balance = this.balance - ammount;
    }
}
