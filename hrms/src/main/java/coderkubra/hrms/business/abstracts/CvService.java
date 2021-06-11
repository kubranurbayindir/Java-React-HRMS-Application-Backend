package coderkubra.hrms.business.abstracts;

import java.util.List;

import coderkubra.hrms.core.utilities.results.DataResults;
import coderkubra.hrms.core.utilities.results.Results;
import coderkubra.hrms.entities.concretes.CV;

public interface CvService {
	Results add(CV cv);
	//Results update(CV cv);	
	//Results delete(CV cv);
	DataResults<List<CV>> getAll();

}
