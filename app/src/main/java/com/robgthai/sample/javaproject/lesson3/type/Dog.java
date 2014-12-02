package com.robgthai.sample.javaproject.lesson3.type;

public class Dog extends Canine{

    @Override
    public String bark() {
        return "Woof";
    }

    public String shakeHand() {
        return "Use right hand";
    }

    public String bite() {
        return "Not in a mood";
    }

    public int countLegs() {
        return 4;
    }

    @Override
    protected int runningDistance() {
        return 4;
    }
}
