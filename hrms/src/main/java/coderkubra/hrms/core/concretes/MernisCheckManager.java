package coderkubra.hrms.core.concretes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.stereotype.Service;

import coderkubra.hrms.core.abstracts.MernisCheckService;
import coderkubra.hrms.core.entities.User;
import coderkubra.hrms.entities.concretes.JobSeekers;


@Service
public class MernisCheckManager implements MernisCheckService{

	@Override
	public boolean CheckIfRealPerson(JobSeekers jobSeekers) {
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
