package com.spring.finalspring.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;
import com.spring.finalspring.data.Student;

@Service
public class StudentService {

/*
 *Lista, jossa luodan uusia studentteja. 
 */
    private List<Student> students = new ArrayList<>();
    public StudentService(){
        
            students.add (new Student("Riitta", "Väisänen", 60, 1));
            students.add (new Student("Heikki", "Heikkinen", 200, 2));
            students.add (new Student("Kaisa", "Laakso", 90, 3));
            students.add (new Student("Eino", "Rinne", 120, 4));
          
    }

    public void addStudent(Student student){
        students.add(student);

    }
    public List<Student> getStudents(){
        return new ArrayList<>(students);
    }
    /*
     * Etsitään student studentId:n kautta, jos id:t eivät täsmää palautetaan null.
     */
    public Student findStudent(int studentId){
     for (Student student : students) {
        if(student.getStudentId() == studentId){
            return student;
        }
     }
     return null;
        
    }
 

    public boolean removeStudent(int studentId){
        Student search = findStudent(studentId);
        if (search != null){
           return students.remove(search);
            
        }
            return false;
        }
    }



