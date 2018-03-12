package com.company.Brendan;

import java.util.stream.IntStream;

/**
 * Created by ericjohn1 on 10/25/2016.
 */
public class Equation {

    public static void main(String[] args) {
        System.out.println(createEquation(100));
    }

    public static String createEquation(int num) {

        StringBuilder sb = new StringBuilder();

        int sum = 0;

        for (int i = 1; i <= num; i++) {

            if (i % 3 == 0 || i % 5 == 0) {
                sum += i;
                sb.append("+").append(String.valueOf(i));
            }
        }

        sb.deleteCharAt(0).append("=" + String.valueOf(sum)).append(String.valueOf(sum));

        return sb.toString();

    }

    public static void streamMe() {
        StringBuilder answer = new StringBuilder();

        IntStream.rangeClosed(0, 100).mapToObj(
                i -> i % 3 == 0 ?
                        (i % 5 == 0 ? answer.append(i + "+") : answer.append(i + "+")) :
                        (i % 5 == 0 ? answer.append(i + "+") : null));

        System.out.println(answer.toString());
    }
}
