package coderkubra.hrms.business.concretes;

import java.util.List;


import org.springframework.data.domain.Sort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import coderkubra.hrms.business.abstracts.JobPostingService;
import coderkubra.hrms.core.utilities.results.DataResults;
import coderkubra.hrms.core.utilities.results.Results;
import coderkubra.hrms.core.utilities.results.SuccessDataResults;
import coderkubra.hrms.core.utilities.results.SuccessResults;
import coderkubra.hrms.dataAccess.abstracts.JobPostingDao;
import coderkubra.hrms.entities.concretes.JobPosting;

@Service
public class JobPostingManager implements JobPostingService {
	
	private JobPostingDao jobPostingDao;
	
	@Autowired
	public JobPostingManager(JobPostingDao jobPostingDao) {
		super();
		this.jobPostingDao = jobPostingDao;
	}

	@Override
	public DataResults<List<JobPosting>> getAll() {
		return new SuccessDataResults<List<JobPosting>>(this.jobPostingDao.findAll(), "Data Listelendi.");
	}

	@Override
	public Results add(JobPosting jobPosting) {
		this.jobPostingDao.save(jobPosting);		
		return new SuccessResults("Is ılanı eklendi.");
	}

	@Override
	public Results update(JobPosting jobPosting) {
		this.jobPostingDao.save(jobPosting);		
		return new SuccessResults("Is ılanı guncellendı.");
	}

	@Override
	public Results delete(JobPosting jobPosting) {
		this.jobPostingDao.save(jobPosting);		
		return new SuccessResults("Is ılanı kaldırıldı.");
	}

	@Override
	public DataResults<List<JobPosting>> findBySortedActive() {
		return new SuccessDataResults<List<JobPosting>>
		(this.jobPostingDao.getByIsActive());
	}

	@Override
	public DataResults<List<JobPosting>> findBySortedDate() {
		Sort sort = Sort.by(Sort.Direction.ASC,"applicationDeadline");
		return new SuccessDataResults<List<JobPosting>>
		(this.jobPostingDao.findAll(sort));
	}

}