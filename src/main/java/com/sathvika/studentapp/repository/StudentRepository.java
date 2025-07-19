package com.sathvika.studentapp.repository;

import com.sathvika.studentapp.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Long> {
    List<Student> findByNameContainingIgnoreCaseOrId(String name, Long id);
    List<Student> findByNameContainingIgnoreCase(String name); 
}

