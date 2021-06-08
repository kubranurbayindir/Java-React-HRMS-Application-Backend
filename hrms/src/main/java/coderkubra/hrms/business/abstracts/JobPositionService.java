package coderkubra.hrms.business.abstracts;

import java.util.List;

import coderkubra.hrms.core.utilities.results.DataResults;
import coderkubra.hrms.core.utilities.results.Results;
import coderkubra.hrms.entities.concretes.JobPosition;

public interface JobPositionService {
	
	DataResults<List<JobPosition>> getAll();
	
	Results add(JobPosition jobPosition);
}
