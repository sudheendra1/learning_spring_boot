package com.sudheendra.SpringBootWebDemo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String home(){

        System.out.println("Home Method Called");
        return "index.jsp";
    }

    @RequestMapping("add")
    public String add(){


        return "result.jsp";
    }

}
