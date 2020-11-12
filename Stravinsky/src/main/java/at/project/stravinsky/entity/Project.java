package at.project.stravinsky.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="project")
public class Project {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "project_id")
	private Integer id;
    @Column(name = "name", nullable = false)
	private String name;
    @Column(name = "url", nullable = false)
	private String url;
    @Column(name = "description", nullable = true)
	private String description;
	@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinTable(name = "project_dev", joinColumns = @JoinColumn(name = "project_id"), inverseJoinColumns = @JoinColumn(name = "dev_id"))
	private List<Developer> creators;
	
	public Project(String name, String url, String description, List<Developer> creators) {
		this.name = name;
		this.url = url;
		this.description = description;
		this.creators = creators;
	}
	
	//ASSESSEURS//
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
    public List<Developer> getCreators() {
		return creators;
	}
	public void setCreators(List<Developer> creators) {
		this.creators = creators;
	}
	
}
