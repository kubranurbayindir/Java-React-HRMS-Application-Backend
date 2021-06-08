package coderkubra.hrms.business.concretes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.stereotype.Service;

import coderkubra.hrms.business.abstracts.UserCheckService;
import coderkubra.hrms.entities.concretes.Candidates;
import coderkubra.hrms.entities.concretes.User;

@Service
public class UserCheckManager implements UserCheckService{

	@Override
	public boolean CheckIfRealPerson(Candidates candidates) {
		return true;
	}

	@Override
	public boolean login(User user){
		String regex = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$";
	    Pattern pattern = Pattern.compile(regex);
	    Matcher matcher = pattern.matcher(user.getEmailAddress());
	    if(matcher.matches() != true) {
			   System.out.println("Geçersiz e-posta adresi, geçerli e-posta adresi giriniz.");
	            return true;
	        } else {
		            System.out.println("Sisteme kayıt oldunuz.");
		            return false;
	        }
	}

}
