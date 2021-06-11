package coderkubra.hrms.business.concretes;

import java.util.List;

import org.springframework.stereotype.Service;

import coderkubra.hrms.business.abstracts.CvCoverLetterService;
import coderkubra.hrms.core.utilities.results.DataResults;
import coderkubra.hrms.core.utilities.results.SuccessDataResults;
import coderkubra.hrms.core.utilities.results.ErrorDataResults;
import coderkubra.hrms.core.utilities.results.Results;
import coderkubra.hrms.core.utilities.results.SuccessResults;
import coderkubra.hrms.dataAccess.abstracts.CvCoverLetterDao;
import coderkubra.hrms.entities.concretes.CvCoverLetter;

@Service
public class CvCoverLetterManager implements CvCoverLetterService{

	private CvCoverLetterDao cvCoverLetterDao;
	
	public CvCoverLetterManager(CvCoverLetterDao cvCoverLetterDao) {
		super();
		this.cvCoverLetterDao = cvCoverLetterDao;
	}

	@Override
	public Results add(CvCoverLetter cvCoverLetter) {
		this.cvCoverLetterDao.save(cvCoverLetter);		
		return new SuccessResults("Cover letter added.");
	}


	@Override
	public DataResults<List<CvCoverLetter>> getAll() {
		if (this.cvCoverLetterDao.findAll() != null) {
			return new SuccessDataResults<List<CvCoverLetter>>(this.cvCoverLetterDao.findAll(),"Cover letter is listed.");
		}
		return new ErrorDataResults<List<CvCoverLetter>>("Cover letter isnot listed.");
	}

	@Override
	public Results update(CvCoverLetter cvCoverLetter) {
		this.cvCoverLetterDao.save(cvCoverLetter);		
		return new SuccessResults("Cover letter updated.");
	}

	@Override
	public Results delete(CvCoverLetter cvCoverLetter) {
		this.cvCoverLetterDao.save(cvCoverLetter);		
		return new SuccessResults("Cover letter deleted.");
	}


}
