package de.codelution.fizzbuzz;

import org.junit.jupiter.api.Test;

public class FizzBuzzerTests {
    @Test
    public void fizzBuzz_1_returns_1() {
        FizzBuzzer fizzBuzzer = new FizzBuzzer();

        String result = fizzBuzzer.fizzBuzz(1);

        org.junit.jupiter.api.Assertions.assertEquals(result, "1");
    }

    @Test
    public void fizzBuzz_2_returns_2() {
        FizzBuzzer fizzBuzzer = new FizzBuzzer();

        String result = fizzBuzzer.fizzBuzz(2);

        org.junit.jupiter.api.Assertions.assertEquals(result, "2");
    }
}
