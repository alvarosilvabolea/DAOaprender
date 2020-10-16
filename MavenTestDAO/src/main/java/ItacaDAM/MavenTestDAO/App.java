package ItacaDAM.MavenTestDAO;

import java.util.List;

import ItacaDAM.MavenTestDAO.dao.UserDao;
import ItacaDAM.MavenTestDAO.dao.UserGsonDao;
import ItacaDAM.MavenTestDAO.model.User;


	public class App
	{
	    public static void main( String[] args )
	    {
	    	UserDao userDao = new UserDao();
	        List<User> myUsers = userDao.getAll();
	       
	        for(User u: myUsers) {
	        	System.out.println(u.toString());
	        }
	        
	        UserGsonDao userGsonDao = new UserGsonDao();
	        List<User> myUsersGson = userGsonDao.getAll();
	        
	        for(User u: myUsersGson) {
	        	System.out.println(u.toString());
	        }
	    }
	}