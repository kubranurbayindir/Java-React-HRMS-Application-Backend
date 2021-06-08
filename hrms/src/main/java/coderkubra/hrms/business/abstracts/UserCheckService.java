package coderkubra.hrms.business.abstracts;

import coderkubra.hrms.entities.concretes.Candidates;
import coderkubra.hrms.entities.concretes.User;

public interface UserCheckService {
	
	  boolean CheckIfRealPerson(Candidates candidates);
	  boolean login(User user);

}
