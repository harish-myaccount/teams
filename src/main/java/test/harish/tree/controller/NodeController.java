package test.harish.tree.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import test.harish.tree.dao.NodeRepository;
import test.harish.tree.model.Node;
import test.harish.util.Constants;

@RestController
public class NodeController {

	@Autowired
	private NodeRepository nodeRepo;

	@RequestMapping(value = "/node", method = RequestMethod.GET)
	public List<Node> getNodes() {
		return nodeRepo.findById(1L);
	}

	@RequestMapping(value = "/node", method = RequestMethod.POST)
	public String saveNodes(@RequestBody Node root) {
		nodeRepo.delete(root);
		nodeRepo.save(root);
		return Constants.SUCCESS;
	}
}
