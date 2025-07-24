package com.wdklearn.school_service.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.wdklearn.school_service.entity.School;
import com.wdklearn.school_service.repository.SchoolRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class SchoolService {
    
    private SchoolRepository schoolRepository;
    
    public School addSchool(School school){
        return schoolRepository.save(school);
    }
    public List<School> fetchSchools(){
        return schoolRepository.findAll();
    }
    public School fetchSchoolById(int id){
        return schoolRepository.findById(id).orElse(null);
    }
}
