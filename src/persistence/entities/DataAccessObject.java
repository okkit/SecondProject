package persistence.entities;

public abstract class DataAccessObject {

	private int id;

	public DataAccessObject() {
		super();
	}

	public DataAccessObject(int id) {
		super();
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
