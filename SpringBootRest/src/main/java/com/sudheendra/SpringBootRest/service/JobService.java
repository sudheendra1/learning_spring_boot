package com.sudheendra.SpringBootRest.service;

import com.sudheendra.SpringBootRest.model.JobPost;
import com.sudheendra.SpringBootRest.repository.JobRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class JobService {

    @Autowired
    private JobRepo jobRepo;

    public void  addJob(JobPost jobPost){

        jobRepo.addJob(jobPost);


    }



    public List<JobPost> getAllJobs(){

        return jobRepo.getAllJobs();
    }

    public JobPost getJob(int id){
        return jobRepo.getJob(id);

    }

    public void updateJob(JobPost jobPost) {
        jobRepo.updateJob(jobPost);
    }

    public void deleteJob(int id) {
        jobRepo.deleteJob(id);
    }
}
