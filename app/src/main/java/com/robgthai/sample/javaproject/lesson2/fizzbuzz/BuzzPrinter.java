package com.robgthai.sample.javaproject.lesson2.fizzbuzz;

public class BuzzPrinter extends FizzPrinter {

    @Override
    public String print(int number) {
        if(number % 5 == 0) {
            return "Buzz";
        }
        return super.print(number);
    }
}
