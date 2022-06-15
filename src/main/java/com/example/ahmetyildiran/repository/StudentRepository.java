package com.example.ahmetyildiran.repository;

import com.example.ahmetyildiran.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Long> {


}
