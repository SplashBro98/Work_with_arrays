package edu.epam.arraytask.validator;

import java.util.Arrays;
import java.util.Scanner;

public class Validator {
    public static final String REGEX_DELIMITER = " +";
    public static final String NUMBER_REGEX = "\\d+";

    public String[] checkStrings(String[] inputArray) {
        int counter = 0;
        String[] result = new String[counter];
        for (String input : inputArray) {
            Scanner scanner = new Scanner(input);
            while(scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if (line.isEmpty()) {
                    continue;
                }
                String[] array = line.split(REGEX_DELIMITER);
                for (String mabyNumber : array) {
                    if (mabyNumber.matches(NUMBER_REGEX) && Integer.parseInt(mabyNumber) < Integer.MAX_VALUE) {
                        result = Arrays.copyOf(result, ++counter);
                        result[counter - 1] = mabyNumber;
                    }
                }
            }
        }
        return result;
    }

}
