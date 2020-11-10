package at.project.stravinsky.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import at.project.stravinsky.entity.Developer;

@Repository
public class DeveloperDaoImpl implements DeveloperRepository {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public int insertDeveloper(Developer developer) {
		String query = "INSERT INTO developer (id, name) VALUES (?,?)";
		return jdbcTemplate.update(query, developer.getId(), developer.getName());
	}
	
	@Override
    public int updateDevelopers(Developer developers) {
        String query = "UPDATE developer SET name = ? WHERE id = ?";
    	return jdbcTemplate.update(query,developers.getName(), developers.getId());
    }
    
	@Override
    public int deleteDevelopersById(String id) {
        String query = "DELETE FROM developer WHERE id = ?";
        return jdbcTemplate.update(query, id);
    }

	@Override
	public Developer getDevelopersById(String id) {
		String query = "SELECT * FROM developer WHERE id = ?";
		return jdbcTemplate.queryForObject(
				query,
				new Object[] { id },
				(rowString,rowInt)->new Developer(rowString.getString("id"), rowString.getString("name")));
	}

	@Override
	public List<Developer> getAllDevelopers() {
		String query = "SELECT * FROM developer";
		return jdbcTemplate.query(
				query,
				(rs,rn)->new Developer(rs.getNString("id"),rs.getNString("name")));
	}

}
