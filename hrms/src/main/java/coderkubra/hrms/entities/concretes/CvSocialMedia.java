package coderkubra.hrms.entities.concretes;
import java.util.List;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name="cv_socialmedia")
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","Cv"})
public class CvSocialMedia {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="social_id")
	private int socialId;
	
	@Column(name="account_url_github")
	private String accountGithub;
	
	@Column(name="account_url_linkedin")
	private String accountLinkedin;
	
	@JsonIgnore //eklenmemesı durumunda tum bılgılerı frontendde get edıyor.
	@OneToMany(mappedBy = "cvSocialMedia")
	private List<CV> cv;
}
