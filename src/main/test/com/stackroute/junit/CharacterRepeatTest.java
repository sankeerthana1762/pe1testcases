
package com.stackroute.junitdemo;

        import com.stackroute.junit.CharacterRepeat;
        import org.junit.After;
        import org.junit.Before;
        import org.junit.Test;

        import static org.junit.Assert.*;

public class CharacterRepeatTest {
    CharacterRepeat obj;

    @Before
    public void setUp() {
        System.out.println("Before");
        obj = new CharacterRepeat();
    }

    @After
    public void tearDown() {
        System.out.println("After");
        obj = null;
    }

    @Before
    public void setUpBeforeClass() {
        System.out.println("BeforeClass");

    }

    @After
    public void tearDownAfterClass() {
        System.out.println("AfterClass");

    }

    @Test
    public void givenCharacterShouldReturnLastThreeCharacterRepetition() {
        //Act

        String result = obj.charrepeat("bhanu",3);
        //Assert
        assertEquals("testcase passed", "bhanuanuanuanu", result);

    }

    public void givenCharacterShouldReturnNull()
    {
        //Act

        String result = obj.charrepeat("",4);
        //Assert
        assertEquals("Index out of bound exception", "null", result);

    }
    public void givenCharacterShouldReturnEmptyStringAsNoInputGiven()
    {
        //Act

        String result = obj.charrepeat("",0);
        //Assert
        assertEquals("No input given", "null", result);

    }


}
