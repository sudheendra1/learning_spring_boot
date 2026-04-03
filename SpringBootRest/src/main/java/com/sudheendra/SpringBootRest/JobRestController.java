package com.sudheendra.SpringBootRest;

import com.sudheendra.SpringBootRest.model.JobPost;
import com.sudheendra.SpringBootRest.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "https://localhost:3000")
public class JobRestController {

    @Autowired
    private JobService jobService;


    @GetMapping(path="jobPosts",produces = {"application/json"})
    //can use produces to send only certain type of data formats and prevent user from asking other types
//    @ResponseBody
//    this can be used if any particular one needs to be changed or else can change globally with restcontroller
    public List<JobPost> getAllJobs(){
        System.out.println("jobPosts get method hit");

        return jobService.getAllJobs();
    }

    @GetMapping("jobPost/{id}")
    public JobPost getSingleJobPost(@PathVariable("id") int id){
        //can skip specifying the pathvariable in the bracket if only accepting one variable
        System.out.println("jobPost get method hit");
        return jobService.getJob(id);

    }


    @PostMapping("jobPost")
    //can use consumes here to accepts a type of data format like using produces for get method
    public JobPost addJob(@RequestBody JobPost jobPost){
        jobService.addJob(jobPost);
        System.out.println("jobPost post method hit");
        return jobService.getJob(jobPost.getPostId());

    }

    @PutMapping("jobPost")
    public JobPost updateJob(@RequestBody JobPost jobPost){

        jobService.updateJob(jobPost);
        System.out.println("jobPost put method hit");
        return jobService.getJob(jobPost.getPostId());
    }


    @DeleteMapping("jobPost/{id}")
    public String deleteJob(@PathVariable int id){
        jobService.deleteJob(id);

        System.out.println("jobPost delete method hit");
        return "Deleted";
    }
}
