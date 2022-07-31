package io.zipcoder.interfaces;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class InstructorTest extends TestCase {
    Instructor nick = new Instructor(1,"nicholas");
    Student jiayong = new Student(1, "jiayong");
    Learner[] learners;
    int totalStudyTime;

    @Test
    public void testImplementation(){
        Assert.assertTrue(nick instanceof Teacher);
    }
    @Test
    public void testInheritance (){
        Assert.assertTrue(nick instanceof Person);
    }
    @Test
    public void testTeach() {
    nick.teach(jiayong,2);
    nick.teach(jiayong,2);
    Double actual = jiayong.getTotalStudyTime();
    Double expected = 4.0;

    Assert.assertEquals(actual,expected);
    }

    public void testLecture() {
        double numberOfHours = 10.0;
        Learner[] students = new Learner[3];
        students[0]=new Student(1,"nick");
        students[1]=new Student(2,"lloyd");
        students[2]=new Student(3,"troy");

        nick.lecture(students,numberOfHours);
        double expected = numberOfHours/students.length;
        double actual = students[0].getTotalStudyTime();
        Assert.assertEquals(actual, expected, .1);
    }
}