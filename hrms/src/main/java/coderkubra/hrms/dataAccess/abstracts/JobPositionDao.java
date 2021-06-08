package coderkubra.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import coderkubra.hrms.entities.concretes.JobPosition;

public interface JobPositionDao extends JpaRepository<JobPosition, Integer>  {
// interface interfac i extends eder. -sonra entityi primary key i veriyoruz.
}
