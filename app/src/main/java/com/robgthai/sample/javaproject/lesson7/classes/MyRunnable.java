package com.robgthai.sample.javaproject.lesson7.classes;

public class MyRunnable implements Runnable {

    private int numberOfRound;

    public MyRunnable(int numberOfRound) {
        this.numberOfRound = numberOfRound;
    }

    @Override
    public void run() {
        int i = 0;
        while(i < numberOfRound) {
            System.out.println("Running: " + ++i);
        }
    }
}
