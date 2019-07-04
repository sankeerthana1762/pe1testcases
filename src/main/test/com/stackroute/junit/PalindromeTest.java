package com.stackroute.junit;

import org.junit.*;

import static org.junit.Assert.*;

public class PalindromeTest {

    Palindrome palindromeobj;


    @Before
    public void setUp() {

        System.out.println("Before");
        palindromeobj = new Palindrome();

    }

    @After
    public void tearDown() {
        System.out.println("After");
        palindromeobj = null;
    }

    @BeforeClass
    public static void setup() {

        System.out.println("Before");
//        app = new App();

    }

    @AfterClass
    public static void teardown() {
        System.out.println("After");
//        app=null;
    }
    @Test
    public void givenPolindromeNumberIsLessThan25() {
//        arrange

        String result = palindromeobj.palindromenumber(525);
        assertEquals("", "sum of the even digits is less than 25", result);
    }
    @Test
    public void givenPolindromeNumberIsGreaterThan25() {
//        arrange

        String result = palindromeobj.palindromenumber(6667666);
        assertEquals("", "sum of the even digits is greater than 25", result);
    }
    @Test
    public void givenNumberIsNotaPolindrome() {
//        arrange

        String result = palindromeobj.palindromenumber(5755734);
        assertEquals("", "not palindrome", result);
    }
    @Test
    public void givenNumberShouldReturnErrorMessage() {
//        arrange

        String result = palindromeobj.palindromenumber(-345);
        assertEquals("", "invalid input", result);
    }

}
