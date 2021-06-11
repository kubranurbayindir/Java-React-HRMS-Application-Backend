package coderkubra.hrms.business.abstracts;

import java.util.List;

import coderkubra.hrms.entities.concretes.JobSeekers; 

public interface JobSeekerService {
	List<JobSeekers> getAll();

}
