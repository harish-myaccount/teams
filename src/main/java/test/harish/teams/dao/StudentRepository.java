package test.harish.teams.dao;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import test.harish.teams.model.Student;
import test.harish.teams.model.Team;

@Repository
public interface StudentRepository extends CrudRepository<Student, Long>{

	@Transactional
	@Modifying
	@Query("update Student s  set s.team = ?1 where s.studentId = ?2")
	void setTeamInfoById(Team teamId,Long studentId);
}
