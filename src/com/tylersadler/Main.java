package com.tylersadler;

import com.tylersadler.problemsets.TwoSum;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	    // Classes Used To Solve Problems
        TwoSum twoSum = new TwoSum();

        //Vars used to run functions
        int[] twoSumsArray = new int[] {-5, 10, 15, 5, 100};
        int twoSumsTarget = 0;

        //Calls to run functions and print to console.
        System.out.println(Arrays.toString(twoSum.run(twoSumsArray, twoSumsTarget)));
    }
}
