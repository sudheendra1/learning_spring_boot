package com.sudheendra.Spring_data_JPA_demo;

import com.sudheendra.Spring_data_JPA_demo.model.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringDataJpaDemoApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(SpringDataJpaDemoApplication.class, args);
		StudentRepo repo = context.getBean(StudentRepo.class);

		Student s1 = context.getBean(Student.class);
		Student s2 = context.getBean(Student.class);
		Student s3 = context.getBean(Student.class);

		s1.setRollno(101);
		s1.setName("Sudheendra");
		s1.setMarks(75);

		s2.setRollno(102);
		s2.setName("Kiran");
		s2.setMarks(80);

		s3.setRollno(103);
		s3.setName("Harsh");
		s3.setMarks(70);


//		repo.save(s2);
//		repo.save(s3);


		System.out.println(repo.findAll());



	}

}
