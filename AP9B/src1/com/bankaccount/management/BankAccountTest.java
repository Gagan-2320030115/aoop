package com.bankaccount.management;

public class BankAccountTest {
	public static void main(String[] args) {
        BankAccount account = new BankAccount(1000.0);

        Thread t1 = new Thread(() -> {
            account.deposit(500);
            account.withdraw(200);
        }, "User1");

        Thread t2 = new Thread(() -> {
            account.deposit(300);
            account.withdraw(400);
        }, "User2");

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Final Balance: " + account.getBalance());
    }

}
