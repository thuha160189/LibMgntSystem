package lib.man.dataaccess;

import lib.man.model.Role;
import lib.man.model.User;

public class TestData {

	public static void main(String[] args) {
		User user1 = new User("king", "123", Role.BOTH);
		User user2 = new User("librarian", "123", Role.LIBRARIAN);
		User user3 = new User("admin", "123", Role.ADMINISTRATOR);
		DataAccess db = new DataAccessFacade();
		db.addNewUser(user1);
		db.addNewUser(user2);
		db.addNewUser(user3);
	}
}
