package coderkubra.hrms.business.abstracts;


import java.util.List;

import coderkubra.hrms.core.utilities.results.DataResults;
import coderkubra.hrms.core.utilities.results.Results;
import coderkubra.hrms.entities.concretes.CvCoverLetter;

public interface CvCoverLetterService {
	
	Results add(CvCoverLetter cvCoverLetter);
	Results update(CvCoverLetter cvCoverLetter);
	Results delete(CvCoverLetter cvCoverLetter);
	DataResults<List<CvCoverLetter>> getAll();
//	DataResults<List<CvCoverLetter>> getByCvId(int cvId);
}
