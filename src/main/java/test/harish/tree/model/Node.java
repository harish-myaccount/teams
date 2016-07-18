package test.harish.tree.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Data;

@Entity
@Data
public class Node {
	
	@Id
	private Long id;
	
	private String name;
	
    @OneToMany(cascade = CascadeType.ALL)
    private Set<Node> children;

}
