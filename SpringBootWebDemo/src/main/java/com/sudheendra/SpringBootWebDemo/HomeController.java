package com.sudheendra.SpringBootWebDemo;

import org.springframework.stereotype.Controller;

@Controller
public class HomeController {

    public String home(){

        System.out.println("Home Method Called");
        return "index.jsp";
    }

}
