package test.epam.arraytask.test;

import edu.epam.arraytask.performer.Performer;
import edu.epam.arraytask.validator.Validator;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class SimpleTest {
    @Test
    public void numbersTest(){
        int[] test = {23,34,55,67,88,91};
        Performer performer = new Performer();
        int[] actual = performer.findSingleDigits(test);
        int[] expected = {23,34,67,91};
        Assert.assertEquals(actual,expected);
    }

    @Test
    public void SortTest(){
        int[] test = {94, 56, 8, 75, 123, 6123, 2};
        Performer performer = new Performer();
        int[] actual = performer.findSingleDigits(test);
        actual = performer.sort(actual);
        int[] expected = {2,8,56,75,94,123,6123};
        for (int i = 0; i < actual.length; i++) {
            Assert.assertEquals(actual[i],expected[i]);
        }

    }

    @Test
    public void checkStringTest(){
        String[] buffer = new String[4];
        buffer[0] = "fgdfgd";
        buffer[1] = "345dfg";
        buffer[2] = "78";
        buffer[3] = "99";
        Validator validator = new Validator();
        String[] actual = validator.checkStrings(buffer);

        String[] expected = new String[2];
        expected[0] = "78";
        expected[1] = "99";
        int counter = 0;
        for(String string : actual){
            Assert.assertEquals(string,expected[counter++]);
        }
    }
}
