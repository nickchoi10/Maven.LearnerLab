package io.zipcoder.interfaces;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class StudentsTest{

    @Test
    public void test(){
        int expected=5;
        int actual = Students.getInstance().count();

        Assert.assertEquals(expected,actual);
    }

}