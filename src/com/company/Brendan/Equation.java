package com.company.Brendan;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ericjohn1 on 10/25/2016.
 */
public class Equation {

    public static void main(String[] args) {
        createEquation(100);
    }
    public static String createEquation(int num) {

        StringBuilder sb = new StringBuilder();

        int sum = 0;

        for (int i = 1; i <= num; i++) {

            if (i % 3 == 0 || i % 5 ==0) {
                sum += i;
                sb.append("+");
                sb.append(String.valueOf(i));
            }
        }
        if(sb.length()==0){
            return "";
        }
        sb.deleteCharAt(0);
        sb.append("=");
        sb.append(String.valueOf(sum));

        System.out.println(sb);
        return sb.toString();

    }
}
