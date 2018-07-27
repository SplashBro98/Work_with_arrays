package edu.epam.arraytask.writer;

public class WriterToConsole {

    public void writeInfo(String[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
