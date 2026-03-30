package com.sudheendra.SpringBootWebDemo;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String home(){

        System.out.println("Home Method Called");
        return "index";
    }

//    @RequestMapping("add")
//    public String add(HttpServletRequest request, HttpSession session){
//
//        int num1 = Integer.parseInt(request.getParameter("num1"));
//        int num2 = Integer.parseInt(request.getParameter("num2"));
//        int result = num1+num2;
//
//        session.setAttribute("result",result);
//
//
//        return "result.jsp";
//    }

//    @RequestMapping("add")
//    public String add(@RequestParam("num1") int num1, @RequestParam("num2") int num2, HttpSession session){
//        //can use the request parameter when the variables name in the html code and method mismatch or else they will be autoassigned
//
//        int result = num1+num2;
//
//        session.setAttribute("result",result);
//
//
//        return "result.jsp";
//    }


    @RequestMapping("add")
    public String add(@RequestParam("num1") int num1, @RequestParam("num2") int num2, Model model ){

        int result = num1+num2;

        model.addAttribute("result",result);


        return "result";
    }

}
