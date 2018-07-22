package edu.epam.arraytask.util.transformer;

import java.util.ArrayList;

public class Transformer {
    private String[] stringArray;

    public Transformer(String[] stringArray) {
        this.stringArray = stringArray;
    }

    public int[] createArray(){
        int[] result = new int[this.stringArray.length];
        for (int i = 0; i < stringArray.length; i++) {
            result[i] = Integer.parseInt(stringArray[i]);
        }
        return result;
    }
}
