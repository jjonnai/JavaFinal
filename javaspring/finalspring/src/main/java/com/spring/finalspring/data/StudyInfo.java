package com.spring.finalspring.data;


/*StudyInfo-luokka, jossa privaatti muuttujat, niille getterit ja setterit. Konstuktori käytössä.
*/
public class StudyInfo {

    public StudyInfo(String course,int studentId){
        this.course = course;
        this.studentId = studentId;
        
    }

    private String course;
    private int studentId;  

    public String getCourse() {
        return this.course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public int getStudentId() {
        return this.studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }
}

