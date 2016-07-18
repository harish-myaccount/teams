package test.harish.tree.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import test.harish.tree.model.Node;

@Repository
public interface NodeRepository extends CrudRepository<Node, Long> {
	public List<Node> findById(Long nodeId);
}
