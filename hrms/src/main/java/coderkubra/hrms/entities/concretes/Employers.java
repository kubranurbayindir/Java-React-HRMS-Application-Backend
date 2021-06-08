package coderkubra.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employer")
public class Employers {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int idEmployer;
	
	@Column(name = "company_name")
	private String companyName;
	
	@Column(name = "web_address")
	private String webAddress;
	
	public Employers() {
		
	}
	
	public Employers(int idEmployer,  String emailAddress, String password, String companyName, String webAddress) {
		super();
		this.idEmployer = idEmployer;
		this.companyName = companyName;
		this.webAddress = webAddress;
	}


	public int getIdEmployer() {
		return idEmployer;
	}


	public void setIdEmployer(int idEmployer) {
		this.idEmployer = idEmployer;
	}


	public String getCompanyName() {
		return companyName;
	}


	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}


	public String getWebAddress() {
		return webAddress;
	}


	public void setWebAddress(String webAddress) {
		this.webAddress = webAddress;
	}

}
