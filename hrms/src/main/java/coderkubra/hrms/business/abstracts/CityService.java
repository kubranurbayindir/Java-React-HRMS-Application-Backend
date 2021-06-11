package coderkubra.hrms.business.abstracts;

import java.util.List;

import coderkubra.hrms.core.utilities.results.DataResults;
import coderkubra.hrms.core.utilities.results.Results;
import coderkubra.hrms.entities.concretes.Cities;

public interface CityService {
	Results add(Cities cities);
	//Results update(Cities cities);	
	//Results delete(Cities cities);
	DataResults<List<Cities>> getAll();
}
