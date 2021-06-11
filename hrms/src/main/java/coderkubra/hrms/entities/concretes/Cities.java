package coderkubra.hrms.entities.concretes;

import java.util.List;

import javax.persistence.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor 
@NoArgsConstructor
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler", "jobPosting"})
@Entity
@Table(name = "cities")
public class Cities {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "city_id")
	private int idCity;
	
	@Column(name = "city_name")
	private String cityName;

	@JsonIgnore //eklenmemesı durumunda tum bılgılerı frontendde get edıyor.
	@OneToMany(mappedBy = "cities")
	private List<JobPosting> jobPosting;

}
