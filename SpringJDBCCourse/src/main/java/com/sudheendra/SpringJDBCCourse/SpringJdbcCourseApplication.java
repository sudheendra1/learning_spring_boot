package com.sudheendra.SpringJDBCCourse;

import com.sudheendra.SpringJDBCCourse.model.Student;
import com.sudheendra.SpringJDBCCourse.service.StudentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class SpringJdbcCourseApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringJdbcCourseApplication.class, args);

		Student student = context.getBean(Student.class);
		student.setRollno(105);
		student.setName("Sudheendra");
		student.setMarks(89);

		StudentService service = context.getBean(StudentService.class);
//		service.addStudent(student);


		List<Student> students = service.getStudent();
		System.out.println(students);


	}

}
