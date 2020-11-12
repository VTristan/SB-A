package at.project.stravinsky;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import at.project.stravinsky.dao.DeveloperDao;
import at.project.stravinsky.dao.ProjectDao;
import at.project.stravinsky.dao.UserDao;
import at.project.stravinsky.entity.Developer;
import at.project.stravinsky.entity.User;

@SpringBootApplication
public class Program implements CommandLineRunner {

	//Non obligatoire!
	@Autowired
	DeveloperDao developerDao;
	@Autowired
	ProjectDao projectDao;
	@Autowired
	UserDao userDao;
	
	public static void main(String[] args) {
		SpringApplication.run(Program.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		startAction();
	}

	//pour initialiser la bdd
	private void startAction() {
		System.out.println("Insertions...");
		
		developerDao.insertDeveloper(new Developer("XANA"));
		//developerDao.insertDeveloper(new Developer("DEFAULT"));
		
		userDao.save(new User("Vlasic", "Tristan"));
		userDao.save(new User("Alias", "Antoine"));
		userDao.save(new User("Christ", "Jesus"));
		
		//projectDao.save(new Project("Which-er", "www.git", "flip the rule of the dating", Arrays.asList(new Developer("XANA"),new Developer("DEFAULT"))));
		
		System.out.println("Insertions terminées!");
	}

}
