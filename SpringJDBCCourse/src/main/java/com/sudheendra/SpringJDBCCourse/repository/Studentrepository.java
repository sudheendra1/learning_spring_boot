package com.sudheendra.SpringJDBCCourse.repository;

import com.sudheendra.SpringJDBCCourse.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Repository
public class Studentrepository {

    private JdbcTemplate jdbcTemplate;

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    @Autowired
    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void save(Student student){

        String sql = "insert into student (rollno, name, marks) values(?,?,?)";
       int rows =  jdbcTemplate.update(sql,student.getRollno(),student.getName(),student.getMarks());
        System.out.println(rows +" Student rows effected");
    }

    public List<Student> findAll(){

        String sql = "select * from student";

        RowMapper<Student> mapper = ( rs,  rowNum) -> {
                Student student = new Student();
                student.setRollno(rs.getInt("rollno"));
                student.setName(rs.getString("name"));
                student.setMarks(rs.getInt("marks"));

                return student;

        };

        return jdbcTemplate.query(sql,mapper);
//        List<Student> students = new ArrayList<>();
//        return  students;
    }
}
