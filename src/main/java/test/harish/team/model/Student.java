package test.harish.team.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "students")
public class Student {

	@Id
	private Long studentId;
	private String name;
	@OneToOne
	@JoinColumn(name="team")
	private Team team;
}
