package coderkubra.hrms.business.abstracts;

import java.util.List;

import coderkubra.hrms.core.utilities.results.DataResults;
import coderkubra.hrms.core.utilities.results.Results;

import coderkubra.hrms.entities.concretes.JobPosting;

public interface JobPostingService {

	DataResults<List<JobPosting>> getAll(); // Is ılanlarının listelenmesi komutu
	DataResults<List<JobPosting>> findBySortedActive(); // Is ılanlarının aktıf olup listelenmesi komutu
	DataResults<List<JobPosting>> findBySortedDate(); //Is ılanlarının tarihe gore sıralanması komutu
	Results add(JobPosting jobPosting);
	Results update(JobPosting jobPosting);
	Results delete(JobPosting jobPosting);
}