package com.spring.finalspring.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.spring.finalspring.data.Teacher;

@Service

public class teacherService {

    /*
 *Lista, jossa luodan uusia Teacher-olioita, joissa voidaan määritellä opiskelijoiden kurssit ja antaa arvosana. 
 */
    private List<Teacher> grade = new ArrayList<>();
    public teacherService(){
        grade.add(new Teacher(5, "React", 1));
        grade.add(new Teacher(3, "React", 2));
        grade.add(new Teacher(4, "React", 3));
        grade.add(new Teacher(5, "React", 4));
        grade.add(new Teacher(3, "English", 1));
        grade.add(new Teacher(5, "English", 2));
    
    }

  public void addGrades(Teacher teacher){
    grade.add(teacher);
  }
  public List<Teacher> getGrades(){
    return new ArrayList<>(grade);
  }


  public Teacher findGrade(int studentId){
    for (Teacher teacher : grade) {
       if(teacher.getStudentId() == studentId){
           return teacher;
       }
    }
    return null;
       
   }
   

    /*
     * Etsitään ID:n perusteella gradet
     */
    public List<Teacher> getGradesById(int studentId){
        List<Teacher> foundGrades = new ArrayList<>();
        for (Teacher teacher : grade) {
           if(teacher.getStudentId() == studentId){
              foundGrades.add(teacher);
           }
        }
        return foundGrades;
           
       }
       public boolean removeGrades(int studentId){
        Teacher search = findGrade(studentId);
        if (search != null){
           return grade.remove(search);
            
        }
            return false;
        }

  }

