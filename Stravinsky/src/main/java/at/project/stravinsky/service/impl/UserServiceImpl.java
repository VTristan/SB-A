package at.project.stravinsky.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import at.project.stravinsky.dao.UserDao;
import at.project.stravinsky.entity.User;
import at.project.stravinsky.service.UserService;


@Service("UserServiceImpl")
@Transactional
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserDao userDao;

	@Override
	public List<User> getAll() {
		return userDao.findAll();
	}
}
