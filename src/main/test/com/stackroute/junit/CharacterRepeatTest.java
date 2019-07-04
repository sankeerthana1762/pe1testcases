
package com.stackroute.junit;

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


    @Test
    public void givenCharacterShouldReturnLastThreeCharacterRepetition() {
        //Act

        String result = obj.charrepeat("srava",3);
        //Assert
        assertEquals("testcase passed", "sravaavaavaava", result);

    }
    @Test
    public void givenCharacterShouldReturnLastTwoCharacterRepetition() {
        //Act

        String result = obj.charrepeat("srava",2);
        //Assert
        assertEquals("testcase passed", "sravavava", result);

    }
    @Test
    public void givenCharacterShouldReturnNull() {
        //Act

        String result = obj.charrepeat(null,2);
        //Assert
        assertEquals("testcase passed", null, result);

    }

    @After
    public void tearDown() {
        System.out.println("After");
        obj = null;
    }




}
