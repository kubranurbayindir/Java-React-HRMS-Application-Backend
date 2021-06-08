package coderkubra.hrms.entities.concretes;

import javax.persistence.*;

@Entity
@Table(name = "job_titles")
public class JobPosition {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name = "title")
	private String title;
	
	public JobPosition(int id, String title) {
		super();
		this.id = id;
		this.title = title;
	}
	
	public JobPosition() {
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

}
