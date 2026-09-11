package com.zut;

public class Main {
    public static void main(String[] args) {

        BankAccount jacobsAccount = new BankAccount();

        jacobsAccount.accountHolder = "Jacob";
        jacobsAccount.balance = 1;

        System.out.println("Before Deposit: " + jacobsAccount.balance);
        jacobsAccount.deposit(1000);
        System.out.println("After Deposit: " + jacobsAccount.balance);
    }
}