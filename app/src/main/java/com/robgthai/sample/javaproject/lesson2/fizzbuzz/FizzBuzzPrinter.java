package com.robgthai.sample.javaproject.lesson2.fizzbuzz;

public class FizzBuzzPrinter extends FizzPrinter{

    @Override
    public String print(int number) {
        String result = super.print(number);

        if(number % 5 == 0) {
            if(number % 3 == 0) {
                result += "Buzz";
            }else {
                result = "Buzz";
            }
        }

        return result;
    }
}
