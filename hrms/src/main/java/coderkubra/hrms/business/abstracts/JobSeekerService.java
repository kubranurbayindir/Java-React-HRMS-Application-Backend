package coderkubra.hrms.business.abstracts;

import java.util.List;

import coderkubra.hrms.entities.concretes.Candidates; 

public interface JobSeekerService {
	List<Candidates> getAll();

}
