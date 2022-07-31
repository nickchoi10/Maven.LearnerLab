package io.zipcoder.interfaces;

public enum Educator implements Teacher{
    KRIS(1, "Kris"),
    DOLIO(2,"Dolio");

    public final Instructor instructor;
    public double timeWorked;

    Educator(long id, String name){
        this.instructor = new Instructor(id, name);
        this.timeWorked=0.0;
        Instructors.getInstance().add(this.instructor);
    }


    @Override
    public void teach(Learner learner, double numberOfHours) {
        this.instructor.teach(learner,numberOfHours);
        this.timeWorked+=numberOfHours;
    }

    @Override
    public void lecture(Learner[] learners, double numberOfHours) {
        this.instructor.lecture(learners,numberOfHours);
        this.timeWorked+=numberOfHours;
    }
}
