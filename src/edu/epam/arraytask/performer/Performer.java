package edu.epam.arraytask.performer;

import java.util.ArrayList;
import java.util.Arrays;

public class Performer {
    private int[] array;

    public Performer(int[] array) {
        this.array = array;
    }

    public int[] findSingleDigits(){
        int[] result = new int[array.length];
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            ArrayList<Integer> numbers = new ArrayList<>();
            int a = array[i];
            boolean checker = true;
            while(a != 0){
                int b = a % 10;
                if(numbers.contains(b)) {
                    checker = false;
                    break;
                }
                else{
                    numbers.add(b);
                    a /= 10;
                }
            }
            if(checker){
                result[counter++] = array[i];
            }
        }
        return Arrays.copyOf(result,counter);
    }
    public void sort(){
        Arrays.sort(this.array);    //change
    }

}