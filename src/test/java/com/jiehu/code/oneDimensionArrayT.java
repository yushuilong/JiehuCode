package com.jiehu.code;

import com.jiehu.code.array.oneDimensionArray.Candy;
import com.jiehu.code.array.oneDimensionArray.MissingRanges;
import com.jiehu.code.array.oneDimensionArray.SummaryRanges;
import com.jiehu.code.array.oneDimensionArray.ValidMountainArray;

public class oneDimensionArrayT {
    public static void main(String[] args) {
//        validMountainArray();

//        summaryRanges();
//        findMissingRanges();
        getCandy();
    }

    public static void validMountainArray() {
        int[] t = {4, 2, 3};
        ValidMountainArray validMountainArray = new ValidMountainArray();
        System.out.println(validMountainArray.validMountainArray(t));

    }

    public static void summaryRanges() {
        int[] nums = {0, 1, 2, 4, 5, 7};
        SummaryRanges summaryRanges = new SummaryRanges();
        System.out.println(summaryRanges.summaryRanges2(nums));

    }

    public static void findMissingRanges() {
        int[] nums = {0, 1, 3, 50, 75};
        MissingRanges missingRanges = new MissingRanges();
        System.out.println(missingRanges.findMissingRanges(nums, 0, 99));
    }

    public static void getCandy() {
//        int[] leve = {1, 3, 2, 2, 1};
        int[] leve = {1, 2, 87, 87, 87, 2, 1};
        Candy candy = new Candy();
        System.out.println(candy.candy(leve));

    }
}
