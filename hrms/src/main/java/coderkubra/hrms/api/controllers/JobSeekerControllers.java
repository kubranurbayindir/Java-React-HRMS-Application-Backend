package coderkubra.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import coderkubra.hrms.business.abstracts.JobSeekerService;
import coderkubra.hrms.entities.concretes.Candidates;

@RestController
@RequestMapping("/api/candidates")
public class JobSeekerControllers {

	private JobSeekerService jobSeekerService;

	@Autowired
	public JobSeekerControllers(JobSeekerService jobSeekerService) {
		super();
		this.jobSeekerService = jobSeekerService;
	}
	
	@GetMapping("/getall") 
	public List<Candidates> getAll(){  
		return this.jobSeekerService.getAll();
	}
	
}
