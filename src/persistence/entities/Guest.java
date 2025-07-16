package persistence.entities;

public class Guest extends DataAccessObject {

	private String name;
	
	

	public Guest(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
