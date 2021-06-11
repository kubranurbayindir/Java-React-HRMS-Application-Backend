package coderkubra.hrms.business.abstracts;

import java.util.List;

import coderkubra.hrms.core.utilities.results.DataResults;
import coderkubra.hrms.core.utilities.results.Results;
import coderkubra.hrms.entities.concretes.CvImage;

public interface CvImageService {

	Results add(CvImage cvImage);
	//Results update(CvImage cvImage);	
	//Results delete(CvImage cvImage);
	DataResults<List<CvImage>> getAll();

}
