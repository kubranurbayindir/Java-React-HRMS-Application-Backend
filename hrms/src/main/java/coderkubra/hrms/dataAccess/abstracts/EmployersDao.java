package coderkubra.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import coderkubra.hrms.entities.concretes.Employers;

public interface EmployersDao extends JpaRepository<Employers, Integer> {

}
