import org.example.db.MockDb;
import org.example.db.dao.ClientDao;
import org.example.db.dao.MockClientDaoImpl;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MockDb db = new MockDb();
		ClientDao dao = new MockClientDaoImpl(db);
		CountService service = new CountService(dao);
		
		service.countClients();
		
	}

}
