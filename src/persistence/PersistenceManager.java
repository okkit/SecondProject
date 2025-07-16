package persistence;

import java.util.ArrayList;

import persistence.entities.DataAccessObject;
import persistence.entities.Guest;

public interface PersistenceManager {
	
	public String save(DataAccessObject dao);
	
	public ArrayList<Guest> getGastList();

}
