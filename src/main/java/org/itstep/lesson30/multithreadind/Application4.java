package org.itstep.lesson30.multithreadind;

import java.util.concurrent.atomic.AtomicLong;

public class Application4 {

    public static void main(String[] args) throws InterruptedException {
        Account1 account1 = new Account1(0);

        new Thread(() -> {
            for (int i = 0; i < 50_000; i++) {
                account1.deposit(1);
            }
        }).start();


        System.out.println("balance = " + account1.getBalance());

        //account1.withdraw(50_000);
        account1.withdraw(50_000);

        System.out.println("balance = " + account1.getBalance());







    }

}

class Account1 {


    long balance;//та double - не є атомарними типами даних


    public Account1(long balance) {
        this.balance = balance;
    }


    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    public synchronized void deposit(long amount) {
        balance += amount;
        notify();
    }

    public synchronized void waitAndWithdraw(long amount) throws InterruptedException {
        while (balance < amount) {
            wait();
        }
        withdraw(amount);
    }


    public synchronized void withdraw(long amount) throws InterruptedException {

        if(balance < amount){
            throw new IndexOutOfBoundsException("balance < amount");
        }

        balance -= amount;

        if (balance < 0) {
            throw new IndexOutOfBoundsException("balance is sub ziro");
        }
    }


}