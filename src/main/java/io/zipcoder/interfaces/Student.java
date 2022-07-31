package io.zipcoder.interfaces;

public class Student extends Person implements Learner{

    double totalStudyTime;

    //you can extend non abstract classs, here below your calling an constructor of person
    public Student (long id,String name){
        super(id,name);
    }



    public void learn(double numberOfHours) {
        totalStudyTime +=numberOfHours;
    }

    public Double getTotalStudyTime() {
        return totalStudyTime;
    }
}
