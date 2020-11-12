package at.project.stravinsky.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import at.project.stravinsky.dao.ProjectDao;
import at.project.stravinsky.entity.Project;
import at.project.stravinsky.service.ProjectService;


@Service("ProjectServiceImpl")
@Transactional
public class ProjectServiceImpl implements ProjectService {
	
	@Autowired
	private ProjectDao projectDao;

	@Override
	public List<Project> getAll() {
		return projectDao.findAll();
	}
	
}
