package com.javalesson.concurrency.executors;

import static com.javalesson.concurrency.threadslesson.ColorScheme.RED;

public class Launcher {
    private static final int POOL_SIZE = 2;

    public static void main(String[] args) throws InterruptedException {
        boolean isDaemon = false;

        System.out.println(RED + "Starting main thread");
        GCDRunnable r = new GCDRunnable(isDaemon);
        runInOneThread(r, isDaemon);
        System.out.println(RED + "Leaving the main thread");
    }

    private static void runInOneThread(GCDRunnable r, boolean isDaemon) throws InterruptedException {

        Thread th = new Thread(r);
        if(isDaemon){
            th.setDaemon(true);
        }
        th.start();
        Thread.sleep(100);
        th.interrupt();

    }
}
