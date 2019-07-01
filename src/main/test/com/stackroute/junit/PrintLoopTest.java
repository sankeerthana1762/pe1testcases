package com.stackroute.junit;

import org.junit.*;

import static org.junit.Assert.*;

public class PrintLoopTest {


        PrintLoop obj;


        @Before
        public void setUp() {

            System.out.println("Before");
            obj = new PrintLoop();

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
        public void givenNumberShouldPrintTheSeries() {
//        arrange

            String result =obj.loop(4);
            assertEquals("", "1223334444", result);
        }
    @Test
    public void givenNumberShouldPrintTheSeriesasZero() {
//        arrange

        String result =obj.loop(0);
        assertEquals("", "", result);
    }



}