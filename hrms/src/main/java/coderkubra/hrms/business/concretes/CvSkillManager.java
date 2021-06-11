package coderkubra.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import coderkubra.hrms.business.abstracts.CvSkillService;
import coderkubra.hrms.core.utilities.results.DataResults;
import coderkubra.hrms.core.utilities.results.ErrorDataResults;
import coderkubra.hrms.core.utilities.results.Results;
import coderkubra.hrms.core.utilities.results.SuccessDataResults;
import coderkubra.hrms.core.utilities.results.SuccessResults;
import coderkubra.hrms.dataAccess.abstracts.CvSkillDao;
import coderkubra.hrms.entities.concretes.CvSkills;

@Service
public class CvSkillManager implements CvSkillService {
 private CvSkillDao cvSkillDao;

 @Autowired
public CvSkillManager(CvSkillDao cvSkillDao) {
	super();
	this.cvSkillDao = cvSkillDao;
}

@Override
public Results add(CvSkills cvSkills) {
	this.cvSkillDao.save(cvSkills);		
	return new SuccessResults("Yetenek eklendi.");
	}

@Override
public DataResults<List<CvSkills>> getAll() {
	if (this.cvSkillDao.findAll() != null) {
		return new SuccessDataResults<List<CvSkills>>(this.cvSkillDao.findAll(),"Yetenekler lıstelendı.");
	}
	return new ErrorDataResults<List<CvSkills>>("Yetenekler lıstelenemedı.");
}

}
