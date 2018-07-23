package edu.epam.arraytask.reader;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Arrays;
import java.util.Scanner;

public class ReaderFromFile {
    private static final String path = "input/input.txt";
    private static Logger logger = LogManager.getLogger();



    public String[] readInfo(String filepath)throws FileNotFoundException {
        int counter = 0;
        FileReader fileReader = new FileReader(filepath);
        Scanner scanner = new Scanner(fileReader);
        String[] result = new String[counter];
        while (scanner.hasNextLine()) {
            String buffer = scanner.nextLine();
            result = Arrays.copyOf(result,++counter);
            result[counter - 1] = buffer;
        }
        return result;
    }
}
