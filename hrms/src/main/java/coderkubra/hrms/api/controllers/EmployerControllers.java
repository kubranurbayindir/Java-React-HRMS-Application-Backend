package coderkubra.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import coderkubra.hrms.business.abstracts.EmployerService;
import coderkubra.hrms.entities.concretes.Employers;

@RestController
@RequestMapping("/api/employers")
public class EmployerControllers {

	private EmployerService employerService;

	@Autowired
	public EmployerControllers(EmployerService employerService) {
		super();
		this.employerService = employerService;
	}
	
	@GetMapping("/getall") 
	public List<Employers> getAll(){  
		return this.employerService.getAll();
	}
	
}
