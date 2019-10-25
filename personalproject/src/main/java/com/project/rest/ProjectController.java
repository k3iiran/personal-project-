package com.project.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.persistence.domain.Project;
import com.project.persistence.repository.ProjectRepository;

@RestController
//@RequestMapping("")
public class ProjectController {
	
	@Autowired
	private ProjectRepository repository;
	
	@GetMapping("/showAll")
	public List<Project> getAllTeams(){
		return repository.findAll();
	}
	
	@GetMapping("/saveTeam")
	public Project saveTeam(Project teamTosave)
	{
		return repository.save(teamTosave);
	}
	
	@GetMapping("/updateTeam")
	public Project updateTeam(Project teamToUpdate)
	{
		return repository.save(teamToUpdate);
	}
	
	@GetMapping("/deleteTeam")
	public String deleteTeam(Long teamToDelete)
	{
		repository.deleteById(teamToDelete);
		return "sucessfully Deleted";
	}
}