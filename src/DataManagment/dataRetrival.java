package DataManagment;

import java.sql.ResultSet;
import java.util.ArrayList;

public class dataRetrival {
	public static void main(String args[])
	{
		
	}
	
	/*Retriving Client Data*/
	public static ArrayList<ArrayList<Object>> getClientData(String userName, String password)
	{
		String retrivalCommand = "SELECT * FROM  CLIENT natural join USERS "
				+ "WHERE USERNAME = '"+userName+"' and PASSWORD = '"+password+"'";
		System.out.println(retrivalCommand);
		return DataConnection.executeQuery(retrivalCommand);
	}
	
	/*Retriving FreeLancer Data*/
	public static ArrayList<ArrayList<Object>> getFreeLancerData(String userName, String password)
	{
		String retrivalCommand = "SELECT * FROM  FREE_LANCER natural join USERS "
				+ "WHERE USERNAME = '"+userName+"' and PASSWORD = '"+password+"'";
		return DataConnection.executeQuery(retrivalCommand);
	}
	
	
	
}
