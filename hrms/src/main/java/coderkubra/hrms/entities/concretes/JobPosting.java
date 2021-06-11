package coderkubra.hrms.entities.concretes;

import java.time.LocalDate;

import javax.persistence.*;

import coderkubra.hrms.core.entities.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor 
@NoArgsConstructor
@Entity
@Table(name = "job_postings")
public class JobPosting {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "post_id")
	private int idPost;
	
	@Column(name = "description")
	private String jobDescription;
	
	@Column(name = "postDate")
	private LocalDate post_date;
	
	@Column(name = "postDeadline")
	private LocalDate post_deadline;
	
	@Column(name = "min_salary")
	private double minSalary;
	
	@Column(name = "max_salary")
	private double maxSalary;
	
	@Column(name = "open_position_number")
	private String openPositionNumber;

	@ManyToOne
	@JoinColumn(name = "city_id")
	private Cities cities;
	
	@ManyToOne
	@JoinColumn(name = "position_id")
	private JobPosition jobPosition;
	
	@ManyToOne
	@JoinColumn(name = "user_id")
	private User user;
}
