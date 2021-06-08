package coderkubra.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import coderkubra.hrms.business.abstracts.EmployerService;
import coderkubra.hrms.dataAccess.abstracts.EmployersDao;
import coderkubra.hrms.dataAccess.abstracts.UserDao;
import coderkubra.hrms.entities.concretes.Employers;
import coderkubra.hrms.entities.concretes.User;


@Service
public class EmployerManager implements EmployerService {
	
	private EmployersDao employersDao;
	private UserDao userDao;
	
	@Autowired
	public EmployerManager(EmployersDao employersDao) {
		super();
		this.employersDao = employersDao;
	}
	

	@Override
	public List<Employers> getAll() {
		return this.employersDao.findAll();
	}


	@Override
	public boolean isEmailVerify(User user) {
		for (User person : this.userDao.findAll()) 
			if (person.getEmailAddress().equals(user.getEmailAddress())) {
				System.out.println("Ilgılı" + " " + user.getEmailAddress() +
				                " maıl adresı ıle daha önce bır kayıt mevcuttur, maıl adresını degıstırınız.");
					return false;	}				
					return true;	
				}

		}



