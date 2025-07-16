package persistence.fake;

import java.util.ArrayList;

import persistence.PersistenceManager;
import persistence.entities.DataAccessObject;
import persistence.entities.Guest;

public class FakePersistenceManager implements PersistenceManager {

	@Override
	public String save(DataAccessObject dao) {
		// not necessary in this project, therefore not implemented
		return null;
	}

	@Override
	public ArrayList<Guest> getGastList() {
		int count = 20;
		ArrayList<Guest> retList = new ArrayList<>(count);

		for (int i = 0; i < count; i++) {
			retList.add(new Guest("Person Nr. " + i));
		}
		return retList;
	}

}
