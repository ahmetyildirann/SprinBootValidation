package com.example.ahmetyildiran.controller;

import com.example.ahmetyildiran.model.Student;
import com.example.ahmetyildiran.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class studentController {

@Autowired
    StudentService studentService;

    @PostMapping("/save")
    ResponseEntity<String> addStudent(@Valid @RequestBody Student student){
    studentService.save(student);
    return ResponseEntity.ok("Student saved");
}

}
