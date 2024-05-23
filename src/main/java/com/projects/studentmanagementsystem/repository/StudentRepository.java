package com.projects.studentmanagementsystem.repository;

import com.projects.studentmanagementsystem.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//@Repository
//JpaRepository has a default implementation SimpleJpaRepository already has @repository annotation
public interface StudentRepository extends JpaRepository<Student, Long> {

    //jpa repository interface by default provide a transaction for all its methods
    //hence we dont have to again add a transactional annotation in a service layer
}
