package coderkubra.hrms.business.abstracts;

import java.util.List;

import coderkubra.hrms.core.utilities.results.DataResults;
import coderkubra.hrms.core.utilities.results.Results;
import coderkubra.hrms.entities.concretes.CvExperience;

public interface CvExperienceService {
	Results add(CvExperience cvExperience);
	//Results update(CvExperience cvExperience);	
	//Results delete(CvExperience cvExperience);
	DataResults<List<CvExperience>> getAll();
}
