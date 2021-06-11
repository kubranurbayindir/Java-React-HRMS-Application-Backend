package coderkubra.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import coderkubra.hrms.business.abstracts.CvExperienceService;
import coderkubra.hrms.core.utilities.results.DataResults;
import coderkubra.hrms.core.utilities.results.Results;
import coderkubra.hrms.entities.concretes.CvExperience;

@RestController
@RequestMapping("/api/cv-experiences")
public class CvExperienceControllers {

	private CvExperienceService cvExperienceService;

	@Autowired
	public CvExperienceControllers(CvExperienceService cvExperienceService) {
		super();
		this.cvExperienceService = cvExperienceService;
	}
	
	@PostMapping("/add")
	public Results add( @RequestBody CvExperience cvExperience){
		return this.cvExperienceService.add(cvExperience);
		
	}
	
	@GetMapping("/getall")
	public DataResults<List<CvExperience>> getAll(){
		return this.cvExperienceService.getAll();
	}
}
