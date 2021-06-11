package coderkubra.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import coderkubra.hrms.entities.concretes.JobPosting;

public interface JobPostingDao  extends JpaRepository<JobPosting, Integer>{
	@Query("From JobPosting where isActive=true")
	List<JobPosting> getByIsActive();

}