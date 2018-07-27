package edu.epam.arraytask.runner;

import edu.epam.arraytask.performer.Performer;
import edu.epam.arraytask.reader.ReaderFromConsole;
import edu.epam.arraytask.reader.ReaderFromFile;
import edu.epam.arraytask.validator.Validator;
import edu.epam.arraytask.transformer.Transformer;
import edu.epam.arraytask.writer.WriterToFile;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.FileWriter;
import java.io.IOException;
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


//            String[] dataForTest = reader.readInfo(scanner);
//            dataForTest = validator.checkStrings(dataForTest);
//            int[] numbers = transformer.createIntArray(dataForTest);
//            int[] singleDigits = performer.findSingleDigits(numbers);
//            logger.info(Arrays.toString(singleDigits));
//            singleDigits = performer.customSort(singleDigits);
//            logger.info(Arrays.toString(singleDigits));
//            logger.log(Level.INFO, LocalTime.now());


            String[] readedArray = readerFromFile.readInfo("input/input.txt");
            readedArray = validator.checkStrings(readedArray);
            int[] digitsAlone = transformer.createIntArray(readedArray);
            int[] result = performer.findSingleDigits(digitsAlone);
            logger.info(Arrays.toString(result));
            result = performer.customSort(result);
            logger.info(Arrays.toString(result));
            logger.log(Level.INFO, LocalTime.now());

            FileWriter fileWriter = new FileWriter("output/output.txt");
            WriterToFile writer = new WriterToFile();
            writer.writeInfo(fileWriter,result);

        }
        catch (IOException io) {
            logger.error(io.getMessage());
        }
        catch (Exception e){
            logger.error(e.getMessage());
        }


    }
}
