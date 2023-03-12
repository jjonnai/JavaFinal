package com.spring.finalspring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.finalspring.data.Student;
import com.spring.finalspring.service.StudentService;



/*
 * Studentin CRUD-operaatiot, lukuunottamatta updatea.
 */
@RestController
public class StudentController {
    
    StudentService ss;
    //DepencyInjektio
    @Autowired
    public StudentController(StudentService ss){
        this.ss = ss;
    }
/*
 * GET-pyyntö, jolla haetaan studentin tiedot.
 */
    @GetMapping("/students")
    public List<Student> getStudents(){
        return ss.getStudents();
    }
/*
 * POST-pyyntö studentin lisäämiseksi.
 */
    @PostMapping("/student")
    public String addStudent(@RequestBody Student student){
        ss.addStudent(student);
        return "Successfull add";
    }
/*
 * DELETE-pyyntä studentin poistamiseksi.
 */
    @DeleteMapping("/deleteStudent")
    public String deleteStudent(@RequestBody Student student){
    ss.removeStudent(student.getStudentId());
    return "Student removed";
}
/* 
 * GET-pyyntö, jolla pyydetään ID:tä vastaava student.
*/
    @GetMapping("/student/{studentId}")
    public ResponseEntity<Student> getStudent(@PathVariable int studentId){
    Student s = ss.findStudent(studentId);

    if(s != null){
        return new ResponseEntity<>(s, HttpStatus.OK);
    }
    return new ResponseEntity<>(HttpStatus.NOT_FOUND);
}



}

     



