package coderkubra.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import coderkubra.hrms.entities.concretes.CvForeignLanguage;

public interface CvForeignLangDao  extends JpaRepository<CvForeignLanguage, Integer>  {

}
