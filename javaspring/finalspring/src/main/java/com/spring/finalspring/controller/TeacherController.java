package com.spring.finalspring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.spring.finalspring.data.Teacher;
import com.spring.finalspring.service.teacherService;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


/*
 * Teacherin CRUD-toiminnot
 */
@RestController
public class TeacherController {
    teacherService ts;
    //Depencyinjektio
    @Autowired
    public TeacherController(teacherService ts){
        this.ts = ts;
    }

    @GetMapping("/teacher")
   public List<Teacher> getGrades(){
    return ts.getGrades();
   }

    @PostMapping("/addgrades")
    public String addGrades(@RequestBody Teacher teacher){
        ts.addGrades(teacher);
        return "New grades added";
    }
 
    @GetMapping("/teacher/{studentId}")
    public ResponseEntity<Teacher> getGrade(@PathVariable int studentId){
    Teacher x = ts.findGrade(studentId);
    if(x != null){
        return new ResponseEntity<>(x, HttpStatus.OK);


    }
    return new ResponseEntity<>(HttpStatus.NOT_FOUND);
}
    @DeleteMapping("/deleteGrades")
    public String removeGrades(@RequestBody Teacher teacher){
    ts.removeGrades(teacher.getStudentId());
        return "Studies removed";
    }
}

