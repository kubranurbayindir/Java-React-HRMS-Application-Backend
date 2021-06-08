package coderkubra.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity  //entity interface inin görevini yerini gtiriyor. 
@Table(name = "users")
public class User{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int idUser;
	
	@Column(name = "email_address")
	private String emailAddress;
	
	@Column(name = "password")
	private String password;
	

	public User() {
		
	}
	
	public User(int idUser, String emailAddress, String password) {
		super();
		this.idUser = idUser;
		this.emailAddress = emailAddress;
		this.password = password;
	}


	public int getId() {
		return idUser;
	}


	public void setId(int idUser) {
		this.idUser = idUser;
	}


	public String getEmailAddress() {
		return emailAddress;
	}


	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}

	
	
}
