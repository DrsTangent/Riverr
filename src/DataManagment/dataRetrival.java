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
	
	/*RETRIEVING GIGS VIEWS*/
	public static ArrayList<ArrayList<Object>> getGigs()
	{
		String retriveGigs = "SELECT * FROM GIGVIEW";
		return DataConnection.executeQuery(retriveGigs);
	}
	
	/*RETRIVE ONE GIG*/
	public static ArrayList<Object> getGig(int gigID)
	{
		String retriveGig = "SELECT * FROM DETAILEDGIG WHERE DETAILEDGIG.ID = "+gigID;
		return DataConnection.executeQuery(retriveGig).get(0);
	}
	
	/*Get Available Packages of a certain gig*/
	public static ArrayList<ArrayList<Object>> getPackages(int gigID)
	{
		String retrivePackages = "SELECT PACKAGES_ID, PACKAGETYPES_PACKAGETYPE, PRICE, DETAILED_DESCRIPTION FROM PACKAGES WHERE GIGS_ID = "+gigID;
		return DataConnection.executeQuery(retrivePackages);
	}
	
	public static ArrayList<ArrayList<Object>> getPendingOrders(String username)
	{
		String retrivePendingOrders = "SELECT * FROM PENDINGORDERS WHERE CLIENT_USERNAME = '" + username + "'";
		return DataConnection.executeQuery(retrivePendingOrders);
	}
	
	public static ArrayList<ArrayList<Object>> getCompletedOrders(String username)
	{
		String retrivePendingOrders = "SELECT * FROM COMPLETEDORDERS WHERE CLIENT_USERNAME = '" + username + "'";
		return DataConnection.executeQuery(retrivePendingOrders);
	}
}
