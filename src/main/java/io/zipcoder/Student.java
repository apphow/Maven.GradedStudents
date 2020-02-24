package io.zipcoder;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class Student {
    private String firstName;
    private String lastName;
    private ArrayList<Double> examScores;

    public Student(String firstName, String lastName, ArrayList<Double> examScores) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.examScores = examScores;
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


    public int getNumberOfExamsTaken() {
        return examScores.size();
    }

    public String getExamScores() {
        return "Exam Scores:\n" +
                "\n\tExam 1 -> " + examScores.get(0) +
                "\n\tExam 1 -> " + examScores.get(1) +
                "\n\tExam 1 -> " + examScores.get(2)+
                "\n\tExam 1 -> " + examScores.get(3);

        }
   public void addExamScore(double examScore) {
        this.examScores.add(examScore);
    }

    public void setExamScores(int examNumber, double newScore) {
        this.examScores.set(examNumber -1, newScore);
    }






    }









