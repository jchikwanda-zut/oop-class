package com.zut;

public class Main {
    public static void main(String[] args) {
        BankAccount b1 = new BankAccount("Jacob");

        try {
            b1.deposit(100);
            System.out.println("Deposited. New Balance " + b1.getBalance());
        } catch (IllegalArgumentException e) {
            System.out.println("Deposit rejected: "+ e.getMessage());
        } finally {
            System.out.println("Transaction attemped logged");
        }
    }
}



















    /*
Constructors
public class Main {
    public static void main(String[] args) {
        BankAccount b1 = new BankAccount("Jacob Chikwanda", 1000000);
        BankAccount b2 = new BankAccount("Jane Kio");
        BankAccount b3 = new BankAccount();

        b1.getAccountDetails();
        b2.getAccountDetails();
        b3.getAccountDetails();
    }
}
 */


















/* 
Using getters and setters
public class Main {
    public static void main(String[] args) {
        BankAccount b1 = new BankAccount();
        b1.setBalance(400);
        System.out.println(b1.getBalance());
    }
}
*/












/* 
import com.Auditor;
@Description: Testing Access Levels
public class Main {
    public static void main(String[] args) {

        // Testing access levels
        Probe p = new Probe();
        System.out.println("Public: " + p._public);
        System.out.println("Protected: " + p._protected);
        System.out.println("Default or Package-Private: " + p._default);
        // System.out.println("Private: " + p._private);

        // Testing With Auditor Class
        Auditor a = new Auditor();
        a.inspect();
    }
}
*/