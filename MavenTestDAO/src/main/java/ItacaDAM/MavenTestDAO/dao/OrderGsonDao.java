package ItacaDAM.MavenTestDAO.dao;

import java.util.List;
import java.util.Optional;

import ItacaDAM.MavenTestDAO.dao.Dao;
import ItacaDAM.MavenTestDAO.model.Order;
import ItacaDAM.MavenTestDAO.utils.DataRecoveryServices;

public class OrderGsonDao implements Dao<Order> {

	@Override
	public Optional<Order> get(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Order> getAll() {
		// TODO Auto-generated method stub
		return DataRecoveryServices.getOrders();
	}

	@Override
	public void save(Order t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Order t, String[] params) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Order t) {
		// TODO Auto-generated method stub
		
	}


}
