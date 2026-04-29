package com.sudheendra.Spring_data_JPA_demo;

import com.sudheendra.Spring_data_JPA_demo.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepo extends JpaRepository<Student,Integer> {

    @Query("Select s from Student s where s.name=?1")
    List<Student> findByName(String name);
    //can work without the query tag but not in all cases
    List<Student> findByMarksGreaterThan(int marks);





}
