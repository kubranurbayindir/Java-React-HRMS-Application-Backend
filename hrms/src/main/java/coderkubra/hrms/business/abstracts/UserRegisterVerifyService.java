package coderkubra.hrms.business.abstracts;

import coderkubra.hrms.core.utilities.results.Results;
import coderkubra.hrms.entities.concretes.Candidates;
import coderkubra.hrms.entities.concretes.User;

public interface UserRegisterVerifyService {
	
	Results EmailVerify(User user);
    boolean isEmailVerify(User user);
    boolean isIdentityVerify(Candidates candidates);

}
