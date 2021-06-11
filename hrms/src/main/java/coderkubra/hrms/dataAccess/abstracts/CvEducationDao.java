package coderkubra.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import coderkubra.hrms.entities.concretes.CvEducation;

public interface CvEducationDao  extends JpaRepository<CvEducation, Integer>{

}
