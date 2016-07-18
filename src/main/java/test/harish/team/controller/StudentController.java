package test.harish.team.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import test.harish.team.dao.StudentRepository;
import test.harish.team.dao.TeamRepository;
import test.harish.team.model.Student;
import test.harish.team.model.Team;
import test.harish.util.Constants;

@RestController
public class StudentController {

	@Autowired
	private StudentRepository studentRepo;
	
	@Autowired
	private TeamRepository teamRepo;
	
	@RequestMapping(value="/student",method=RequestMethod.GET)
	public List<Student> getAll(){
		return (List<Student>) studentRepo.findAll();
	}
	
	@RequestMapping(value="/student",method=RequestMethod.POST)
	public String  savemapping(@RequestBody Map<String,List<String>> teamMappings){
		for(String key:teamMappings.keySet()){
			List<String> nodes = teamMappings.get(key);
			for(String node :nodes){
				Team team = null;
				if(key.contains("box")){
					Long teamid = Long.parseLong(key.replace("box", ""));
					team = teamRepo.findOne(teamid);
				}
				studentRepo.setTeamInfoById(team, Long.parseLong(node.replace("node", "")));
			}
		}
		return Constants.SUCCESS;
	}
	
}
