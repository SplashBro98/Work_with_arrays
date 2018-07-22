package edu.epam.arraytask.runner;

import edu.epam.arraytask.performer.Performer;
import edu.epam.arraytask.util.reader.ReaderFromConsole;
import edu.epam.arraytask.util.validator.Validator;
import edu.epam.arraytask.util.transformer.Transformer;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;
import java.time.LocalTime;
import java.util.Arrays;

public class Main {

    private static Logger logger = LogManager.getLogger();

    public static void main(String[] args) {
        try {

            ReaderFromConsole.readInfo();
            Validator checker = new Validator();
            Transformer transformer = new Transformer(checker.checkStrings(ReaderFromConsole.getArrayOfStrings()));
            Performer performer = new Performer(transformer.createArray());
            int[] numbers = performer.findSingleDigits();
            for (int i = 0; i < numbers.length; i++) {
                logger.log(Level.INFO, numbers[i]);
            }


//            ReaderFromFile reader = new ReaderFromFile("input/input.txt");
//            ArrayList<String> arrayToCheck = reader.createStringArray();
//            Validator fileChecker = new Validator();
//            Transformer transformer1 = new Transformer(fileChecker.checkStrings(arrayToCheck));
//            Performer performer = new Performer(transformer1.createArray());
//            int[] digitsAlone = performer.findSingleDigits();
//            for (int i = 0; i < digitsAlone.length; i++) {
//                logger.log(Level.INFO, digitsAlone[i]);
//            }
            performer.sort();
            logger.info(Arrays.toString(numbers));
            logger.log(Level.INFO, LocalTime.now());
        }
//         catch (IOException io) {
//            logger.log(Level.ERROR, io.getMessage());
//        }
        catch (Exception e){
            logger.log(Level.ERROR,e.getMessage());
        }


    }
}
