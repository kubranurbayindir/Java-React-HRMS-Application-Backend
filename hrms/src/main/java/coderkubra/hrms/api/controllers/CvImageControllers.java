package coderkubra.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import coderkubra.hrms.business.abstracts.CvImageService;
import coderkubra.hrms.core.utilities.results.DataResults;
import coderkubra.hrms.core.utilities.results.Results;
import coderkubra.hrms.entities.concretes.CvImage;

@RestController
@RequestMapping("/api/cv-image")
public class CvImageControllers {
	private CvImageService cvImageService;

	@Autowired
	public CvImageControllers(CvImageService cvImageService) {
		super();
		this.cvImageService = cvImageService;
	}
	
	@PostMapping("/add")
	public Results add( @RequestBody CvImage cvImage){
		return this.cvImageService.add(cvImage);
		
	}
	
	@GetMapping("/getall")
	public DataResults<List<CvImage>> getAll(){
		return this.cvImageService.getAll();
	}
	

}
