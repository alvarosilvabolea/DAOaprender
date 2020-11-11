package ItacaDAM.MavenTestDAO.model.builder;

import ItacaDAM.MavenTestDAO.dao.OrderDao;
import ItacaDAM.MavenTestDAO.exceptions.DuplicatedItemException;
import ItacaDAM.MavenTestDAO.model.Order;

public class OrderBuilder {

	
	public static Order build(Integer id,boolean anchoas, boolean pepperoni,
			boolean e_mozzarella, boolean jamon, 
			boolean  alcaparras, boolean maiz) throws DuplicatedItemException {
		
		OrderDao orderDao = new OrderDao();
		
		//Test if there is another order with the same id
		if (!orderDao.get(id).equals(null)) {
			throw new DuplicatedItemException();
		}
		return null;
	}
}
