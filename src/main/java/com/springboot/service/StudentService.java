package com.springboot.service;

import java.util.List;

import com.springboot.entity.Student;

public interface StudentService {
	
	List<Student> getAllStudents();
	
	Student saveStudent(Student student);
	
	Student getStudentById(Long id);
	
	Student updateStudent(Student student);
	
	void removeStudent(Long id);
}
