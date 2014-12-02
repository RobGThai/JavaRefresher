package com.robgthai.sample.javaproject.lesson5.classes.games;

public class TwoInOne<SideA, SideB> {
    private SideA sideA;
    private SideB sideB;

    public TwoInOne(SideA gameA, SideB gameB) {
        sideA = gameA;
        sideB = gameB;
    }

    @Override
    public String toString() {
        return String.format("%s OR %s", sideA.toString(), sideB.toString());
    }
}
