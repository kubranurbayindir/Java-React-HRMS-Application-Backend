package coderkubra.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import coderkubra.hrms.business.abstracts.CvEducationService;
import coderkubra.hrms.core.utilities.results.DataResults;
import coderkubra.hrms.core.utilities.results.ErrorDataResults;
import coderkubra.hrms.core.utilities.results.Results;
import coderkubra.hrms.core.utilities.results.SuccessDataResults;
import coderkubra.hrms.core.utilities.results.SuccessResults;
import coderkubra.hrms.dataAccess.abstracts.CvEducationDao;
import coderkubra.hrms.entities.concretes.CvEducation;

@Service
public class CvEducationManager implements CvEducationService {
	private CvEducationDao cvEducationDao;

	@Autowired
	public CvEducationManager(CvEducationDao cvEducationDao) {
		super();
		this.cvEducationDao = cvEducationDao;
	}

	@Override
	public Results add(CvEducation cvEducation) {
		this.cvEducationDao.save(cvEducation);		
		return new SuccessResults("Egıtım bılgısı eklendi.");
	}

	@Override
	public DataResults<List<CvEducation>> getAll() {
		if (this.cvEducationDao.findAll() != null) {
			return new SuccessDataResults<List<CvEducation>>(this.cvEducationDao.findAll(),"Egıtımlerı lıstelendı.");
		}
		return new ErrorDataResults<List<CvEducation>>("Egıtımlerı lıstelenemedı.");
	}
	

}
