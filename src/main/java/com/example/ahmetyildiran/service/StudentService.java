package com.example.ahmetyildiran.service;


import com.example.ahmetyildiran.model.Student;
import com.example.ahmetyildiran.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

     @Autowired
    StudentRepository studentRepository;

     public void save(Student student){
         studentRepository.save(student);

     }

}
