package com.company.EricJ;

/**
 * Created by Eric.Johnson on 6/19/2017.
 */
public class Buzz {

    public String eval(Integer n){

        if(n % 15 == 0){
            return "FizzBuzz";
        }
        else if(n % 3 == 0 ){
            return "Fizz";
        }
        else if(n % 5 == 0){
            return "Buzz";
        }
        else
        return n.toString();
    }
}
