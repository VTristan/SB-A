package at.project.stravinsky.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import at.project.stravinsky.dao.UserDao;
import at.project.stravinsky.entity.User;

@RestController
@RequestMapping("/stravinsky/")
@CrossOrigin(origins = "http://localhost:4200")
public class UserController {

	@Autowired
	UserDao userDao;

	@GetMapping("/getAll")
	@ResponseBody
	public List<User> getAll() {
		return userDao.findAll();
	}
}