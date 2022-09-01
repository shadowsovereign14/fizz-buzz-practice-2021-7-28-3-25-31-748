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

    @Test
    void should_return_Buzz_when_countOff_given_5() {
        String expected = "Buzz";

        String actual = fizzBuzz.countOff(5);

        assertEquals(expected, actual);
    }

    @Test
    void should_return_Whizz_when_countOff_given_7() {
        String expected = "Whizz";

        String actual = fizzBuzz.countOff(7);

        assertEquals(expected, actual);
    }

    @Test
    void should_return_FizzBuzz_when_countOff_given_15() {
        String expected = "FizzBuzz";

        String actual = fizzBuzz.countOff(15);

        assertEquals(expected, actual);
    }

    @Test
    void should_return_FizzWhizz_when_countOff_given_21() {
        String expected = "FizzWhizz";

        String actual = fizzBuzz.countOff(21);

        assertEquals(expected, actual);
    }

    @Test
    void should_return_BuzzWhizz_when_countOff_given_35() {
        String expected = "BuzzWhizz";

        String actual = fizzBuzz.countOff(35);

        assertEquals(expected, actual);
    }

    @Test
    void should_return_FizzBuzzWhizz_when_countOff_given_105() {
        String expected = "FizzBuzzWhizz";

        String actual = fizzBuzz.countOff(105);

        assertEquals(expected, actual);
    }
}
