package coderkubra.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import coderkubra.hrms.entities.concretes.CvImage;

public interface CvImageDao extends JpaRepository<CvImage, Integer> {

}
