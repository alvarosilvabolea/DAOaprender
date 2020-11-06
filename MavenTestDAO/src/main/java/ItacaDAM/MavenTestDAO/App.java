package ItacaDAM.MavenTestDAO;

import java.util.List;

import ItacaDAM.MavenTestDAO.dao.OrderGsonDao;
import ItacaDAM.MavenTestDAO.dao.UserDao;
import ItacaDAM.MavenTestDAO.exceptions.DuplicatedItemException;
import ItacaDAM.MavenTestDAO.model.Order;
import ItacaDAM.MavenTestDAO.model.User;
import ItacaDAM.MavenTestDAO.model.model.builder.OrderBuilder;


	public class App
	{
	    public static void main( String[] args )
	    {
	    	
	    	try {
				Order myOrder = OrderBuilder.build(1, false, false, false, false, false, false);
			} catch (DuplicatedItemException e) {
					System.out.println("Esta duplicado");
			}
	    	
	    	UserDao userDao = new UserDao();
	        List<User> myUsers = userDao.getAll();
	       
	        for(User u: myUsers) {
	        	System.out.println(u.toString());
	        }
	        
	        OrderGsonDao orderGsonDao = new OrderGsonDao();
	        List<Order> myOrdersGson = orderGsonDao.getAll();
	        System.out.println(myOrdersGson);
	       
	        
	    }
	}