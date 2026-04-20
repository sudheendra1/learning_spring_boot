package com.sudheendra.Spring_data_JPA_demo;

import com.sudheendra.Spring_data_JPA_demo.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepo extends JpaRepository<Student,Integer> {


}
