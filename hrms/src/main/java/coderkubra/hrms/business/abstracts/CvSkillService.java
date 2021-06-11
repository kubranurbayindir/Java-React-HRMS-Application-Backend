package coderkubra.hrms.business.abstracts;

import java.util.List;

import coderkubra.hrms.core.utilities.results.DataResults;
import coderkubra.hrms.core.utilities.results.Results;
import coderkubra.hrms.entities.concretes.CvSkills;

public interface CvSkillService {
	Results add(CvSkills cvSkills);
	//Results update(CvSkills cvSkills);	
	//Results delete(CvSkills cvSkills);
	DataResults<List<CvSkills>> getAll();

}
