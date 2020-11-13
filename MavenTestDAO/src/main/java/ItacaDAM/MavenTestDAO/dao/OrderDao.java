package ItacaDAM.MavenTestDAO.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import ItacaDAM.MavenTestDAO.model.Ingredients;
import ItacaDAM.MavenTestDAO.model.Order;

public class OrderDao implements Dao<Order> {
	
	private List<Order> orders;
	
	public OrderDao() {
		orders = new ArrayList<Order>();
		Order order1 = new Order(1, new Ingredients(true, false, true, false, true, false));
		Order order2 = new Order(2, new Ingredients(true, false, true, false, true, false));
		orders.add(order1);
		orders.add(order2);
	}
	
	@Override
	public Optional<Order> get(long id) {
		Order searchOrder = null;
		
		for(Order o: orders) {
			if (o.getId() == id ) {
				searchOrder = o;
			}
		}		
		return Optional.ofNullable(searchOrder);
	}

	@Override
	public List<Order> getAll() {
		// TODO Auto-generated method stub
		return orders;
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
