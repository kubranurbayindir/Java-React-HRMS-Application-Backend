package coderkubra.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import coderkubra.hrms.entities.concretes.CvSkills;

public interface CvSkillDao extends JpaRepository<CvSkills, Integer> {

}
