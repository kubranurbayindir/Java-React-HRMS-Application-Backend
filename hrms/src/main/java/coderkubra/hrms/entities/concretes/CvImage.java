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
@Table(name="cv_image")
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","Cv"})
public class CvImage {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="image_id")
	private int imageId;
	
	@Column(name="image_url")
	private String imageUrl;
	
	@JsonIgnore //eklenmemesı durumunda tum bılgılerı frontendde get edıyor.
	@OneToMany(mappedBy = "cvImage")
	private List<CV> Cv;
}
