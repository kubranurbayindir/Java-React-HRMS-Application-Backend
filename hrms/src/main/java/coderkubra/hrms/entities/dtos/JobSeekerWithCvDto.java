package coderkubra.hrms.entities.dtos;


import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import coderkubra.hrms.entities.concretes.CvCoverLetter;
import coderkubra.hrms.entities.concretes.CvEducation;
import coderkubra.hrms.entities.concretes.CvExperience;
import coderkubra.hrms.entities.concretes.CvForeignLanguage;
import coderkubra.hrms.entities.concretes.CvImage;
import coderkubra.hrms.entities.concretes.CvSkills;
import coderkubra.hrms.entities.concretes.CvSocialMedia;
import coderkubra.hrms.entities.concretes.JobSeekers;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class JobSeekerWithCvDto {
	@JsonIgnore()
	private JobSeekers jobSeekers;
	private List<CvImage> cvImage;
	private List<CvCoverLetter> cvCoverLetter;
	private List<CvEducation> cvEducation;
	private List<CvExperience> cvExperience;
	private List<CvForeignLanguage> cvForeignLanguage;
	private List<CvSkills> cvSkills;
	private List<CvSocialMedia> cvSocialMedia;

}
