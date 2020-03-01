package io.zipcoder;

import java.util.ArrayList;

public class Student {
    private String firstName;
    private String lastName;
    private ArrayList<Double> examScores;

    public Student() {
        this.firstName = firstName;
        this.lastName = lastName;
        this.examScores = new ArrayList<>(examScores);
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
    
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getExamScores() {
        StringBuilder examScoreString = new StringBuilder();
        for(Double studentGrade : this.examScores) {
            System.out.println(("Exam %d: %.2f%n:", (this.examScores.indexOf(studentGrade)) + 1, studentGrade);
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


