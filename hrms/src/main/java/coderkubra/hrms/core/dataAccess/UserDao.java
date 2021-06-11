package coderkubra.hrms.core.dataAccess;

import org.springframework.data.jpa.repository.JpaRepository;

import coderkubra.hrms.core.entities.User;

public interface UserDao  extends JpaRepository<User, Integer>  {

	User findByEmailAddress(String emailAddress);
}
