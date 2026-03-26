package com.sudheendra.SpringBootdemo.service;

import com.sudheendra.SpringBootdemo.model.Laptop;
import org.springframework.stereotype.Service;

@Service
public class LaptopService {

    public void addLaptop(Laptop laptop){

        System.out.println("Laptop Service called");

    }

    public  boolean isGoodForProgramming(Laptop laptop){
        return true;

    }
}
