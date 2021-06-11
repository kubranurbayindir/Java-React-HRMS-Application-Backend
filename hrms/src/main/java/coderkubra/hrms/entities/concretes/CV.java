package coderkubra.hrms.entities.concretes;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

import coderkubra.hrms.core.entities.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="cv_informations")
public class CV {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="cv_id")
	private int cvId;
	
	@ManyToOne()
	@JoinColumn(name = "image_id")
	private CvImage cvImage;
	
	@ManyToOne()
	@JoinColumn(name = "education_id")
	private CvEducation cvEducation;
	
	@ManyToOne()
	@JoinColumn(name = "experience_id")
	private CvExperience cvExperience;
		
	@ManyToOne()
	@JoinColumn(name = "skill_id")
	private CvSkills cvSkills;
	
	@ManyToOne()
	@JoinColumn(name = "lang_id")
	private CvForeignLanguage cvForeignLanguage;
	
	@ManyToOne()
	@JoinColumn(name = "social_id")
	private CvSocialMedia cvSocialMedia;
	

	@JsonIgnore //eklenmemesı durumunda tum bılgılerı frontendde get edıyor.
	@ManyToOne()
	@JoinColumn(name = "user_id")
	private User user;
	
	@ManyToOne()
	@JoinColumn(name = "cover_id")
	private CvCoverLetter cvCoverLetter;

}
