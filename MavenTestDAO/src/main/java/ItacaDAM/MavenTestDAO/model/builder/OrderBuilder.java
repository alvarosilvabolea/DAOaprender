package ItacaDAM.MavenTestDAO.model.builder;

import java.util.Optional;

import ItacaDAM.MavenTestDAO.dao.OrderDao;
import ItacaDAM.MavenTestDAO.exceptions.DuplicatedItemException;
import ItacaDAM.MavenTestDAO.exceptions.NotTasteAtAllException;
import ItacaDAM.MavenTestDAO.model.Ingredients;
import ItacaDAM.MavenTestDAO.model.Order;

public class OrderBuilder {

	
	public static Order build(Integer id,boolean anchoas, boolean pepperoni,
			boolean e_mozzarella, boolean jamon, 
			boolean  alcaparras, boolean maiz) 
					throws DuplicatedItemException, NotTasteAtAllException {
		
		OrderDao orderDao = new OrderDao();
		
		if(id < 0) {
			throw new IllegalArgumentException();					
		}
		
		if (anchoas == maiz == true) {
			throw new NotTasteAtAllException();
		}
		
		//Test if there is another order with the same id
		if ( orderDao.get(id).isPresent()) {
			throw new DuplicatedItemException();
		}
		
		return new Order(id, new Ingredients( anchoas, pepperoni, e_mozzarella, jamon, alcaparras, maiz));
	}
}
