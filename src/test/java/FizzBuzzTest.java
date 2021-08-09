import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FizzBuzzTest {

    @Test
    public void fizzBuzzConverterMultipleOfBothThreeAndFive() {
        FizzBuzzConverter fizzbuzz = new FizzBuzzConverter();
        assertEquals("FizzBuzz", fizzbuzz.convertToFizzbuzz(15));
    }

    @Test
    public void fizzBuzzConverterMultipleOfThree() {
        FizzBuzzConverter fizzbuzz = new FizzBuzzConverter();
        assertEquals("Fizz", fizzbuzz.convertToFizzbuzz(3));
    }

    @Test
    public void fizzBuzzConverterMultipleOfFive() {
        FizzBuzzConverter fizzbuzz = new FizzBuzzConverter();
        assertEquals("Buzz", fizzbuzz.convertToFizzbuzz(5));
    }

    @Test
    public void fizzBuzzConverterReturnsNormalNumberAsItIs() {
        FizzBuzzConverter fizzbuzz = new FizzBuzzConverter();
        assertEquals("1", fizzbuzz.convertToFizzbuzz(1));
        assertEquals("2", fizzbuzz.convertToFizzbuzz(2));
    }

    @Test
    public void mainTest() {
        for (int i = 1; i <= 100; i++) {
            FizzBuzzConverter fizzbuzz = new FizzBuzzConverter();
            System.out.println(fizzbuzz.convertToFizzbuzz(i));
        }
    }
}
