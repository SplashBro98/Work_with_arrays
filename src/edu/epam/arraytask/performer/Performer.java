package edu.epam.arraytask.performer;

import java.util.ArrayList;
import java.util.Arrays;

public class Performer {
    public static  StringBuilder DIGITS_CONTAINER = new StringBuilder("0123456789");

    //Make an dataForTest with numbers where each digit occurs only once
    public int[]  findSingleDigits(int[] ints) {
        int counter = 0;
        int[] array = new int[counter];
        for (int i = 0; i < ints.length; i++) {
            int a = ints[i];
            boolean checker = true;
            while (a != 0 && checker){
                int b = a % 10;
                if (DIGITS_CONTAINER.charAt(b) != '$') {
                    DIGITS_CONTAINER.replace(b,b+1,"$");
                    a /= 10;
                } else {
                    checker = false;
                }
            }
            if (checker) {
                array = Arrays.copyOf(array,++counter);
                array[counter - 1] = ints[i];
            }
            DIGITS_CONTAINER = new StringBuilder("0123456789");
        }
        return array;
    }

    //Insertion customSort
    public int[] customSort(int[] unsortedArray) {
        for (int i = 1; i < unsortedArray.length; i++) {
            int current = unsortedArray[i];
            for (int j = i - 1; j >= 0 && unsortedArray[j] > current; j--) {
                unsortedArray[j + 1] = unsortedArray[j];
                unsortedArray[j] = current;
            }
        }
        return unsortedArray;
    }
}