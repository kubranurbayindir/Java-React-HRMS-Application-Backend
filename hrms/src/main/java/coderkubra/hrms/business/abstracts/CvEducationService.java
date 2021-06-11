package coderkubra.hrms.business.abstracts;

import java.util.List;

import coderkubra.hrms.core.utilities.results.DataResults;
import coderkubra.hrms.core.utilities.results.Results;
import coderkubra.hrms.entities.concretes.CvEducation;

public interface CvEducationService {
	Results add(CvEducation cvEducation);
	//Results update(CvEducation cvEducation);	
	//Results delete(CvEducation cvEducation);
	DataResults<List<CvEducation>> getAll();
}
