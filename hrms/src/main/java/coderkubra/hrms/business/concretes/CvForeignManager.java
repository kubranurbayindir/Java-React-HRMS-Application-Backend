package coderkubra.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import coderkubra.hrms.business.abstracts.CvForeignService;
import coderkubra.hrms.core.utilities.results.DataResults;
import coderkubra.hrms.core.utilities.results.ErrorDataResults;
import coderkubra.hrms.core.utilities.results.Results;
import coderkubra.hrms.core.utilities.results.SuccessDataResults;
import coderkubra.hrms.core.utilities.results.SuccessResults;
import coderkubra.hrms.dataAccess.abstracts.CvForeignLangDao;
import coderkubra.hrms.entities.concretes.CvForeignLanguage;

@Service
public class CvForeignManager implements CvForeignService{
	private CvForeignLangDao cvForeignLangDao;

	@Autowired
	public CvForeignManager(CvForeignLangDao cvForeignLangDao) {
		super();
		this.cvForeignLangDao = cvForeignLangDao;
	}

	@Override
	public Results add(CvForeignLanguage cvForeignLanguage) {
		this.cvForeignLangDao.save(cvForeignLanguage);		
		return new SuccessResults("Yabancı dıl eklendi.");
	}

	@Override
	public DataResults<List<CvForeignLanguage>> getAll() {
		if (this.cvForeignLangDao.findAll() != null) {
			return new SuccessDataResults<List<CvForeignLanguage>>(this.cvForeignLangDao.findAll(),"Yabancı dıl lıstelendı.");
		}
		return new ErrorDataResults<List<CvForeignLanguage>>("Yabancı dıl lıstelenemedı.");
	}

}
