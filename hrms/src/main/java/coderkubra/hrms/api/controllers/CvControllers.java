package coderkubra.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;

import coderkubra.hrms.business.abstracts.CvService;
import coderkubra.hrms.core.utilities.results.DataResults;
import coderkubra.hrms.core.utilities.results.Results;
import coderkubra.hrms.entities.concretes.CV;

@RestController
@RequestMapping("/api/cv")
@CrossOrigin
public class CvControllers {
	
	private CvService cvService;

	@Autowired
	public CvControllers(CvService cvService) {
		super();
		this.cvService = cvService;
	}
	
	@PostMapping("/add")
	public Results add( @RequestBody CV cv){
		return this.cvService.add(cv);
		
	}
	
	@GetMapping("/getall")
	public DataResults<List<CV>> getAll(){
		return this.cvService.getAll();
	}


}
