package at.project.stravinsky.dao;

import java.util.List;

import at.project.stravinsky.entity.Developer;

public interface DeveloperRepository {

	public int insertDeveloper(Developer developer);

	public Developer getDevelopersById(String id);

	public List<Developer> getAllDevelopers();

	public int updateDevelopers(Developer developers);

	public int deleteDevelopersById(String id);

}
