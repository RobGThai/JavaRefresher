package com.robgthai.sample.javaproject.lesson2;

import com.robgthai.sample.javaproject.BaseLesson;
import com.robgthai.sample.javaproject.lesson2.fizzbuzz.BuzzPrinter;
import com.robgthai.sample.javaproject.lesson2.fizzbuzz.FizzBuzzPrinter;
import com.robgthai.sample.javaproject.lesson2.fizzbuzz.FizzPrinter;
import com.robgthai.sample.javaproject.lesson2.fizzbuzz.StandardPrinter;

@SuppressWarnings("unused")
public class Lesson2_HeirarchyDemo extends BaseLesson {

    public static void main (String[] args) throws Exception {
        demo3_buzz();
    }

    private static void demo1_standard() {
        beginMethodPl("demo1_standard");
        StandardPrinter printer = new StandardPrinter();
        pl("1:" + printer.print(1));
        pl("2:" + printer.print(2));
        pl("3:" + printer.print(3));
    }

    private static void demo2_fizz() {
        beginMethodPl("demo2_fizz");
        StandardPrinter printer = new FizzPrinter();
        pl("1:" + printer.print(1));
        pl("2:" + printer.print(2));
        pl("3:" + printer.print(3));
        pl("5:" + printer.print(5));
    }

    private static void demo3_buzz() {
        beginMethodPl("demo3_fizz");
        StandardPrinter printer = new BuzzPrinter();
        pl("1:" + printer.print(1));
        pl("2:" + printer.print(2));
        pl("3:" + printer.print(3));
        pl("5:" + printer.print(5));
        pl("15:" + printer.print(15));
    }

    private static void demo4_fizzbuzz() {
        beginMethodPl("demo4_fizzbuzz");
        StandardPrinter printer = new FizzBuzzPrinter();
        pl("1:" + printer.print(1));
        pl("2:" + printer.print(2));
        pl("3:" + printer.print(3));
        pl("5:" + printer.print(5));
        pl("15:" + printer.print(15));
    }
}
