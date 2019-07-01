package com.stackroute.junit;

import org.junit.*;

import static org.junit.Assert.*;

public class VowelConsonentTest {


    VowelConsonent obj;


    @Before
    public void setUp() {

        System.out.println("Before");
        obj = new VowelConsonent();

    }

    @After
    public void tearDown() {
        System.out.println("After");
        obj = null;
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
    public void givenStringShouldReturnVowelsandConsonants()
    {
        //Act

        String result = obj.checkVowelorConsonant("sruthi");
        //Assert
        assertEquals("", "consonant consonant vowel consonant consonant vowel", result);


    }
    @Test
    public void givenStringShouldReturnZeroNumberofVowelsandConsonants() {
        //Act

        String result = obj.checkVowelorConsonant("");
        //Assert
        assertEquals("No input given", "", result);
    }
    @Test
    public void givenLetterShouldReturnVowel() {
        //Act

        String result = obj.checkVowelorConsonant("a");
        //Assert
        assertEquals("", "vowel", result);
    }
    @Test
    public void givenLetterShouldReturnConsonant() {
        //Act

        String result = obj.checkVowelorConsonant("b");
        //Assert
        assertEquals("", "consonant", result);
    }





}