import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {

    private FizzBuzz fizzBuzz;

    @BeforeEach
    void setUp() {
      this.fizzBuzz = new FizzBuzz();
    }

    @Test
    void fizzBuzzStringStartsWithF() {
        String actualValue = fizzBuzz.fizzBuzzString("fun");
        String expectedValue = "Fizz";
        assertEquals(expectedValue, actualValue);
    }
    @Test
    void fizzBuzzStringEndsWithB(){
        String actualValue = fizzBuzz.fizzBuzzString("stab");
        String expectedValue = "Buzz";
        assertEquals(expectedValue, actualValue);
    }

    @Test
    void fizzBuzzStringStartsWithFAndEndsWithB() {
        String actualValue = fizzBuzz.fizzBuzzString("funb");
        String expectedValue = "FizzBuzz";
        assertEquals(expectedValue, actualValue);
    }

    @Test
    void fizzBuzzStringNull() {
        String actualValue = fizzBuzz.fizzBuzzString(null);
        String expectedValue = null;
        assertEquals(expectedValue, actualValue);
    }

    @Test
    void fizzBuzzArrayFilledCorrectlyTest() {
        String[] sampleArr = {"fun", "stab", "funb", "no"};
        String[] actualArr = fizzBuzz.fizzBuzzArray(sampleArr);
        String[] expectedArr = {"Fizz", "Buzz", "FizzBuzz", "no"};
        for(int i = 0; i < sampleArr.length; i++){
            assertEquals(expectedArr[i], actualArr[i]);
        }
        List<String> arr = new ArrayList<String>(Arrays.asList(actualArr));
        System.out.println(arr);
    }

    @Test
    void fizzBuzzArrayNullTest() {
        String[] sampleArr = null;
        String[] actualArr = fizzBuzz.fizzBuzzArray(sampleArr);
        assertEquals(null, actualArr);
    }

    @Test
    void fizzBuzzArrayEmptyTest() {
        String[] sampleArr = {};
        String[] actualArr = fizzBuzz.fizzBuzzArray(sampleArr);
        assertEquals(null, actualArr);
    }

}