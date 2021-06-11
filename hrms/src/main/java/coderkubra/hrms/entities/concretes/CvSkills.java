package coderkubra.hrms.entities.concretes;
import java.util.List;

import javax.persistence.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="cv_skills")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","cvSkills"})
public class CvSkills {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="skill_id")
	private int idSkill;
	
	@Column(name="skill_name")
	private String skillName;
	
	@Column(name="skill_degree")
	private String skillDegree;
	
	@JsonIgnore //eklenmemesı durumunda tum bılgılerı frontendde get edıyor.
	@OneToMany(mappedBy = "cvSkills")
    private List<CV> cv;

}
