package edu.epam.arraytask.util.reader;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ReaderFromConsole {
    private static Scanner scanner = new Scanner(System.in);
    private static String[] arrayOfStrings;

    public static Scanner getScanner() {
        return scanner;
    }
    public static String[] getArrayOfStrings() {
        return arrayOfStrings;
    }

    public static void readInfo() {
        int counter = 1;
        String[] buffer = new String[counter];
        while (scanner.hasNextLine()) {
            String input = scanner.nextLine();
            if (input.isEmpty()) {
                break;
            } else {
                String[] result =  Arrays.copyOf(buffer, ++counter);
                result[counter - 1] = input;
            }
        }
    }
}
