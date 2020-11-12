package at.project.stravinsky.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import at.project.stravinsky.entity.User;

@Repository
public interface UserDao extends JpaRepository<User, Integer> {
	//Toutes les méthodes principales sont déjà héritées de JpaRepository.
}
