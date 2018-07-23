package edu.epam.arraytask.runner;

import edu.epam.arraytask.performer.Performer;
import edu.epam.arraytask.reader.ReaderFromConsole;
import edu.epam.arraytask.reader.ReaderFromFile;
import edu.epam.arraytask.validator.Validator;
import edu.epam.arraytask.transformer.Transformer;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.time.LocalTime;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static Logger logger = LogManager.getLogger();

    public static void main(String[] args) {
        try {

            Scanner scanner = new Scanner(System.in);
            ReaderFromConsole reader = new ReaderFromConsole();
            ReaderFromFile readerFromFile = new ReaderFromFile();
            Validator validator = new Validator();
            Transformer transformer = new Transformer();
            Performer performer = new Performer();


//            String[] array = reader.readInfo(scanner);
//            array = validator.checkStrings(array);
//            int[] numbers = transformer.createIntArray(array);
//            int[] singleDigits = performer.findSingleDigits(numbers);
//            logger.info(Arrays.toString(singleDigits));
//            singleDigits = performer.sort(singleDigits);
//            logger.info(Arrays.toString(singleDigits));
//            logger.log(Level.INFO, LocalTime.now());


            String[] readedArray = readerFromFile.readInfo("input/input.txt");
            readedArray = validator.checkStrings(readedArray);
            int[] digitsAlone = transformer.createIntArray(readedArray);
            int[] result = performer.findSingleDigits(digitsAlone);
            logger.info(Arrays.toString(result));
            result = performer.sort(result);
            logger.info(Arrays.toString(result));
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
