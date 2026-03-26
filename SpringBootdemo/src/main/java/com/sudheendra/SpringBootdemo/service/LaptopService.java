package com.sudheendra.SpringBootdemo.service;

import com.sudheendra.SpringBootdemo.repository.LaptopRepository;
import com.sudheendra.SpringBootdemo.model.Laptop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LaptopService {

    @Autowired
    private LaptopRepository repository;
    public void addLaptop(Laptop laptop){

        System.out.println("Laptop Service called");
        repository.save(laptop);

    }

    public  boolean isGoodForProgramming(Laptop laptop){
        return true;

    }
}
