package com.robgthai.sample.javaproject.lesson1;

import com.robgthai.sample.javaproject.BaseLesson;
import com.robgthai.sample.javaproject.lesson1.dto.race.dumb.CaveMan;
import com.robgthai.sample.javaproject.lesson1.dto.race.fantasy.Orc;
import com.robgthai.sample.javaproject.lesson1.dto.race.intelligent.Person;

@SuppressWarnings("unused")
public class Lesson1_OOPDemo extends BaseLesson {

    public static void main(String[] args) throws Exception {

        demo1_modifier_public();
    }

    private static void demo1_modifier_public() {
        beginMethodPl("demo1_modifier_public");
        Person golf = new Person("Poohdish", "Rob", "0009876543", "Developer");
        pl("What do you do: " + golf.position);
    }

    private static void demo2_modifier_private() {
        beginMethodPl("demo2_modifier_private");
        Person golf = new Person("Poohdish", "Rob", "0009876543", "Developer");
//        String name = golf.name;

        pl("What's your name: " + golf.getName());
    }

    private static void demo3_modifier_protected() {
        beginMethodPl("demo3_modifier_protected");
//        Person golf = new Person("Poohdish", "Rob", "0009876543", "Developer");
//        String nextOfKin = golf.nextOfKin;
//        String nextOfKin = golf.getNextOfKin();

        Orc muu = new Orc("Muu", "Jane", "Orc");
        String nok = muu.getNextOfKin();

        pl("Who's your next of kin: " + nok);
    }

    private static void demo4_modifier_default() {
        beginMethodPl("demo4_modifier_default");
        Person golf = new Person("Poohdish", "Rob", "0009876543", "Developer");
        CaveMan kon = new CaveMan();
        String phoneNumber = kon.getPhoneNumber(golf);
        pl("What's your phone: " + phoneNumber);
    }
}
