package coderkubra.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import coderkubra.hrms.core.utilities.results.Results;
import coderkubra.hrms.business.abstracts.CvCoverLetterService;
import coderkubra.hrms.core.utilities.results.DataResults;
import coderkubra.hrms.entities.concretes.CvCoverLetter;

@RestController
@RequestMapping("/api/cv-coverletter")
public class CvCoverLetterControllers {
	
	private CvCoverLetterService cvCoverLetterService;

	@Autowired
	public CvCoverLetterControllers(CvCoverLetterService cvCoverLetterService) {
		super();
		this.cvCoverLetterService = cvCoverLetterService;
	}
	

	@PostMapping("/add")
	public Results add( @RequestBody CvCoverLetter cvCoverLetter){
		return this.cvCoverLetterService.add(cvCoverLetter);
		
	}
	
	@PostMapping("/update")
	public Results update( @RequestBody CvCoverLetter cvCoverLetter){
		return this.cvCoverLetterService.update(cvCoverLetter);
		
	}
	
	@PostMapping("/delete")
	public Results delete( @RequestBody CvCoverLetter cvCoverLetter){
		return this.cvCoverLetterService.delete(cvCoverLetter);
		
	}
	
	@GetMapping("/getall")
	public DataResults<List<CvCoverLetter>> getAll(){
		return this.cvCoverLetterService.getAll();
	}

}
