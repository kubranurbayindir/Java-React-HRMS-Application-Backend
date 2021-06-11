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
@Table(name="cover_letter")
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","Cv"})
public class CvCoverLetter {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="cover_id")
	private int coverId;
	
	@Column(name="cover_description")
	private String coverDescription;
	
	@JsonIgnore //eklenmemesı durumunda tum bılgılerı frontendde get edıyor.
	@OneToMany(mappedBy = "cvCoverLetter")
	private List<CV> Cv;
}
