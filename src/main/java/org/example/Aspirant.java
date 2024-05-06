package org.example;

public class Aspirant extends Student {

    protected String scientificWork;

    public Aspirant(String firstName, String lastName, String group, double averageMark, String scientificWork) {
        super(firstName, lastName, group, averageMark);
        this.scientificWork = scientificWork;
    }

    @Override
    public int getScholarship(){
        if (averageMark == 5.0) {
            return 200;
        } else {
            return 180;
        }
    }


}
