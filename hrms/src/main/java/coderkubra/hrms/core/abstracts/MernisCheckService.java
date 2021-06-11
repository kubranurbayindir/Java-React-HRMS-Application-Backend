package coderkubra.hrms.core.abstracts;

import coderkubra.hrms.core.entities.User;
import coderkubra.hrms.entities.concretes.JobSeekers;

public interface MernisCheckService { //real mernis check interfac
	//dış servıs konfıgurasyonu
	
	  boolean CheckIfRealPerson(JobSeekers jobSeekers);
	  boolean login(User user);
}
