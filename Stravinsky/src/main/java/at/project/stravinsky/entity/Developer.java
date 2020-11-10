package at.project.stravinsky.entity;

public class Developer {
	private String id;
	private String name;
	
	public Developer(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Developers [id=" + id + ", name=" + name + "]";
	}
	
}
