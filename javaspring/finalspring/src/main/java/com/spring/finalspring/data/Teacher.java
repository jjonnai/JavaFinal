package com.spring.finalspring.data;

/*
 * Teacher-luokka, jossa privaatti muuttujat, niille getterit ja setterit. Konstuktori käytössä, peritty StudyInfosta.
 */
public class Teacher extends StudyInfo {

    private int grade;

    public Teacher(int grade, String course, int studentId){
        super(course, studentId);
        this.grade = grade;}
        

    public int getGrade() {
        return this.grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }
    }


   

