package com.Springboot.Student.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Springboot.Student.Entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

}