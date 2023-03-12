package com.spring.finalspring.data;

public class Student {
    private String fname;
    private String lname;
    private int studentCredit;
    private int studentId;

/*
 * Student-luokka, jossa privaatti muuttujat, niille getterit ja setterit. Konstuktori käytössä.
 */
    public Student(String fname, String lname,  int studentCredit, int studentId){
        this.fname = fname;
        this.lname = lname;
        this.studentCredit = studentCredit;
        this.studentId = studentId;
    }

    public String getFname() {
        return this.fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return this.lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public int getStudentCredit() {
        return this.studentCredit;
    }

    public void setStudentCredit(int studentCredit) {
        this.studentCredit = studentCredit;
    }
    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    
}
