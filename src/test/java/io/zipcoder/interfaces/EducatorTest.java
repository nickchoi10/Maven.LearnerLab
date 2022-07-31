package io.zipcoder.interfaces;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class EducatorTest extends TestCase {
    Student student = new Student(0,"nick");
    Educator kris = Educator.KRIS;
    Students[] students = new Students[5];

    @Test
    public void testTeach(){

        kris.teach(student,20);
        Double actual = kris.timeWorked;
        Double expected=20.0;

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void testLecture(){

    }


}