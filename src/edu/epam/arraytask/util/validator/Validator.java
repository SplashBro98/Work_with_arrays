package edu.epam.arraytask.util.validator;

import java.util.ArrayList;
import java.util.Scanner;

public class Validator {
    public static final String REGEX_DELIMITER = " +";
    public static final String NUMBER_REGEX = "\\d+";

    public Validator() {

    }
    public String[] checkStrings(String[] inputArray) throws NumberFormatException{
        ArrayList<String> result = new ArrayList<>();
        for (String input : inputArray) {
           Scanner scanner = new Scanner(input);
           while(scanner.hasNextLine()){
               String line = scanner.nextLine();
               String[] array = line.split(REGEX_DELIMITER);
               for(String mabyNumber : array){
                   if(mabyNumber.matches(NUMBER_REGEX)){
                       result.add(mabyNumber);
                   }
               }
           }
        }
        return (String[]) result.toArray();
    }

}
