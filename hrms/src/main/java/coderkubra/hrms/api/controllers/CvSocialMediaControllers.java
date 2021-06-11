package coderkubra.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import coderkubra.hrms.business.abstracts.CvSocialService;
import coderkubra.hrms.core.utilities.results.DataResults;
import coderkubra.hrms.core.utilities.results.Results;
import coderkubra.hrms.entities.concretes.CvSocialMedia;

@RestController
@RequestMapping("/api/cv-social-media")
public class CvSocialMediaControllers {
	
	private CvSocialService cvSocialService;
	
	@Autowired
	public CvSocialMediaControllers(CvSocialService cvSocialService) {
		super();
		this.cvSocialService = cvSocialService;
	}

	@PostMapping("/add")
	public Results add( @RequestBody CvSocialMedia cvSocialMedia){
		return this.cvSocialService.add(cvSocialMedia);
		
	}
	
	@GetMapping("/getall")
	public DataResults<List<CvSocialMedia>> getAll(){
		return this.cvSocialService.getAll();
	}
}
