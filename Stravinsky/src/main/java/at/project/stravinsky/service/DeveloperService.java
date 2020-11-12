package at.project.stravinsky.service;

import java.util.List;

import at.project.stravinsky.entity.Developer;

public interface DeveloperService {
	//Si le but du Dao est de communiquer avec la BdD.
	//Le but du service est de lui appliquer des règles métiers et de sécurité.

	public void insert(Developer object);
	public Developer getById(Integer id);
	public List<Developer> getAll();
	public void update(Developer object);
	public void deleteById(Integer id);
}
