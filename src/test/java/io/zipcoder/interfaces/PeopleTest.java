package io.zipcoder.interfaces;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Before;

import javax.swing.text.Style;
import java.util.ArrayList;
import java.util.List;

public class PeopleTest extends TestCase {
    Student nick = new Student(0, "nick");
    Student choi = new Student(1, "Choi");
    Student lalisa = new Student(2, "Lalisa");
    Student mano = new Student(3, "Mano");
    List<Person> list = new ArrayList<>();


    public void testAdd() {
        list.add(nick);
        list.add(lalisa);

        Assert.assertEquals(2, list.size());

    }

    public void testFindByID() {
        list.add(nick);
        list.add(lalisa);


    }


    public void testRemovePerson() {
        list.add(nick);
        list.add(lalisa);
        list.add(choi);
        list.remove(choi);

        Assert.assertEquals(2, list.size());
    }
}
