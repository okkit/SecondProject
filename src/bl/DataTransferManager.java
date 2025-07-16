package bl;

import java.util.ArrayList;

import persistence.PersistenceManager;
import persistence.entities.Guest;
import persistence.fake.FakePersistenceManager;

public class DataTransferManager {
	
	public DataTransferManager() {
		super();
		// TODO Auto-generated constructor stub
	}

	PersistenceManager persistenceManager = new FakePersistenceManager();
	
	public ArrayList<GuestForm> getAllGuests(){
		 
		ArrayList<Guest> dbList = persistenceManager.getGastList();
		ArrayList<GuestForm> formList = new ArrayList<GuestForm>(dbList.size());
		
		System.out.println("create list of gguest:");
		for (Guest guest : dbList) {
			formList.add(new GuestForm(guest));
		}
		return formList;
	}

}
