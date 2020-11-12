package at.project.stravinsky.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import at.project.stravinsky.dao.DeveloperDao;
import at.project.stravinsky.entity.Developer;

@Repository
public class DeveloperDaoImpl implements DeveloperDao {
	//Nous utilisons JdbcTemplate içi, pour implémenter plus facilement
	//chacune des méthodes provenants de l'interface.
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public int insertDeveloper(Developer developer) {
		String query = "INSERT INTO developer (dev_id, pseudo) VALUES (?,?)";
		return jdbcTemplate.update(query, developer.getId(), developer.getPseudo());
	}
	
	@Override
    public int updateDevelopers(Developer developers) {
        String query = "UPDATE developer SET pseudo = ? WHERE dev_id = ?";
    	return jdbcTemplate.update(query,developers.getPseudo(), developers.getId());
    }
    
	@Override
    public int deleteDevelopersById(Integer id) {
        String query = "DELETE FROM developer WHERE dev_id = ?";
        return jdbcTemplate.update(query, id);
    }

	@Override
	public Developer getDevelopersById(Integer id) {
		String query = "SELECT * FROM developer WHERE dev_id = ?";
		return jdbcTemplate.queryForObject(
				query,
				new Object[] { id },
				(rowString,rowInt)->new Developer(rowString.getInt("dev_id"), rowString.getString("pseudo")));
	}

	@Override
	public List<Developer> getAllDevelopers() {
		String query = "SELECT * FROM developer";
		return jdbcTemplate.query(
				query,
				(rs,rn)->new Developer(rs.getInt("dev_id"),rs.getString("pseudo")));
	}


}
