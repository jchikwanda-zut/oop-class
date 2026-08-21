package com.zut;

public class Main {
    public static void main(String[] args) {
        BankAccount jacobsAccount = new BankAccount(); // instantiation
        
        jacobsAccount.accountHolder = "Jacob";
        jacobsAccount.balance = 100;

        System.out.println("Before Deposit: " + jacobsAccount.balance);
        jacobsAccount.deposit(100);
        System.out.println("After Deposit: " + jacobsAccount.balance);
    }
}