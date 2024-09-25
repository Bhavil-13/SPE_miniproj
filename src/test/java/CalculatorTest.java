package org.example;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {

    // Global instance of the Main class or any helper class if needed
    private Main calculator;

    // This method is called before every test case to initialize the calculator instance
    @Before
    public void setup() {
        // Initialize the calculator instance, though in this case it's not necessary
        // since methods are static. You can add more global resources here if needed.
        calculator = new Main();
    }

    // Square root function test
    @Test
    public void testSquareRootPositive() {
        double input = 16.0;
        double expected = 4.0;
        Assert.assertEquals("Square root of positive number failed", expected, Math.sqrt(input), 0.0001);
    }

    @Test
    public void testSquareRootZero() {
        double input = 0.0;
        double expected = 0.0;
        Assert.assertEquals("Square root of zero failed", expected, Math.sqrt(input), 0.0001);
    }

    @Test
    public void testSquareRootNegative() {
        double input = -16.0;
        double result = Math.sqrt(input);
        Assert.assertTrue("Square root of negative number should return NaN", Double.isNaN(result));
    }


//    @Test
//    public void testSquareRootNegative() {
//        double input = -16.0;
//        try {
//            Math.sqrt(input);
//            Assert.fail("Square root of negative number should throw an exception");
//        } catch (ArithmeticException e) {
//            // Test passes
//        }
//    }

    // Factorial function test
    @Test
    public void testFactorialPositive() {
        int input = 5;
        long expected = 120;
        Assert.assertEquals("Factorial of positive number failed", expected, factorial(input));
    }

    @Test
    public void testFactorialZero() {
        int input = 0;
        long expected = 1;
        Assert.assertEquals("Factorial of zero failed", expected, factorial(input));
    }

    @Test
    public void testFactorialNegative() {
        int input = -5;
        try {
            factorial(input);
            Assert.fail("Factorial of negative number should throw an exception");
        } catch (IllegalArgumentException e) {
            // Test passes
        }
    }

    // Natural logarithm function test
    @Test
    public void testNaturalLogPositive() {
        double input = Math.E;
        double expected = 1.0;
        Assert.assertEquals("Natural log of e failed", expected, Math.log(input), 0.0001);
    }

//    @Test
//    public void testNaturalLogZero() {
//        double input = 0.0;
//        try {
//            Math.log(input);
//            Assert.fail("Natural log of zero should throw an exception");
//        } catch (ArithmeticException e) {
//            // Test passes
//        }
//    }
//
//    @Test
//    public void testNaturalLogNegative() {
//        double input = -5.0;
//        try {
//            Math.log(input);
//            Assert.fail("Natural log of negative number should throw an exception");
//        } catch (ArithmeticException e) {
//            // Test passes
//        }
//    }
@Test
public void testNaturalLogZero() {
    double input = 0.0;
    double result = Math.log(input);
    Assert.assertTrue("Natural log of zero should return -Infinity", Double.isInfinite(result) && result < 0);
}

    @Test
    public void testNaturalLogNegative() {
        double input = -5.0;
        double result = Math.log(input);
        Assert.assertTrue("Natural log of negative number should return NaN", Double.isNaN(result));
    }


    // Power function test
    @Test
    public void testPowerFunction() {
        double base = 2.0;
        double exponent = 3.0;
        double expected = 8.0;
        Assert.assertEquals("Power function failed", expected, Math.pow(base, exponent), 0.0001);
    }

    // Helper function to compute factorial (as factorial is not in Math class)
    private long factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Factorial not defined for negative numbers.");
        }
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
