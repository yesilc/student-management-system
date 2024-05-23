package com.projects.studentmanagementsystem.service.impl;

import com.projects.studentmanagementsystem.entity.Student;
import com.projects.studentmanagementsystem.repository.StudentRepository;
import com.projects.studentmanagementsystem.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service //we mark Spring beans with @service annotation to indicate that they're holding the business logic.
public class StudentServiceImpl implements StudentService {
    private StudentRepository studentRepository;

    //@Autowired tek bir constructor olduğundan kullanmamıza gerek yok
    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public List<Student> getAllStudent() {
        return studentRepository.findAll();
    }

    @Override
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public Student getStudentById(Long id) {
        return studentRepository.findById(id).get();
    }

    @Override
    public Student updateStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public void deleteStudent(Long id) {
        studentRepository.deleteById(id);
    }


}
