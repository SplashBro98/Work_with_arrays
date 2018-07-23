package edu.epam.arraytask.reader;

import java.util.Arrays;
import java.util.Scanner;

public class ReaderFromConsole {


    public  String[] readInfo(Scanner scanner) {
        int counter = 0;
        String[] arrayOfStrings = new String[counter];
        while (scanner.hasNextLine()) {
            String input = scanner.nextLine();
            if (input.isEmpty()) {
                break;
            } else {
                arrayOfStrings =  Arrays.copyOf(arrayOfStrings, ++counter);
                arrayOfStrings[counter - 1] = input;
            }
        }
        return arrayOfStrings;
    }
}
