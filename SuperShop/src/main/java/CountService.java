import org.example.db.dao.*;


public class CountService {

	ClientDao dao;
	
	public CountService(ClientDao dao){
		this.dao = dao;
	}
		
	public int countClients()
	{
		return dao.getAll().size();
	}
}
