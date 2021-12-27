package DataManagment;

public class dataEntry {

	public static void main(String args[])
	{
		//Testing adding Client -- status: Sucessful
		//addClient(2, "Abdul", "Hadi", "unchartedone", "8248492383", "abdulhadi@gmail.com", "mypassword");
		
		//Testing adding Free Lancer --status: Sucessful
		//addFreeLancer(1, "Ali", "Hussain", "theonlyOne", "03171585848", "aslinamhaikya613@gmail.com", "Talagang2");
	}
	
	/* Adding Client */
	public static  void addClient(int clientID, String firstName, 
			String lastName, String userName, String contact,
			String email, String password)
	{
		addUser(firstName, lastName, userName, contact, email, password, "client");
		String insertClientQuery = "INSERT INTO Riverr_db.CLIENT (CLIENT_ID, USERNAME) VALUES ('"+clientID+"', '"+userName+"')";
		DataConnection.executeQuery(insertClientQuery);
		saveChanges();
	}
	
	/*Adding Free Lancer*/
	public static  void addFreeLancer(int freeLancerID, String firstName, 
			String lastName, String userName, String contact,
			String email, String password)
	{
		addUser(firstName, lastName, userName, contact, email, password, "Free Lancer");
		String insertClientQuery = "INSERT INTO Riverr_db.FREE_LANCER (FREELANCERID, USERNAME) VALUES ('"+freeLancerID+"', '"+userName+"')";
		DataConnection.executeQuery(insertClientQuery);
		saveChanges();
	}
	
	/*Adding User*/
	private static void addUser(String firstName, 
			String lastName, String userName, String contact,
			String email, String password, String status)
	{
		//Inserting new user
		String insertUserQuery = "INSERT INTO USERS (FIRST_NAME, LAST_NAME, USERNAME, CONTACTS, EMAIL, PASSWORD, STATUS)"
				+ "VALUES ('"+firstName+"', '"+lastName+"', '"+userName+"',"
				+ " '"+contact+"', '"+email+"', '"+password+"', '"+status+"')";
		DataConnection.executeQuery(insertUserQuery);
	}
	
	/*Types of Packages*/
	public static void basicPackage(int packageID, int gigID, String Description,int price)
	{
		addPackage(packageID, gigID, "Basic", Description, price);
	}
	public static void standardPackage(int packageID, int gigID, String Description,int price)
	{
		addPackage(packageID, gigID, "Standard", Description, price);
	}
	public static void premiumPackage(int packageID, int gigID, String Description,int price)
	{
		addPackage(packageID, gigID, "Premium", Description, price);
	}
	
	/*Adding Package*/
	private static void addPackage(int packageID, int gigID, String packageType, String Description,int price)
	{
		String insertPackageQuery = "INSERT INTO \"RIVERR_DB\".\"PACKAGES\" (PRICE, DETAILED_DESCRIPTION, GIGS_ID, PACKAGETYPES_PACKAGETYPE, PACKAGES_ID) "
				+ "VALUES ('"+price+"', '"+Description+"', '"+gigID+"', '"+packageID+"', '"+packageType+"')";
		DataConnection.executeQuery(insertPackageQuery);
	}
	
	/*Adding Gigs*/
	public static void addGig(int gigID, String title, String description, int freeLancerID, String status)
	{
		//Inserting Gig//
		String insertGig = "INSERT INTO \"RIVERR_DB\".\"GIGS\" (ID, TITLE, DESCRIPTION, FREE_LANCER_FREELANCERID, STATUS)"
				+ " VALUES ('"+gigID+"', '"+title+"', '"+description+"', '"+freeLancerID+"', '"+status+"')";
		DataConnection.executeQuery(insertGig);
	}
	
	/*Adding Order*/
	public static void addOrder(String clientUserName, int packageID, String orderDescrip)
	{
		String insertOrder = "INSERT INTO \"RIVERR_DB\".\"ORDERS\" (CLIENT_USERNAME, PACKAGES_PACKAGES_ID, ORDERDESCRIP) "
				+ "VALUES ('"+clientUserName+"', '"+packageID+"', '"+orderDescrip+"')";
		DataConnection.executeQuery(insertOrder);
	}
	
	
	/*Saving Changes*/
	private static void saveChanges()
	{
		DataConnection.executeQuery("COMMIT");
	}
}
