package test.harish.teams.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="teams")
public class Team {

	@Id
	private Long TeamId;
	private String name;
}
