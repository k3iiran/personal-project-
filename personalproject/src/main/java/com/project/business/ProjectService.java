package com.project.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.persistence.domain.Project;
import com.project.persistence.repository.ProjectRepository;

@Service
public class ProjectService {
	
	@Autowired
	private ProjectRepository repository;
	public List<Project> getAllTeams(){
		return repository.findAll();
	}
	public Project saveTeam(Project teamTosave)
	{
		return repository.save(teamTosave);
	}
	public Project updateTeam(Project teamToUpdate)
	{
		return repository.save(teamToUpdate);
	}
	public String deleteTeam(Long teamToDelete)
	{
		repository.deleteById(teamToDelete);
		return "sucessfully Deleted";
	}
}