package com.sudheendra.SpringJDBCCourse.repository;

import com.sudheendra.SpringJDBCCourse.model.Student;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class Studentrepository {

    public void save(Student student){
        System.out.println("Student added to DB");
    }

    public List<Student> findAll(){

        List<Student> students = new ArrayList<>();
        return  students;
    }
}
