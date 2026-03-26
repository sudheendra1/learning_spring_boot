package com.sudheendra.SpringJDBCCourse.service;

import com.sudheendra.SpringJDBCCourse.model.Student;
import com.sudheendra.SpringJDBCCourse.repository.Studentrepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    private Studentrepository studentrepository;

    public Studentrepository getStudentrepository() {
        return studentrepository;
    }

    @Autowired
    public void setStudentrepository(Studentrepository studentrepository) {
        this.studentrepository = studentrepository;
    }

    public void addStudent(Student student){
        studentrepository.save(student);
        System.out.println("Student added");
    }

    public List<Student> getStudent(){
        List<Student> students = studentrepository.findAll();
        return  students;

    }
}
