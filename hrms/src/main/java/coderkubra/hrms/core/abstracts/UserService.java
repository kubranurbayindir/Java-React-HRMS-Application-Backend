package coderkubra.hrms.core.abstracts;

import coderkubra.hrms.core.entities.User;
import coderkubra.hrms.core.utilities.results.DataResults;
import coderkubra.hrms.core.utilities.results.Results;

public interface UserService {
	Results add(User user);
	DataResults<User> findByEmailAddress(String emailAddress);
}
