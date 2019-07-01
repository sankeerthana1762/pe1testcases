package com.stackroute.junit;

import org.junit.*;

import static org.junit.Assert.*;

public class ConditionCheckTest {


    ConditionCheck conditionobj;


    @Before
    public void setUp() {

        System.out.println("Before");
        conditionobj = new ConditionCheck();

    }

    @After
    public void tearDown() {
        System.out.println("After");
        conditionobj = null;
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
    public void EvenAndBetween20And30() {
//        arrange

        String result = conditionobj.even(22);
        assertEquals("", "jerry", result);
    }
    @Test
    public void OddAndBetween20And30() {
//        arrange

        String result = conditionobj.even(23);
        assertEquals("", "Tom", result);
    }
    @Test
    public void NotBetween20And30() {
//        arrange

        String result = conditionobj.even(78);
        assertEquals("", "error", result);
    }



}
