package at.project.stravinsky.dao;

import java.util.List;

import at.project.stravinsky.entity.Developer;

public interface DeveloperDao {
	//Ici, aucune annotation, une simple interface.
	//Nous listons les méthodes qui permetterons d'interagir avec la BdD.
	
	public int insertDeveloper(Developer developer);

	public Developer getDevelopersById(Integer id);

	public List<Developer> getAllDevelopers();

	public int updateDevelopers(Developer developers);

	public int deleteDevelopersById(Integer id);

}
