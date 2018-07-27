package edu.epam.arraytask.writer;

import java.io.FileWriter;
import java.io.IOException;

public class WriterToFile {
    public void writeInfo(FileWriter fileWriter, int[] arrayToWrite) throws IOException {
        try {
            for (int i = 0; i < arrayToWrite.length; i++) {
                fileWriter.write(String.valueOf(arrayToWrite[i] + " "));
            }
        }
        finally {
            fileWriter.close();
        }
    }
}
