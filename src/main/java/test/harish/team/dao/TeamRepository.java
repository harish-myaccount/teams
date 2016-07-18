package test.harish.team.dao;

import org.springframework.data.repository.CrudRepository;

import test.harish.team.model.Team;


public interface TeamRepository extends CrudRepository<Team, Long>{

}
