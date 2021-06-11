package coderkubra.hrms.entities.concretes;
import java.util.List;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name="cv_foreignlang")
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","Cv"})
public class CvForeignLanguage {
	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="lang_id")
	private int languageId;
	
	@Column(name="lang_name")
	private String languageName;
	
	@Column(name="lang_level")
	private String languageLevel;
	
	@OneToMany(mappedBy = "cvForeignLanguage")
	private List<CV> cv;

}
