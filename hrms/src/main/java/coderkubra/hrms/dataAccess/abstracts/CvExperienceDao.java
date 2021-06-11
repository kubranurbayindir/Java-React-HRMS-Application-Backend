package coderkubra.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import coderkubra.hrms.entities.concretes.CvExperience;

public interface CvExperienceDao  extends JpaRepository<CvExperience, Integer>  {

}
