package edu.epam.arraytask.util.transformer;

import java.util.ArrayList;
import java.util.Scanner;

public class Transformer {
    private ArrayList<String> arrayList;

    public Transformer(ArrayList<String> arrayList) {
        this.arrayList = arrayList;
    }
    public int[] createArray(){
        int[] result = new int[this.arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            result[i] = Integer.parseInt(arrayList.get(i));
        }
        return result;
    }
}
