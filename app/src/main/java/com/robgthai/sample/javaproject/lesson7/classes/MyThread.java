package com.robgthai.sample.javaproject.lesson7.classes;

public class MyThread extends Thread {
    private int numberOfRound;

    public MyThread(int numberOfRound) {
        super();
        this.numberOfRound = numberOfRound;
    }

    @Override
    public void run() {
        super.run();

        int i = 0;
        while(i < numberOfRound) {
            System.out.println("Round " + ++i);
        }
    }
}
