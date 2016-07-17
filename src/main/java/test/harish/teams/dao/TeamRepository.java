package test.harish.teams.dao;

import org.springframework.data.repository.CrudRepository;

import test.harish.teams.model.Team;

public interface TeamRepository extends CrudRepository<Team, Long>{

}
