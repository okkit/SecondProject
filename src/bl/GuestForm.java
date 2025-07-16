package bl;

import persistence.entities.Guest;

public class GuestForm {
	private int id;
	private String name;

	public GuestForm(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public GuestForm(Guest guest) {
		super();
		guest.setId(guest.getId());
		guest.setName(guest.getName());
		System.out.println("creates GuestForm; id = " + guest.getId());
	}
	public String toString() {
		return name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
