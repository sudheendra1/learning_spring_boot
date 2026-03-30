package com.sudheendra.JobApp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class JobController {

    @RequestMapping({"/","home"})
    public String home(){





        return "home";
    }

}
