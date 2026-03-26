package com.sudheendra.SpringBootdemo.repository;

import com.sudheendra.SpringBootdemo.model.Laptop;
import org.springframework.stereotype.Repository;

@Repository
public class LaptopRepository {
    public void save(Laptop laptop){
        System.out.println("Laptop data saved");
    }
}
