package edu.epam.arraytask.util.reader;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class ReaderFromFile {
    private Scanner scanner;
    ArrayList<String> arrayList;

    public ReaderFromFile(String filePath) throws IOException {
        FileReader fileReader = new FileReader(filePath);
        this.scanner = new Scanner(fileReader);
        this.arrayList = new ArrayList<>();

    }

    public Scanner getScanner() {
        return scanner;
    }
    public ArrayList<String> getArrayList() {
        return arrayList;
    }
    public ArrayList<String> createStringList(){
        while(this.scanner.hasNextLine()){
            this.arrayList.add(this.scanner.nextLine());
        }
        return this.arrayList;
    }
}
