package com.stackroute.junit;

import org.junit.*;

import static org.junit.Assert.*;

public class ReverseOfStringTest {

    ReverseOfString reverseobj;


    @Before
    public void setUp() {

        System.out.println("Before");
        reverseobj = new ReverseOfString();

    }

    @After
    public void tearDown() {
        System.out.println("After");
        reverseobj = null;
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
//    @Test
//    public void givenStringShouldReturnReverse() {
////        arrange
//
//        String result = reverseobj.reversestring("stack");
//        assertEquals("", "kcats", result);
//    }
//    @Test
//    public void givenStringShouldReturnReverseOfString() {
////        arrange
//
//        String result = reverseobj.reversestring("route");
//        assertEquals("", "etuor", result);
//    }
@Test
public void givenStringShouldReturnReverseofAString()
{

    String result = reverseobj.reverseOfAString("akhila");
    //Assert
    assertEquals("","alihka",result);


}
    @Test
    public void givenStringShouldReturnStringWithExtraSpace()
    {
        //Act
        ReverseOfString reverseobj=new ReverseOfString();
        String result =reverseobj.reverseOfAString("bhanu");
        //Assert
        assertEquals("Test failed due to extra space","unahb ",result);


    }
    @Test
    public void givenStringShouldReturnStringWhichIsIncorrect()
    {
        //Act

        String result = reverseobj.reverseOfAString("bhanu");
        //Assert
        assertEquals("Test failed due to improper reverse","unah",result);


    }


}




