package at.project.stravinsky.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import at.project.stravinsky.dao.DeveloperRepository;
import at.project.stravinsky.entity.Developer;

//@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class DeveloperController {
	
	@Autowired
	DeveloperRepository dao;
	
	@ResponseStatus(value = HttpStatus.OK)
	@GetMapping("/test/{string}")
	@ResponseBody
	public String test(@PathVariable String string) {
	    return "Lyoko " + string;
	}
	
	@GetMapping("/dev/{id}")
	public String getEmployeesById(@PathVariable String id) {
	    return dao.getDevelopersById(id).toString();
	}
	
	  
	

}
