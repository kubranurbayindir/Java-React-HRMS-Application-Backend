package coderkubra.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import coderkubra.hrms.entities.concretes.Employees;


public interface EmployeesDao  extends JpaRepository<Employees, Integer> {

}
