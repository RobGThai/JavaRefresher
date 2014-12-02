package com.robgthai.sample.javaproject.lesson3.type;

public class SpaceDog extends LoudLeftyDog {

    @Override
    public int countLegs() {
        return super.countLegs() * 2;
    }

    @Override
    public String shakeHand() {
        return super.shakeHand() + "s all 3 of them.";
    }
}
