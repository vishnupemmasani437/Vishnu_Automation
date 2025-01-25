package Testcases;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterClass;

public class Sample {

    // BeforeClass runs once before any tests are executed
    @BeforeClass
    public void setUpClass() {
        System.out.println("BeforeClass: This runs once before any test methods.");
    }

    // BeforeMethod runs before each test method
    @BeforeMethod
    public void setUp() {
        System.out.println("BeforeMethod: This runs before each test method.");
        System.out.println("BeforeMethod: This runs before each test method.....");
    }

    // Sample test method 1
    @Test
    public void testAddition() {
        int result = 5 + 3;
        System.out.println("Test 1: Addition test.");
        // Assert that 5 + 3 equals 8
        Assert.assertEquals(result, 8);
    }

    // Sample test method 2
    @Test
    public void testSubtraction() {
        int result = 5 - 3;
        System.out.println("Test 2: Subtraction test.");
        // Assert that 5 - 3 equals 2
        Assert.assertEquals(result, 2);
    }

    // Sample test method 3 (Failing test)
    @Test
    public void testMultiplication() {
        int result = 5 * 3;
        System.out.println("Test 3: Multiplication test.");
        // Assert that 5 * 3 equals 16 (This will fail because 5 * 3 equals 15)
        Assert.assertEquals(result, 16);
    }

    // AfterMethod runs after each test method
    @AfterMethod
    public void tearDown() {
        System.out.println("AfterMethod: This runs after each test method.");
    }

    // AfterClass runs once after all tests have been executed
    @AfterClass
    public void tearDownClass() {
        System.out.println("AfterClass: This runs once after all test methods.");
    }
}
