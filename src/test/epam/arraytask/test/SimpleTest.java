package test.epam.arraytask.test;

import edu.epam.arraytask.performer.Performer;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class SimpleTest {
    @Test
    public void numbersTest(){
        int[] test = {23,34,55,67,88,91};
        Performer performer = new Performer(test);
        int[] actual = performer.findSingleDigits();
        int[] expected = {23,34,67,91};
        Assert.assertEquals(actual,expected);
    }

    @Test
    public void checkStringTest(){
        ArrayList<String> actual = new ArrayList<>();
        actual.add("fgdfgd");
        actual.add("345dfg");
        actual.add("78");
        actual.add("99");
        ArrayList<String> expected = new ArrayList<String>();
        expected.add("78");
        expected.add("99");
        int counter = 0;
        for(String string : actual){
            Assert.assertEquals(string,expected.get(counter++));
        }
    }
}
