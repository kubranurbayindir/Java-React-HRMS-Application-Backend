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
@Table(name = "job_positions")
public class JobPosition {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "position_id")
	private int id;
	
	@Column(name = "position")
	private String position;

	@JsonIgnore
	@OneToMany(mappedBy = "jobPosition")
	private List<JobPosting> jobPosting;
}
