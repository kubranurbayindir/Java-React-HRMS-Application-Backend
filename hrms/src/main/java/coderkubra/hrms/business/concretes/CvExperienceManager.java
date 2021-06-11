package coderkubra.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import coderkubra.hrms.business.abstracts.CvExperienceService;
import coderkubra.hrms.core.utilities.results.DataResults;
import coderkubra.hrms.core.utilities.results.ErrorDataResults;
import coderkubra.hrms.core.utilities.results.Results;
import coderkubra.hrms.core.utilities.results.SuccessDataResults;
import coderkubra.hrms.core.utilities.results.SuccessResults;
import coderkubra.hrms.dataAccess.abstracts.CvExperienceDao;
import coderkubra.hrms.entities.concretes.CvExperience;

@Service
public class CvExperienceManager implements CvExperienceService{
	private CvExperienceDao cvExperienceDao;

	@Autowired
	public CvExperienceManager(CvExperienceDao cvExperienceDao) {
		super();
		this.cvExperienceDao = cvExperienceDao;
	}

	@Override
	public Results add(CvExperience cvExperience) {
		this.cvExperienceDao.save(cvExperience);		
		return new SuccessResults("Deneyım eklendi.");
	}

	@Override
	public DataResults<List<CvExperience>> getAll() {
		if (this.cvExperienceDao.findAll() != null) {
			return new SuccessDataResults<List<CvExperience>>(this.cvExperienceDao.findAll(),"Deneyımler lıstelendı.");
		}
		return new ErrorDataResults<List<CvExperience>>("Deneyımler lıstelenemedı.");
	}
	

}
