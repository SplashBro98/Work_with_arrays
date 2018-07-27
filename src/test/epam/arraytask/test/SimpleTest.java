package test.epam.arraytask.test;

import edu.epam.arraytask.performer.Performer;
import edu.epam.arraytask.reader.ReaderFromConsole;
import edu.epam.arraytask.reader.ReaderFromFile;
import edu.epam.arraytask.transformer.Transformer;
import edu.epam.arraytask.validator.Validator;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.FileReader;
import java.io.IOException;

public class SimpleTest {
    private ReaderFromConsole consoleReader;
    private ReaderFromFile fileReader;
    private Validator validator;
    private Transformer transformer;
    private Performer performer;

    @BeforeClass
    public void setUp(){
        consoleReader = new ReaderFromConsole();
        fileReader = new ReaderFromFile();
        validator = new Validator();
        transformer = new Transformer();
        performer = new Performer();
    }


    @Test
    public void numbersTest() {
        int[] test = {23, 34, 55, 67, 88, 91};
        int[] actual = performer.findSingleDigits(test);
        int[] expected = {23, 34, 67, 91};
        Assert.assertEquals(actual, expected);
    }

    @DataProvider(name = "dataForTest")
    public Object[][] dataForTest(){
        int[] a = {23,34,45,67};
        int[] b = {23,34,45,67};
        int[] c = {22,33,44,55555};
        int[] d = {};
        int[] e = {3735735,7567123};
        int[] f = {};
        return new Object[][]{{a,b},{c,d},{e,f}};
    }
    @Test(dataProvider = "dataForTest")
    public void mainTest(int[] initialArray, int[] expected){
        int[] actual = performer.findSingleDigits(initialArray);
        Assert.assertEquals(actual, expected);
    }


    @DataProvider(name = "dataForSort")
    public Object[][] dataForSort(){
        int[] a = {345,234,189};
        int[] b = {189,234,345};
        int[] c = {94, 56, 8, 75, 123, 6123, 2};
        int[] d = {2, 8, 56, 75, 94, 123, 6123};
        return new Object[][]{{a,b},{c,d}};
    }

    @Test(dataProvider = "dataForTest")
    public void sortTest(int[] actual, int[] expected) {
        actual = performer.customSort(actual);
        Assert.assertEquals(actual,expected);
    }

    @Test
    public void checkStringTest() {
        String[] buffer = {"fgdfgd", "345dfg", "78", "99"};
        String[] actual = validator.checkStrings(buffer);
        String[] expected = {"78","99"};
        Assert.assertEquals(actual,expected);
    }

    @Test
    public void transformTest(){
        String[] startedArray = {"234","12","89719134","238","889"};
        int[] expected = {234,12,89719134,238,889};
        int[] actual = transformer.createIntArray(startedArray);
        Assert.assertEquals(actual,expected);
    }

    @Test
    public void readTest() throws IOException {
        String[] array = fileReader.readInfo("input/check.txt");
        String[] expected = {"345 345 777 234 sdfgsdg34","134","123","456745 sd"};
        Assert.assertEquals(array,expected);
    }
}
