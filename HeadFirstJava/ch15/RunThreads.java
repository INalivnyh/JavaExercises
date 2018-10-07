package ch15;

/**
 * GeekBrains. Java. Level 2. Lesson NUM. HomeWork
 *
 * @author Igor Nalivnyh
 * @version 06.10.2018
 */

public class RunThreads implements Runnable {

    public static void main(String[] args) {
        RunThreads runner = new RunThreads();
        Thread alpha = new Thread(runner);
        Thread beta = new Thread(runner);
        alpha.setName("alpha");
        beta.setName("beta");
        alpha.start();
        beta.start();
    }
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            String threadName = Thread.currentThread().getName();
            System.out.println("сейчас работает " + threadName);

        }
    }
}
