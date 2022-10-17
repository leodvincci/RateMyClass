package com.csc363.group2.poc_demo.ClassService;

import com.csc363.group2.poc_demo.ClassEntity.ClassEntity;
import com.csc363.group2.poc_demo.ClassRepo.ClassRepository;
import com.csc363.group2.poc_demo.Repos.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClassService {

    @Autowired
    private ClassRepository classRepository;

    public List<ClassEntity> getAllClasses(){
        System.out.println("Getting All Classes");
        List<ClassEntity> classList = classRepository.findAll();
        return classList;
    }

    public ClassEntity getByDepartmentAndClassNumber(String department, int classNumber){
        System.out.println("Searching for Class By Name and Number!");
        ClassEntity classEntity = classRepository.findByDepartmentAndClassNumber(department,classNumber);
        return classEntity;
    }


    public void addClass(String className, String classDes, String department, int classNumber, double cumGPA, double cumDif,int likes, int dislikes){

        ClassEntity classEntity = new ClassEntity();
        classEntity.setClassName(className);
        classEntity.setClassDescription(classDes);
        classEntity.setDepartment(department);
        classEntity.setClassNumber(classNumber);
        classEntity.setCumGPA(cumGPA);
        classEntity.setCumDif(cumDif);
        classEntity.setLikes(likes);
        classEntity.setDislikes(dislikes);

        classRepository.save(classEntity);
        System.out.println("Class Was Saved");

    }

}
