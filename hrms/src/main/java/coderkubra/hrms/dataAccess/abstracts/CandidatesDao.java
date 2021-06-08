package coderkubra.hrms.dataAccess.abstracts;


import org.springframework.data.jpa.repository.JpaRepository;

import coderkubra.hrms.entities.concretes.Candidates;

public interface CandidatesDao extends JpaRepository<Candidates, Integer>   {

}