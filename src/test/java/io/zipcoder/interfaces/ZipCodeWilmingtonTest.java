package io.zipcoder.interfaces;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

import java.util.Map;

public class ZipCodeWilmingtonTest extends TestCase {

    ZipCodeWilmington zcw = ZipCodeWilmington.getInstance();
    Map<Student, Double> studyMap = zcw.getStudyMap();


    @Test
    public void testHostLecture() {
    }
}