package coderkubra.hrms.business.abstracts;

import java.util.List;

import coderkubra.hrms.core.utilities.results.DataResults;
import coderkubra.hrms.core.utilities.results.Results;
import coderkubra.hrms.entities.concretes.CvForeignLanguage;

public interface CvForeignService {
	Results add(CvForeignLanguage cvForeignLanguage );
	//Results update(CvForeignLanguage cvForeignLanguage );	
	//Results delete(CvForeignLanguage cvForeignLanguage );
	DataResults<List<CvForeignLanguage>> getAll();

}
