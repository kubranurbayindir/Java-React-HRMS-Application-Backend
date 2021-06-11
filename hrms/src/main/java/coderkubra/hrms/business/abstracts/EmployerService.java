package coderkubra.hrms.business.abstracts;

import java.util.List;

import coderkubra.hrms.core.entities.User;
import coderkubra.hrms.entities.concretes.Employers;

public interface EmployerService {

	List<Employers> getAll();

    boolean isEmailVerify(User user);
}
