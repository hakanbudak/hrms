package hrmsproject.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import hrmsproject.hrms.entities.concretes.jobpositions;

public interface jobpositionsDao extends JpaRepository<jobpositions, Integer> {

}
