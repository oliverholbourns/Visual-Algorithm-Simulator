package VisualAlgorithmSimulator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class TestListParser {

    @Test
    public void TestValidList() {
        ListParser listParser = new ListParser();
        List<Integer> listOfValues = listParser.parseValues("1, 2, 5, 8, 10, 12");

        //check that listOfValues is contains the same amount of numbers as the input
        Assertions.assertEquals(6, listOfValues.size());

        //check that the correct values have been inserted into listOfValues
        Assertions.assertEquals(Arrays.asList(1, 2, 5, 8, 10, 12), listOfValues);
    }

    @Test
    public void TestInvalidList() {
        ListParser listParser = new ListParser();
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            List<Integer> listOfValues = listParser.parseValues("1, 2, 5, hello, 10, 12");
        });
    }
}
