package coderkubra.hrms.core.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import coderkubra.hrms.core.abstracts.UserService;
import coderkubra.hrms.core.dataAccess.UserDao;
import coderkubra.hrms.core.entities.User;
import coderkubra.hrms.core.utilities.results.DataResults;
import coderkubra.hrms.core.utilities.results.Results;
import coderkubra.hrms.core.utilities.results.SuccessDataResults;
import coderkubra.hrms.core.utilities.results.SuccessResults;

@Service
public class UserManager implements UserService{
	
	private UserDao userDao;

	@Autowired
	public UserManager(UserDao userDao) {
		super();
		this.userDao = userDao;
	}

	@Override
	public Results add(User user) {
		this.userDao.save(user);
		return new SuccessResults("Kullanıcı eklendi");
	}

	@Override
	public DataResults<User> findByEmailAddress(String emailAddress) {
		return new SuccessDataResults<User>(this.userDao.findByEmailAddress(emailAddress), "Kullanıcı Bulundu.");
	} 

}
