package at.project.stravinsky.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import at.project.stravinsky.dao.DeveloperDao;
import at.project.stravinsky.entity.Developer;
import at.project.stravinsky.service.DeveloperService;


@Service("DeveloperServiceImpl")
@Transactional
public class DeveloperServiceImpl implements DeveloperService {
	//Une simple implémentation du service,
	//içi nous pouvons insérer au cas par cas les règles métiers.
	//exemple, lorsque nous ajoutons un développeur dans la BdD, 
	//nous pouvons ajouter une règle qui interdit que son pseudo soit composé que d'un caractère.
	//Lorsque nous récupérons un développeur avec son id, nous pouvons mettre son pseudo en majuscule...
	
	@Autowired
	private DeveloperDao developerDao;
	
	@Override
	public void insert(Developer dev) {
		developerDao.insertDeveloper(dev);
	}

	@Override
	public Developer getById(Integer id) {
		return developerDao.getDevelopersById(id);
	}

	@Override
	public List<Developer> getAll() {
		return developerDao.getAllDevelopers();
	}

	@Override
	public void update(Developer dev) {
		developerDao.updateDevelopers(dev);
	}

	@Override
	public void deleteById(Integer id) {
		developerDao.deleteDevelopersById(id);
	}

}
