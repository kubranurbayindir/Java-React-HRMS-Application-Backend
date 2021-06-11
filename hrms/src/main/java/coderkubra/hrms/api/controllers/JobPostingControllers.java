package coderkubra.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import coderkubra.hrms.business.abstracts.JobPostingService;
import coderkubra.hrms.core.utilities.results.DataResults;
import coderkubra.hrms.core.utilities.results.Results;
import coderkubra.hrms.entities.concretes.JobPosting;

@RestController
@RequestMapping("/api/job-posting")
public class JobPostingControllers{
	
	private JobPostingService jobPostingService;

	@Autowired
	public JobPostingControllers(JobPostingService jobPostingService) {
		super();
		this.jobPostingService = jobPostingService;
	} 

	@GetMapping("/getall") 
	public DataResults<List<JobPosting>> getAll(){  
		return this.jobPostingService.getAll();
	}
	
	@PostMapping("/add")
	public void add(@RequestBody JobPosting jobPosting){
		this.jobPostingService.add(jobPosting);
	}
	
	@PostMapping("/update")
	public void update(@RequestBody JobPosting jobPosting){
		this.jobPostingService.update(jobPosting);
	}
	
	@DeleteMapping("/delete")
	public Results delete(@RequestBody JobPosting jobPosting) {
		return this.jobPostingService.delete(jobPosting);
	}
}