package at.project.stravinsky;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import at.project.stravinsky.dao.DeveloperRepository;
import at.project.stravinsky.entity.Developer;

@SpringBootApplication
public class StravinskyApplication implements CommandLineRunner {

	@Autowired
	DeveloperRepository dao;
	
	public static void main(String[] args) {
		SpringApplication.run(StravinskyApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		//startActionOnWamp();
	}

	private void startActionOnWamp() {
		System.out.println("deleteDevelopersById");
		dao.deleteDevelopersById("1");
		
		System.out.println("insertDeveloper");
		dao.insertDeveloper(new Developer("1", "XANA"));
		dao.insertDeveloper(new Developer("2", "Aelita"));
		dao.insertDeveloper(new Developer("3", "Jerem"));
		System.out.println("--------------");

		System.out.println("getDevelopersById");
		dao.getDevelopersById("3");
		System.out.println("--------------");

		System.out.println("getAllDevelopers");
		dao.getAllDevelopers();
		System.out.println("--------------");

		System.out.println("updateDevelopers");
		dao.updateDevelopers(new Developer("3","Jeremy"));
		System.out.println("--------------");
	}

}
