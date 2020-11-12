package at.project.stravinsky.service;

import java.util.List;

import at.project.stravinsky.entity.Project;

public interface ProjectService {
	//Si le but du Dao est de communiquer avec la BdD.
	//Le but du service est de lui appliquer des règles métiers et de sécurité.
	//Nous pouvons ne laisser que certaines actions disponible aussi.
	
	public List<Project> getAll();
}
