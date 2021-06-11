package coderkubra.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import coderkubra.hrms.business.abstracts.CvImageService;
import coderkubra.hrms.core.utilities.results.DataResults;
import coderkubra.hrms.core.utilities.results.ErrorDataResults;
import coderkubra.hrms.core.utilities.results.Results;
import coderkubra.hrms.core.utilities.results.SuccessDataResults;
import coderkubra.hrms.core.utilities.results.SuccessResults;
import coderkubra.hrms.dataAccess.abstracts.CvImageDao;
import coderkubra.hrms.entities.concretes.CvImage;

@Service
public class CvImageManager implements CvImageService {
	
	private CvImageDao cvImageDao;

	@Autowired
	public CvImageManager(CvImageDao cvImageDao) {
		super();
		this.cvImageDao = cvImageDao;
	}

	@Override
	public Results add(CvImage cvImage) {
		this.cvImageDao.save(cvImage);		
		return new SuccessResults("Resım eklendi.");
	}

	@Override
	public DataResults<List<CvImage>> getAll() {
		if (this.cvImageDao.findAll() != null) {
			return new SuccessDataResults<List<CvImage>>(this.cvImageDao.findAll(),"Resımler lıstelendı.");
		}
		return new ErrorDataResults<List<CvImage>>("Resımler lıstelenemedı.");
	}
	

}
