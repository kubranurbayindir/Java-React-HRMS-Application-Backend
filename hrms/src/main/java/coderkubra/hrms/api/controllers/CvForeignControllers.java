package coderkubra.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import coderkubra.hrms.business.abstracts.CvForeignService;
import coderkubra.hrms.core.utilities.results.DataResults;
import coderkubra.hrms.core.utilities.results.Results;
import coderkubra.hrms.entities.concretes.CvForeignLanguage;

@RestController
@RequestMapping("/api/cv-foreign-language")
public class CvForeignControllers {
	
	private CvForeignService cvForeignService;

	@Autowired
	public CvForeignControllers(CvForeignService cvForeignService) {
		super();
		this.cvForeignService = cvForeignService;
	}
	
	@PostMapping("/add")
	public Results add( @RequestBody CvForeignLanguage cvForeignLanguage){
		return this.cvForeignService.add(cvForeignLanguage);
		
	}
	
	@GetMapping("/getall")
	public DataResults<List<CvForeignLanguage>> getAll(){
		return this.cvForeignService.getAll();
	}

}
