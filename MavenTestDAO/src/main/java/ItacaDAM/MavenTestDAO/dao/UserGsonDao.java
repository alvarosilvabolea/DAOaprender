package ItacaDAM.MavenTestDAO.dao;

import java.util.List;
import java.util.Optional;

import ItacaDAM.MavenTestDAO.Dao;
import ItacaDAM.MavenTestDAO.model.User;
import ItacaDAM.MavenTestDAO.utils.DataRecoveryServices;

public class UserGsonDao implements Dao<User> {
	
	@Override
	public Optional<User> get(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> getAll() {
		
		return DataRecoveryServices.getUsers();
	}

	@Override
	public void save(User t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(User t, String[] params) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(User t) {
		// TODO Auto-generated method stub
		
	}

}
