package coderkubra.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import coderkubra.hrms.entities.concretes.CvCoverLetter;

public interface CvCoverLetterDao  extends JpaRepository<CvCoverLetter, Integer>{

}
