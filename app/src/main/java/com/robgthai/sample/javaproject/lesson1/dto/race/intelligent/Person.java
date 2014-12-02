package com.robgthai.sample.javaproject.lesson1.dto.race.intelligent;

public class Person {
    private String name;
    protected String nextOfKin;
    public String position;
    String phoneNumber; // default modifier demo

    /****
     * Constructors
     ****/

    public Person() {

    }

    public Person(String name, String nextOfKin, String phoneNumber, String position) {
        this.name = name;
        this.nextOfKin = nextOfKin;
        this.phoneNumber = phoneNumber;
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
