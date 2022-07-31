package io.zipcoder.interfaces;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class InstructorsTest{

    @Test
    public void InstructorTest(){
        int expected =3;
        int actual = Instructors.getInstance().count();
        Assert.assertEquals(expected,actual);
    }

}