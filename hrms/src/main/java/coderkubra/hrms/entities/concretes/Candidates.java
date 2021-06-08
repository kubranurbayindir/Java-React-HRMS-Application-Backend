package coderkubra.hrms.entities.concretes;

import javax.persistence.*;

@Entity
@Table(name = "candidates")
public class Candidates {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int idCandidate;
	
	@Column(name = "first_name")
	private String firstName;
	
	@Column(name = "last_name")
	private String lastName;
	
	@Column(name = "identification_number")
	private String identityNo;
	
	@Column(name = "birth_date")
	private int birthDate;
	
	
	public Candidates() {
		
	}
	
	public Candidates(int idCandidate, String emailAddress, String password, String firstName, String lastName, String identityNo, int birthDate) {
		super();
		this.idCandidate = idCandidate;
		this.firstName = firstName;
		this.lastName = lastName;
		this.identityNo = identityNo;
		this.birthDate = birthDate;
	}
	public int getIdCandidate() {
		return idCandidate;
	}
	public void setIdCandidate(int idCandidate) {
		this.idCandidate = idCandidate;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getIdentityNo() {
		return identityNo;
	}
	public void setIdentityNo(String identityNo) {
		this.identityNo = identityNo;
	}
	public int getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(int birthDate) {
		this.birthDate = birthDate;
	}

}
