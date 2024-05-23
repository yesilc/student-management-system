package com.projects.studentmanagementsystem;

import com.projects.studentmanagementsystem.entity.Student;
import com.projects.studentmanagementsystem.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}

	@Autowired
	private StudentRepository studentRepository;

	//CommandLineRunner provides method called run. run method executes when we run our springboot application
	@Override
	public void run(String... args) throws Exception {
		/*Student student1 = new Student("Ömercan", "Yeşil", "omercanyesil@gmail.com");
		Student student2 = new Student("Taner", "Arkadakalmaz", "tanerarkadakalmaz@gmail.com");
		Student student3 = new Student("Ali", "Altun", "alialtun@gmail.com");
		List<Student> studentList = new ArrayList<>();
		studentList.add(student1);
		studentList.add(student2);
		studentList.add(student3);
		studentRepository.saveAll(studentList);*/
	}
}
