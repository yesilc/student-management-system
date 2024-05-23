package com.projects.studentmanagementsystem.service;

import com.projects.studentmanagementsystem.entity.Student;

import java.util.List;

public interface StudentService {
      List<Student> getAllStudent();
      Student saveStudent(Student student);
      Student getStudentById(Long id);
      Student updateStudent(Student student);
      void deleteStudent(Long id);
}
