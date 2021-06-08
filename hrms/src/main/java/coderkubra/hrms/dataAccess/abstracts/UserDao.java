package coderkubra.hrms.dataAccess.abstracts;


import org.springframework.data.jpa.repository.JpaRepository;

import coderkubra.hrms.entities.concretes.User;

public interface UserDao extends JpaRepository<User, Integer> {
	

}
