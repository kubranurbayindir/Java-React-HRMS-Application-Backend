package coderkubra.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import coderkubra.hrms.business.abstracts.JobSeekerService;
import coderkubra.hrms.dataAccess.abstracts.JobSeekersDao;
import coderkubra.hrms.entities.concretes.JobSeekers;

@Service
public class JobSeekerManager implements JobSeekerService{
	
	private JobSeekersDao jobSeekersDao;
	
	@Autowired
	public JobSeekerManager(JobSeekersDao jobSeekersDao) {
		super();
		this.jobSeekersDao = jobSeekersDao;
	}

	@Override
	public List<JobSeekers> getAll() {
		return this.jobSeekersDao.findAll();
	}
	
	//@Override
		//public void register(Candidates canditates) {
			// TODO Auto-generated method stub
			
		//}



}
