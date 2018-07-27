package edu.epam.arraytask.validator;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class Validator {
    public static final String REGEX_DELIMITER = " +";
    public static final String NUMBER_REGEX = "\\d+";
    public static final BigInteger BIGGEST = new BigInteger(String.valueOf(Integer.MAX_VALUE));

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
                    if (mabyNumber.matches(NUMBER_REGEX)) {
                        BigInteger bigInteger = new BigInteger(mabyNumber);
                        if(BIGGEST.compareTo(bigInteger) == 1) {
                            result = Arrays.copyOf(result, ++counter);
                            result[counter - 1] = mabyNumber;
                        }
                    }
                }
            }
        }
        return result;
    }

}
