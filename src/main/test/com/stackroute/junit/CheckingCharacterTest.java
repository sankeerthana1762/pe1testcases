package com.stackroute.junit;

import org.junit.*;

import static org.junit.Assert.*;

public class CheckingCharacterTest {

    CheckingCharacter checkingobj;


    @Before
    public void setUp() {

        System.out.println("Before");
        checkingobj = new CheckingCharacter();

    }

    @After
    public void tearDown() {
        System.out.println("After");
        checkingobj = null;
    }

    @BeforeClass
    public static void setup() {

        System.out.println("Before");


    }

    @AfterClass
    public static void teardown() {
        System.out.println("After");

    }

    @Test
    public void givenCharacterShouldReturnUppercaseLetter() {


        String result = checkingobj.eachDigit('A');
        assertEquals("", "CAPITAL LETTER", result);
    }

    @Test
    public void givenCharacterShouldReturnLowercaseLetter() {


        String result = checkingobj.eachDigit('b');
        assertEquals("", "SMALL LETTER", result);
    }

    @Test

    public void givenCharacterShouldReturnDigit() {


        String result = checkingobj.eachDigit('6');
        assertEquals("", "DIGIT", result);
    }

    @Test
    public void givenCharacterShouldReturnSpecialCharacter() {


        String result = checkingobj.eachDigit('@');
        assertEquals("", "SPECIAL CHARACTER", result);


    }
}
