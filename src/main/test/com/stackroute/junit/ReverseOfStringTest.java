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
    }
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
        String result =reverseobj.reverseOfAString("345");
        //Assert
        assertEquals("Test passed","543",result);


    }
    @Test
    public void givenStringShouldReturnStringWhichIsIncorrect()
    {
        //Act

        String result = reverseobj.reverseOfAString("");
        //Assert
        assertEquals("empty string is not accepted",result);


    }
    @Test
    public void givenStringContainsNullShouldReturnNullMessage()
    {
        //Act

        String result = reverseobj.reverseOfAString(null);
        //Assert
        assertEquals("null not accepted",result);


    }


}




