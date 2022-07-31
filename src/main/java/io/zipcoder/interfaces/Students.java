package io.zipcoder.interfaces;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public final class Students extends People<Student> {

    private static Students INSTANCE;


    private Students(){

         Student nick =new Student(1,"nick");
         Student ryan=new Student(2,"Ryan");
         Student mike=new Student(1,"Mike");
         Student jiayong=new Student(1,"Jiayong");
         Student troy= new Student(1,"Troy");
         personList = new ArrayList<>(Arrays.asList(nick, ryan,mike,jiayong,troy));
    }
    static{
        try{
            INSTANCE = new Students();
        }catch(Exception e){
            throw new RuntimeException("Can not create new instance");
        }
    }

    static Students getInstance(){
        return INSTANCE;
    }



    public List<Student> getStudents(){
        return personList;
    }


    @Override
    public Student[] toArray() {
        return personList.toArray(new Student[0]);
    }
}
