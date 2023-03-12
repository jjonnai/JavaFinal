package com.spring.finalspring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.spring.finalspring.data.StudyInfo;
import com.spring.finalspring.service.StudyService;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/*
 * StudyControllerin CRUD-toiminnot
 */

@RestController

public class StudyController {
   
    StudyService sser;
    //Depencyinjektio

    @Autowired
    public StudyController(StudyService sser){
        this.sser = sser;
    }

     
    @PostMapping("/addstudies")
    public String addStudyInfo(@RequestBody StudyInfo studyInfo){
        sser.addStudyInfo(studyInfo);
        return "New Studies added";
    }

    @DeleteMapping("/deleteStudies")
    public String removeStudies(@RequestBody StudyInfo studyInfo){
    sser.removeStudies(studyInfo.getStudentId());
    return "Studies removed";
    }

    @GetMapping("/study/{studentId}")
    public ResponseEntity<StudyInfo> getStudent(@PathVariable int studentId){
    StudyInfo x = sser.findStudy(studentId);
    if(x != null){
        return new ResponseEntity<>(x, HttpStatus.OK);
    }
    return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

}
