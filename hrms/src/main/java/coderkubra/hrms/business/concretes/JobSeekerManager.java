package coderkubra.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import coderkubra.hrms.business.abstracts.JobSeekerService;
import coderkubra.hrms.dataAccess.abstracts.CandidatesDao;
import coderkubra.hrms.entities.concretes.Candidates;

@Service
public class JobSeekerManager implements JobSeekerService{
	
	private CandidatesDao candidatesDao;
	
	@Autowired
	public JobSeekerManager(CandidatesDao candidatesDao) {
		super();
		this.candidatesDao = candidatesDao;
	}

	
	@Override
	public List<Candidates> getAll() {
		return this.candidatesDao.findAll();
	}
	
	//@Override
		//public void register(Candidates canditates) {
			// TODO Auto-generated method stub
			
		//}



}
