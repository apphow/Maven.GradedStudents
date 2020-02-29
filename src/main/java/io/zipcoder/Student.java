package io.zipcoder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Logger;

public class Student {
    String firstName;
    String lastName;
    ArrayList<Double> examScores;

    public Student() {
        this.firstName = firstName;
        this.lastName = lastName;
        this.examScores = new ArrayList(Arrays.asList(examScores));

    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }


    public String getLastName() {
        return lastName;
    }
    
    public String setLastName() {
        this.lastName = lastName;
    }

    public String getExamScores() {
        StringBuilder examScoreString = new StringBuilder();
        for(Double studentGrade : this.examScores) {
            System.out.println("Exam %d: %.2f%n:"), (this.examScores.indexOf(studentGrade)) + 1, studentGrade);
        }
        return examScoreString.toString();
    }
    
   public void addExamScore(double examScore) {
        this.examScores.add(examScore);
    }

    public void setExamScores(int examNumber, double newScore) {
        this.examScores.set(examNumber - 1, newScore);
    }
}


