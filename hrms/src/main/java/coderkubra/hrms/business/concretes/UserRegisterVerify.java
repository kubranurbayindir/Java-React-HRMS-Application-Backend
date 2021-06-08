package coderkubra.hrms.business.concretes;

import org.springframework.stereotype.Service;

import coderkubra.hrms.business.abstracts.UserRegisterVerifyService;
import coderkubra.hrms.core.utilities.results.Results;
import coderkubra.hrms.core.utilities.results.SuccessResults;
import coderkubra.hrms.dataAccess.abstracts.CandidatesDao;
import coderkubra.hrms.dataAccess.abstracts.UserDao;
import coderkubra.hrms.entities.concretes.Candidates;
import coderkubra.hrms.entities.concretes.User;

@Service
public class UserRegisterVerify implements UserRegisterVerifyService{
	
	private UserDao userDao;
	private CandidatesDao candidatesDao;

	@Override
	public Results EmailVerify(User user) {
		this.userDao.save(user);	
		return new SuccessResults("Email doğrulandı.");
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

	@Override
	public boolean isIdentityVerify(Candidates candidates) {
		for (Candidates person : this.candidatesDao.findAll()) 
			if (person.getIdentityNo().equals(candidates.getIdentityNo())) {
				System.out.println("Ilgılı" + " " + candidates.getIdentityNo() +
					                "vatandaslık numarası ıle daha önce bır kayıt mevcuttur.");
					return false;	}				
					return true;	
	}
	
}
