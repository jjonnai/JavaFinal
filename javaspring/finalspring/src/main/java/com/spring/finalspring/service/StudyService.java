package com.spring.finalspring.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;
import com.spring.finalspring.data.StudyInfo;

@Service
public class StudyService {
    private List<StudyInfo> studies = new ArrayList<>();
    
/*
 *Lista, jossa luodan uusia studyinfoja. 
 */
    public StudyService(){
        studies.add(new StudyInfo("Java", 1));
        studies.add(new StudyInfo("Java",2));
        studies.add(new StudyInfo("Java", 3));
        studies.add(new StudyInfo("Java", 4));
        studies.add(new StudyInfo("Cloud Service", 1));
        studies.add(new StudyInfo("Cloud Service", 2));
        studies.add(new StudyInfo("Cloud Service",3));
        studies.add(new StudyInfo("Cloud Servic4", 4));
    }

    public void addStudyInfo(StudyInfo studyInfo){
        studies.add(studyInfo);
    }
    
    public StudyInfo findStudy(int studentId){
        for (StudyInfo studyInfo : studies) {
           if(studyInfo.getStudentId() == studentId){
               return studyInfo;
           }
        }
        return null;
           
       }

       public boolean removeStudies(int studentId){
        StudyInfo search = findStudy(studentId);
        if (search != null){
           return studies.remove(search);
            
        }
            return false;
        }

/*
 * Etsitään opinnot ID:n kautta
 */
        public List<StudyInfo> getStudiesById(int studentId){
            List<StudyInfo> foundStudies = new ArrayList<>();
            for (StudyInfo studyInfo : studies) {
               if(studyInfo.getStudentId() == studentId){
                  foundStudies.add(studyInfo);
               }
            }
            return foundStudies;
               
           }
    
}
