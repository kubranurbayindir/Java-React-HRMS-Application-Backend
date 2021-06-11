package coderkubra.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import coderkubra.hrms.entities.concretes.CvSocialMedia;

public interface CvSocialMediaDao  extends JpaRepository<CvSocialMedia, Integer>  {

}
