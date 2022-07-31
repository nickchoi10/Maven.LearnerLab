package io.zipcoder.interfaces;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class Instructors extends People<Instructor> {

    private static Instructors INSTANCE;


    private Instructors(){

        Instructor kris =new Instructor(1,"Kris");
        Instructor dolio=new Instructor(2,"Dolio");
        Instructor karen=new Instructor(1,"Karen");
        personList = new ArrayList<>(Arrays.asList(kris,dolio,karen));
    }
    static{
        try{
            INSTANCE = new Instructors();
        }catch(Exception e){
            throw new RuntimeException("Can not create new instance");
        }
    }

    static Instructors getInstance(){
        return INSTANCE;
    }



    public List<Instructor> getInstructor(long id){

        for(Instructor i:INSTANCE.toArray()){
            if (i.getId()==id){
                return (List<Instructor>) i;
            }
        }
        return null;
    }


    @Override
    public Instructor[] toArray() {
        return personList.toArray(new Instructor[0]);
    }
}
