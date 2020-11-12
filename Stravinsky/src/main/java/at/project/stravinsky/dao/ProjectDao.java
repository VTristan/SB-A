package at.project.stravinsky.dao;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import at.project.stravinsky.entity.Project;

@Repository
public interface ProjectDao extends JpaRepository<Project, Integer>  {
	//Via JpaRepository, la plupart des opérations de base dont déjà implémentées.
	//Plus besoin d'implémenter cette interface!
	//Je peux évidemment rajouter des requêtes avec l'annotation @Query, 
	//exemple avec getProjectById qui s'ajoute à findById, herité de JpaRepository.
	
	@Query("SELECT d"
			 + "FROM project d"
			 + "WHERE id = :id")
		public Project getProjectById(@Param("id") String id);

}
