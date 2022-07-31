package io.zipcoder.interfaces;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ZipCodeWilmington {
    private static Students students;
    private static Instructors instructors;
    private static ZipCodeWilmington INSTANCE;

    private ZipCodeWilmington(){}

    public static ZipCodeWilmington getInstance(){
        return INSTANCE;
    }

    public static void hostLecture(Teacher teacher, double numberOfHours){
        teacher.lecture(students.toArray(), numberOfHours);
    }

    public static void hostLecture(long id, double numberOfHours){
        Instructor i = (Instructor) instructors.getInstructor(id);
        i.lecture(students.toArray(), numberOfHours);
    }

    public Map<Student, Double> getStudyMap(){
        Map<Student, Double> studyMap = new HashMap<>();
        for(Iterator i = students.iterator();i.hasNext();){
            Student s= (Student) i.next();
            studyMap.put(s,s.getTotalStudyTime());
        }
        return studyMap;
    }

    static{
        try{
            INSTANCE = new ZipCodeWilmington();
            students=Students.getInstance();
            instructors= Instructors.getInstance();
        } catch(Exception e){
            throw new RuntimeException("can not create new instance!");
        }
    }

}
