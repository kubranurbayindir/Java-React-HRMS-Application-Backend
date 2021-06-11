package coderkubra.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import coderkubra.hrms.business.abstracts.CvService;
import coderkubra.hrms.core.utilities.results.DataResults;
import coderkubra.hrms.core.utilities.results.ErrorDataResults;
import coderkubra.hrms.core.utilities.results.Results;
import coderkubra.hrms.core.utilities.results.SuccessDataResults;
import coderkubra.hrms.core.utilities.results.SuccessResults;
import coderkubra.hrms.dataAccess.abstracts.CvDao;
import coderkubra.hrms.entities.concretes.CV;
@Service
public class CvManager implements CvService {
	private CvDao cvDao;

	@Autowired
	public CvManager(CvDao cvDao) {
		super();
		this.cvDao = cvDao;
	}

	@Override
	public Results add(CV cv) {
		this.cvDao.save(cv);		
		return new SuccessResults("Cover letter added.");
	}

	@Override
	public DataResults<List<CV>> getAll() {
		if (this.cvDao.findAll() != null) {
			return new SuccessDataResults<List<CV>>(this.cvDao.findAll(),"Cover letter is listed.");
		}
		return new ErrorDataResults<List<CV>>("Cover letter isnot listed.");
	}

	

}
