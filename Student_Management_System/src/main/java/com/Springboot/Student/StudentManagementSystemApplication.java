package com.Springboot.Student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.Springboot.Student.Entity.Student;
import com.Springboot.Student.Repository.StudentRepository;

@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}
	@Autowired
	private StudentRepository studentRepository;
	
	@Override
	public void run(String... args) throws Exception{
		
		/*
		Student student1 = new Student("Ruhi_Sharma","ruhi@gmail.com");
		studentRepository.save(student1);
		
		Student student2 = new Student("Bhumika_Yadav","bhumi@gmail.com");
		studentRepository.save(student2);
		
		Student student3 = new Student("Aman_Roy","aman@gmail.com");
		studentRepository.save(student3);
		*/
	}

}
