package com.company.StringCal;

/**
 * Created by ericjohn1 on 10/24/2016.
 */
public class Calculator {

    private final String deliimeter = ",|\n";

    public int calculate(String input) throws Exception{
        String[] numbers = input.split(deliimeter);

        if(isEmpty(input)) {
            return 0;
        }
        if(input.length()==1){
            return stringToInt(input);
        }
        else{
            return getSum(numbers);
        }
    }

    private int getSum(String[] numbers) throws Exception {

        findBadInput(numbers);

        int sum = 0;
        for(String current:numbers){
            if (stringToInt(current)> 1000){
                continue;
            }
            sum += stringToInt(current);
        }
        return sum;
    }


    private void findBadInput(String[] numbers) throws Exception{

        for(String current:numbers) {
            if (stringToInt(current) < 0) {
                throw new Exception("Negative Input");
            }
        }
    }

    private boolean isEmpty(String input) {
        return input.isEmpty();
    }

    private int stringToInt(String input){
        return Integer.parseInt(input);
    }
}
