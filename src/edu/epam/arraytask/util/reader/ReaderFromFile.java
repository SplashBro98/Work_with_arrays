package edu.epam.arraytask.util.reader;

import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class ReaderFromFile {
    private Scanner scanner;
    private String[] strings;

    public ReaderFromFile(String filePath) throws IOException {
        FileReader fileReader = new FileReader(filePath);
        this.scanner = new Scanner(fileReader);
    }

    public Scanner getScanner() {
        return scanner;
    }

    public String[] getStrings() {
        return strings;
    }

    public String[] createStringArray() {
        int counter = 0;
        this.strings = new String[counter];
        while (this.scanner.hasNextLine()) {
            String buffer = this.scanner.nextLine();
            this.strings = Arrays.copyOf(this.strings,++counter);
            this.strings[counter - 1] = buffer;
        }
        return this.strings;
    }
}
