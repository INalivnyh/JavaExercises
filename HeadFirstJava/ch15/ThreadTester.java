package ch15;

/**
 * GeekBrains. Java. Level 2. Lesson NUM. HomeWork
 *
 * @author Igor Nalivnyh
 * @version 06.10.2018
 */

public class ThreadTester {
    public static void main(String[] args) {

        Runnable threadJob = new MyRunnable();
        Thread myThread = new Thread(threadJob);

        myThread.start();

        System.out.println("возвращаемся в метод main");
    }
}

class MyRunnable implements Runnable {

    @Override
    public void run() {
        go();
    }

    public void go() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        doMore();
    }

    private void doMore() {
        System.out.println("Вершина стека");
    }
}
