package coderkubra.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import coderkubra.hrms.entities.concretes.CV;

public interface CvDao extends JpaRepository<CV, Integer> {

}
