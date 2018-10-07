package ch15;

/**
 * GeekBrains. Java. Level 2. Lesson NUM. HomeWork
 *
 * @author Igor Nalivnyh
 * @version 06.10.2018
 */

class BankAccount {
    private int balance = 100;

    public int getBalance() {
        return balance;
    }

    public void withdraw(int amount) {
        balance = balance - amount;
    }
}

public class RyanAndMonicaJob implements Runnable {
    private BankAccount account = new BankAccount();

    public static void main(String[] args) {
        RyanAndMonicaJob theJob = new RyanAndMonicaJob();
        Thread one = new Thread(theJob);
        Thread two = new Thread(theJob);
        one.setName("Ryan");
        two.setName("Monika");
        one.start();
        two.start();
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            makeWithdrawд(10);
            if (account.getBalance() < 0) {
                System.out.println("Превышение лимита!");
            }
        }

    }

    private void makeWithdrawд(int amount) {
        if (account.getBalance() >= amount) {
            System.out.println(Thread.currentThread().getName() + "собирается снять деньги");
            try {
                System.out.println(Thread.currentThread().getName() + "идет подремать");
                Thread.sleep(500);

            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + " просыпается");
            account.withdraw(amount);
            System.out.println(Thread.currentThread().getName() + " заканчивает транзакцию");
        } else {
            System.out.println("извините, для клиента" + Thread.currentThread().getName() + "недостаточно денег");
        }

    }
}

