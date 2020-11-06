package ItacaDAM.MavenTestDAO.utils;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import com.google.gson.Gson;

import ItacaDAM.MavenTestDAO.model.Order;
import ItacaDAM.MavenTestDAO.model.User;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

/**
 *
 * @author darioaxel
 */
public class DataRecoveryServices {
    
	//Locate the file
    private static Path getLocalUserMockData() {
        return Paths.get(System.getProperty("user.dir"), "utils", "users.json");
    }
    private static Path getLocalOrdersMockData() {
        return Paths.get(System.getProperty("user.dir"), "utils", "orders.json");
    }
    
    
    // ORDERS
    
    public static List<Order> getOrders() {
        
        Gson gson = new Gson();
        Order[] orders;
        try {
            orders = gson.fromJson(new FileReader(getLocalOrdersMockData().toString()), Order[].class);            

        } catch (FileNotFoundException fnfe) {
            System.out.println("File not found!!");
            return null;
        }
        return Arrays.asList(orders);
        //System.out.println(gson.toJson(myTypes));
    }

    public static void saveOrders(List<Order> allUsers) {        
        Gson gson = new Gson();
        String usersJson = gson.toJson(allUsers.toArray());
        try (FileWriter fileWriter = new FileWriter(getLocalOrdersMockData().toString())) {
           fileWriter.write(usersJson);
        }catch (IOException fnfe) {
            System.out.println("File not found!!");            
        }
    }
    
    // USERS

    public static List<User> getUsers() {
           
        Gson gson = new Gson();
        User[] users;
        try {
            users = gson.fromJson(new FileReader(getLocalUserMockData().toString()), User[].class);            

        } catch (FileNotFoundException fnfe) {
            System.out.println("File not found!!");
            return null;
        }
        return Arrays.asList(users);
        //System.out.println(gson.toJson(myTypes));
    }

    public static void saveUsers(List<User> allUsers) {        
        Gson gson = new Gson();
        String usersJson = gson.toJson(allUsers.toArray());
        try (FileWriter fileWriter = new FileWriter(getLocalUserMockData().toString())) {
           fileWriter.write(usersJson);
        }catch (IOException fnfe) {
            System.out.println("File not found!!");            
        }
    }
}