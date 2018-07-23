package edu.epam.arraytask.transformer;

public class Transformer {
    public int[] createIntArray(String[] stringArray){
        int[] result = new int[stringArray.length];
        for (int i = 0; i < stringArray.length; i++) {
            result[i] = Integer.parseInt(stringArray[i]);
        }
        return result;
    }
}
