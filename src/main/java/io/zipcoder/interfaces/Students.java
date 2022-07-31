package io.zipcoder.interfaces;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public final class Students extends People<Student> {

    private static Students INSTANCE;
    private static List list;

    private Students(){

         Student nick =new Student(1,"nick");
         Student ryan=new Student(2,"Ryan");
         Student mike=new Student(1,"Mike");
         Student jiayong=new Student(1,"Jiayong");
         Student troy= new Student(1,"Troy");
         list = new ArrayList<>(Arrays.asList(nick, ryan,mike,jiayong,troy));
    }
    static{
        try{
            INSTANCE = new Students();
        }catch(Exception e){
            throw new RuntimeException("Can not create new instance");
        }
    }

    private static Students getInstance(){
        return INSTANCE;
    }



    public List<Student> getStudents(){
        return list;
    }


    @Override
    public Student[] toArray() {
        return getStudents().toArray(new Student[0]);
    }
}
