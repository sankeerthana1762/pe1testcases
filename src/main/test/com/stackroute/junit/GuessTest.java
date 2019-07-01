package com.stackroute.junit;

import org.junit.*;

import static org.junit.Assert.*;

public class GuessTest {
    Guess guessobj;


    @Before
    public void setUp() {

        System.out.println("Before");
        guessobj= new Guess();

    }

    @After
    public void tearDown() {
        System.out.println("After");
        guessobj = null;
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
    public void givenNumberShouldReturnLessThanTheOriginalNumber() {
//        arrange

        String result = guessobj.guessnumber(22);
        assertEquals("", "Number guessed is less than the original number", result);
    }
    @Test
    public void givenNumberShouldReturnGreaterThanTheOriginalNumber() {
//        arrange

        String result = guessobj.guessnumber(76);
        assertEquals("", "Number guessed is more than the target", result);
    }
    @Test
    public void givenNumberShouldMatchwithTheOriginalNumber() {
//        arrange

        String result = guessobj.guessnumber(25);
        assertEquals("", "Number gussed matches the original number", result);
    }


}