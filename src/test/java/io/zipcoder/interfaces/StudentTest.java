package io.zipcoder.interfaces;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class StudentTest extends TestCase {

    //student nick is an instance of a learner...
    @Test
    public void testImplementation(){
    Student nick = new Student(1,"nicky");
    Assert.assertTrue(nick instanceof Learner);
    }
    @Test
    public void testInheritance(){
        Student nick = new Student(2,"nicholas");
        Assert.assertTrue(nick instanceof Person);

    }
    @Test
    public void testLearn() {
        //given
        Student nick = new Student(1,"nicholas");
        Double expected = 10.0;
        //when
        nick.learn(10);
        Double actual = nick.getTotalStudyTime();
        //then
        Assert.assertEquals(actual,expected);
    }

}