package org.itstep.lesson30_31.multithreadind;

import java.util.concurrent.atomic.AtomicLong;

public class Application3 {

    public static void main(String[] args) throws InterruptedException {
        concurrenceRace();
    }

    // === гонка за ресурсами ===
    private static void concurrenceRace() throws InterruptedException {

        Account account = new Account(100_000);

        Thread depositThread = new Thread(() -> {
            for (int i = 0; i < 20_000; i++) {
                //account.deposit(1);
                account.atomicDeposit(1);
            }
        });

        Thread withdrawThread = new Thread(() -> {
            for (int i = 0; i < 20_000; i++) {
//                account.withdraw(1);
                account.atomicWithdraw(1);
            }
        });

        depositThread.start();
        withdrawThread.start();

        depositThread.join();
        withdrawThread.join();

        System.out.println("balance = " + account.getBalance());


    }


}


class Account {

    final Object locker = new Object();

    long balance;//та double - не є атомарними типами даних

    AtomicLong atomicBalance = new AtomicLong();

    public Account(long balance) {
        this.balance = balance;
        atomicBalance.set(balance);
    }

    public long getAtomicBalance() {
        return this.atomicBalance.get();
    }

    public void setAtomicBalance(long atomicBalance) {
        this.atomicBalance.set(atomicBalance);
    }

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    public /*synchronized*/ void deposit(long amount) {
        synchronized (locker) {
            balance += amount;
        }
    }

    public /*synchronized*/ void withdraw(long amount) {

        synchronized (locker) {
            balance -= amount;
        }

        if (balance < 0) {
            throw new IndexOutOfBoundsException("balance is sub ziro");
        }
    }

    // ============ atomic methods ==============

    public void atomicDeposit(long amount) {
        this.atomicBalance.getAndAdd(amount);
    }

    public  void atomicWithdraw(long amount) {

            this.atomicBalance.getAndAdd(-amount);

        if (atomicBalance.get() < 0) {
            throw new IndexOutOfBoundsException("atomicBalance is sub ziro");
        }
    }


}
