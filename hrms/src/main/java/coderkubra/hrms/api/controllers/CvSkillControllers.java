package coderkubra.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import coderkubra.hrms.business.abstracts.CvSkillService;
import coderkubra.hrms.core.utilities.results.DataResults;
import coderkubra.hrms.core.utilities.results.Results;
import coderkubra.hrms.entities.concretes.CvSkills;

@RestController
@RequestMapping("/api/cv-skills")
public class CvSkillControllers {
	private CvSkillService cvSkillService;

	@Autowired
	public CvSkillControllers(CvSkillService cvSkillService) {
		super();
		this.cvSkillService = cvSkillService;
	}
	
	@PostMapping("/add")
	public Results add( @RequestBody CvSkills cvSkills){
		return this.cvSkillService.add(cvSkills);
		
	}
	
	@GetMapping("/getall")
	public DataResults<List<CvSkills>> getAll(){
		return this.cvSkillService.getAll();
	}
}
