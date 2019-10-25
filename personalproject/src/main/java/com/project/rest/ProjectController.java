package com.project.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.persistence.domain.Project;
import com.project.persistence.repository.ProjectRepository;

@RestController
@RequestMapping("")
public class ProjectService {
	
	@Autowired
	private ProjectRepository repository;
	
	@GetMapping(value=Team);
	public List<Project> getAllTeams(){
		return repository.findAll();
	}
	
	@GetMapping
	public Project saveTeam(Project teamTosave)
	{
		return repository.save(teamTosave);
	}
	
	@GetMapping
	public Project updateTeam(Project teamToUpdate)
	{
		return repository.save(teamToUpdate);
	}
	
	@GetMapping
	public String deleteTeam(Long teamToDelete)
	{
		repository.deleteById(teamToDelete);
		return "sucessfully Deleted";
	}
}