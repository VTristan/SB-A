package at.project.stravinsky.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import at.project.stravinsky.entity.Developer;
import at.project.stravinsky.service.DeveloperService;

//@CrossOrigin(origins = "http://localhost:8080")
@RestController
@RequestMapping("/rest/api/")
public class DeveloperController {
	//Pour la liaison avec la base de donnée, nous préférons utiliser DeveloperService 
	//plutôt que DeveloperDao!
	
	//déconseillé!
	//@Autowired
	//DeveloperDao developerDao;
	
	@Autowired
	DeveloperService developerService;
	
	@ResponseStatus(value = HttpStatus.OK)
	@GetMapping("/1/{string}")
	@ResponseBody
	public String test(@PathVariable String string) {
	    return "Lyoko " + string;
	}
	
//	@GetMapping("/2/{id}")
//	@ResponseBody
//	public String test2(@PathVariable Integer id) {
//	    return developerDao.getDevelopersById(id).toString();
//	}
	
	@GetMapping("/get/{id}")
	@ResponseBody
	public String getById(@PathVariable Integer id) {
	    return developerService.getById(id).toString();
	}
	
	@GetMapping("/get/")
	@ResponseBody
	public List<String> getAll() {
	    List<String> listDevString = new ArrayList<String>();
	    
	    for (Developer dev : developerService.getAll()) {
			listDevString.add(dev.toString());
		}
	    
	    return listDevString;
	    
	    //TODO: API STREAM!
	    //TODO: JSON!
	}
	
}
