package relations;

import java.util.ArrayList;

import DataManagment.dataRetrival;

public class User {
	private static String userName;
	private static String firstName;
	private static String lastName;
	private static String contactNumber;
	private static String emailAddress;
	
	public static boolean login(String userName, String password)
	{
		ArrayList<ArrayList<Object>> data = dataRetrival.getClientData(userName, password);
		if(!data.isEmpty())
		{
			User.userName = (String) data.get(0).get(0);
			User.firstName = (String) data.get(0).get(2);
			User.lastName = (String) data.get(0).get(3);
			User.contactNumber = (String) data.get(0).get(7);
			User.emailAddress = (String) data.get(0).get(5);
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public static String getUserName()
	{
		return User.userName;
	}
	
	public static String getFirstName()
	{
		return User.firstName;
	}

	public static String getLastName() {
		return lastName;
	}

	public static String getContactNumber() {
		return contactNumber;
	}

	public static String getEmailAddress() {
		return emailAddress;
	}
}
