package com.robgthai.sample.javaproject.lesson1.dto.race.fantasy;

import com.robgthai.sample.javaproject.lesson1.dto.race.intelligent.Person;

public class Orc extends Person {

    public Orc() {
    }

    public Orc(String name, String nextOfKin, String position) {
        super(name, nextOfKin, "", position);
    }

    public String getNextOfKin() {
        return nextOfKin;
    }

    public String getPhone() {
        return "Orc needs no phone";
    }

    public String getName() {
        return "Orc am " + super.getName();
    }
}
