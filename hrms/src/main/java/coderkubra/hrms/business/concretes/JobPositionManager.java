package coderkubra.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import coderkubra.hrms.business.abstracts.JobPositionService;
import coderkubra.hrms.core.utilities.results.DataResults;
import coderkubra.hrms.core.utilities.results.Results;
import coderkubra.hrms.core.utilities.results.SuccessDataResults;
import coderkubra.hrms.core.utilities.results.SuccessResults;
import coderkubra.hrms.dataAccess.abstracts.JobPositionDao;
import coderkubra.hrms.entities.concretes.JobPosition;

@Service
public class JobPositionManager implements JobPositionService{
	
	private JobPositionDao jobPositionDao;
	
	@Autowired
	public JobPositionManager(JobPositionDao jobPositionDao) {
		super();
		this.jobPositionDao = jobPositionDao;
	}

	@Override
	public DataResults<List<JobPosition>> getAll() {
		return new SuccessDataResults<List<JobPosition>>(this.jobPositionDao.findAll(), "Data Listelendi.");
		}

	@Override
	public Results add(JobPosition jobPosition) {
		this.jobPositionDao.save(jobPosition);		
		return new SuccessResults("Pozisyon eklendi.");
	}
}
