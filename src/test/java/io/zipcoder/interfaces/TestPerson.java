package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestPerson {

    @Test
    public void testConstructor(){
        //given
        String expectedString = "nick";
        long expectedLong =1;
        Person test = new Person(expectedLong,expectedString);
        //when
        String actualName = test.getName();
        long actualId = test.getId();
        //then
        Assert.assertEquals(expectedLong,actualId);
        Assert.assertEquals(expectedString, actualName);
    }
    @Test
    public void testSetName(){
        //given

        Person test = new Person(1, "bobby");
        //when
        test.setName("roger");
        //then
        Assert.assertEquals("roger",test.getName());

    }


}
