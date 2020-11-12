package at.project.stravinsky.service;

import java.util.List;

import at.project.stravinsky.entity.User;

//TODO: rendre générique une classe service.
public interface UserService {

	public List<User> getAll();
}
