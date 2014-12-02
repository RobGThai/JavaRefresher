package com.robgthai.sample.javaproject.lesson3;

import com.robgthai.sample.javaproject.BaseLesson;
import com.robgthai.sample.javaproject.lesson3.type.Canine;
import com.robgthai.sample.javaproject.lesson3.type.Dog;
import com.robgthai.sample.javaproject.lesson3.type.LeftyDog;
import com.robgthai.sample.javaproject.lesson3.type.LoudLeftyDog;
import com.robgthai.sample.javaproject.lesson3.type.SpaceDog;

@SuppressWarnings("unused")
public class Lesson3_OverrideDemo extends BaseLesson {

    public static void main (String[] args) throws Exception {
        demo1_dog();
        demo2_leftydog();
        demo3_loudleftydog();
        demo4_spacedog();
    }

    private static void demo1_dog() {
        beginMethodPl("demo1_dog");
        Dog dog = new Dog();
        printDog(dog);
    }

    private static void demo2_leftydog() {
        beginMethodPl("demo2_leftydog");
        Dog dog = new LeftyDog();
        printDog(dog);
    }

    private static void demo3_loudleftydog() {
        beginMethodPl("demo3_loudleftydog");
        Dog dog = new LoudLeftyDog();
        printDog(dog);
    }

    private static void demo4_spacedog() {
        beginMethodPl("demo4_spacedog");
        Dog dog = new SpaceDog();
        printDog(dog);
    }

    private static void demo5_canine() {
        beginMethodPl("demo5_spacedog");
        Canine dog = new SpaceDog();
        printCanine(dog);
    }

    private static void printDog(Dog dog) {
        pl("Bark: " + dog.bark());
        pl("Bite: " + dog.bite());
        pl("ShakeHand: " + dog.shakeHand());
        pl("Legs: " + dog.countLegs());
    }

    private static void printCanine(Canine dog) {
        printDog((Dog) dog);
        pl("Run: " + dog.run());
    }
}
