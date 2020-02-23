package io.zipcoder;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Student {
    private String firstName;
    private String lastName;
    private ArrayList<Double> examScores;
    private int numberOfExamsTaken;

    public Student() {
        this.firstName = " ";
        this.lastName = " ";
        this.examScores[] =48.00;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }
    // public void setExamScores(ArrayList<Double>examScores) {
    //  this.examScores = examScores;
    // }
    public ArrayList<Double> getExamScores() {
        return examScores;
    }

    public int getNumberOfExamsTaken() {
        return numberOfExamsTaken;
    }

}
