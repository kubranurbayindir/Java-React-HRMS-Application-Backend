package coderkubra.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import coderkubra.hrms.business.abstracts.CvSocialService;
import coderkubra.hrms.core.utilities.results.DataResults;
import coderkubra.hrms.core.utilities.results.ErrorDataResults;
import coderkubra.hrms.core.utilities.results.Results;
import coderkubra.hrms.core.utilities.results.SuccessDataResults;
import coderkubra.hrms.core.utilities.results.SuccessResults;
import coderkubra.hrms.dataAccess.abstracts.CvSocialMediaDao;
import coderkubra.hrms.entities.concretes.CvSocialMedia;

@Service
public class CvSocialManager implements CvSocialService{
	private CvSocialMediaDao cvSocialMediaDao;

	@Autowired
	public CvSocialManager(CvSocialMediaDao cvSocialMediaDao) {
		super();
		this.cvSocialMediaDao = cvSocialMediaDao;
	}

	@Override
	public Results add(CvSocialMedia cvSocialMedia) {
		this.cvSocialMediaDao.save(cvSocialMedia);		
		return new SuccessResults("Sosyal medya  eklendi.");
	}

	@Override
	public DataResults<List<CvSocialMedia>> getAll() {
		if (this.cvSocialMediaDao.findAll() != null) {
			return new SuccessDataResults<List<CvSocialMedia>>(this.cvSocialMediaDao.findAll(),"Sosyal medya lıstelendı.");
		}
		return new ErrorDataResults<List<CvSocialMedia>>("Sosyal medya  lıstelenemedı.");
	}
	

}
