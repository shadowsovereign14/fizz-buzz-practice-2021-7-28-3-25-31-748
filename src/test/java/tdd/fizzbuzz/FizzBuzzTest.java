package tdd.fizzbuzz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {
    FizzBuzz fizzBuzz = new FizzBuzz();
    @Test
    void should_return_1_when_count_off_given_1() {
        String expected = "1";

        String actual = fizzBuzz.countOff(1);

        assertEquals(expected, actual);
    }

    @Test
    void should_return_Fizz_when_countOff_given_3() {
        String expected = "Fizz";

        String actual = fizzBuzz.countOff(3);

        assertEquals(expected, actual);
    }
}
