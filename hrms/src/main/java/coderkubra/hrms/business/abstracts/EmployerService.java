package coderkubra.hrms.business.abstracts;

import java.util.List;

import coderkubra.hrms.entities.concretes.Employers;
import coderkubra.hrms.entities.concretes.User;

public interface EmployerService {

	List<Employers> getAll();

    boolean isEmailVerify(User user);
}
