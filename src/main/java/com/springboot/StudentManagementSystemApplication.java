package com.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.springboot.entity.Student;
import com.springboot.repository.StudentRepository;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
public class StudentManagementSystemApplication  implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}

	@Autowired
	private StudentRepository studentRepository;
	
	@Override
	public void run(String... args) throws Exception {
		
//		Student s1 = new Student("vinay","kumar","vinay@gmail.com");
//		studentRepository.save(s1);
//		Student s2 = new Student("sai","teja","sai@gmail.com");
//		studentRepository.save(s2);
//		Student s3 = new Student("virat","kohli","virat@gmail.com");
//		studentRepository.save(s3);
	}

}
