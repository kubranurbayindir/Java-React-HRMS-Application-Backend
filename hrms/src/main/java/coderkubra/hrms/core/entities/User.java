package coderkubra.hrms.core.entities;

//import javax.persistence.*; or below thesee..:)
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

import com.sun.istack.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor 
@NoArgsConstructor
@Entity  //entity interface inin görevini yerini gtiriyor.
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = "users")
public class User{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "user_id")
	private int idUser;
	
	@Email
	@NotBlank
	@NotNull
	@Column(name = "email_address")
	private String emailAddress;
	
	@NotNull
	@NotBlank
	@Column(name = "password")
	private String password;
	
	@NotNull
	@NotBlank
	@Column(name = "password_repeat")
	private String passwordRepeat;

/*	public User() {
		
	}
	
	public User(int idUser, String emailAddress, String password, String passwordRepeat) {
		super();
		this.idUser = idUser;
		this.emailAddress = emailAddress;
		this.password = password;
		this.passwordRepeat = passwordRepeat;
	}


	public int getIdUser() {
		return idUser;
	}

	public void setIdUser(int idUser) {
		this.idUser = idUser;
	}

	public String getPasswordRepeat() {
		return passwordRepeat;
	}

	public void setPasswordRepeat(String passwordRepeat) {
		this.passwordRepeat = passwordRepeat;
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
	*/

	
	
}

