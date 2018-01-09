package com.company.FizzBuzz;

/**
 * Created by ericjohn1 on 10/12/2016.
 */

public class FizzBuzz{

    public String eval(int number) {
        if (number % 15 == 0){
            return "FizzBuzz";
        }

        else if(number % 3 == 0 ){
            return "Fizz";
        }
        else if(number % 5 == 0){
            return "Buzz";
        }
        else
        return String.valueOf(number);
    }
}