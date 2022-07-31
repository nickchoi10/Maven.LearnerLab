package io.zipcoder.interfaces;

public final class Instructor extends Person implements Teacher {

    public Instructor (long id, String name){
        super(id, name);
    }

    public void teach(Learner learner, double numberOfHours) {
        learner.learn(numberOfHours);
    }

    public void lecture(Learner[] learners, double numberOfHours) {
        double numberOfHoursPerLeaner = numberOfHours/learners.length;
        for (int i = 0; i<learners.length; i++){
            learners[i].learn(numberOfHoursPerLeaner);
        }
    }


}
