package coderkubra.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import coderkubra.hrms.business.abstracts.CvEducationService;
import coderkubra.hrms.core.utilities.results.DataResults;
import coderkubra.hrms.core.utilities.results.Results;
import coderkubra.hrms.entities.concretes.CvEducation;

public class CvEducationControllers {
	
	private CvEducationService cvEducationService;

	@Autowired
	public CvEducationControllers(CvEducationService cvEducationService) {
		super();
		this.cvEducationService = cvEducationService;
	}
	
	@PostMapping("/add")
	public Results add( @RequestBody CvEducation cvEducation){
		return this.cvEducationService.add(cvEducation);
		
	}
	
	@GetMapping("/getall")
	public DataResults<List<CvEducation>> getAll(){
		return this.cvEducationService.getAll();
	}

}
