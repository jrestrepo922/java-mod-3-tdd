import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

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

}