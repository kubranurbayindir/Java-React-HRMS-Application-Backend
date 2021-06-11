package coderkubra.hrms.business.abstracts;

import java.util.List;

import coderkubra.hrms.core.utilities.results.DataResults;
import coderkubra.hrms.core.utilities.results.Results;
import coderkubra.hrms.entities.concretes.CvSocialMedia;

public interface CvSocialService {
	Results add(CvSocialMedia cvSocialMedia);
	//Results update(CvSocialMedia cvSocialMedia);	
	//Results delete(CvSocialMedia cvSocialMedia);
	DataResults<List<CvSocialMedia>> getAll();
	

}
