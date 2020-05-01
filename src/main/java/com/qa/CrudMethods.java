package com.qa;
import java.sql.*;
//import junit


public class CrudMethods {

	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://34.89.39.91:3306/system?useSSL=false";
	static final String USER = "root";
	static final String PASS = "root";

	Connection conn = null;
	Statement stmt = null;
	static final String tableName = "Customer";
	static final String tableName1 = "Supplier";
	static final String tableName2 = "Item";
	static final String tableName3 = "Order";
	

	public CrudMethods() {
		try {
			Class.forName(JDBC_DRIVER);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		System.out.println("Connecting to database system...");

		try {
			conn = DriverManager.getConnection(DB_URL, USER, PASS);
			System.out.println("Connection Established.");
		} catch (SQLException e) {
			e.printStackTrace();
		}

		try {
			stmt = conn.createStatement();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

//
//CREATE METHODS
//

	public void createUser(int CustomerID, String Name, String Address, String Postcode, String Email, String Number) {
		System.out.println("Starting insert statement.");
		String sqlInsert = "INSERT INTO " + tableName + "  (CustomerId, Name, Address, Postcode, Email, Number) VALUES("
				+ CustomerID + ", '" + Name + "', '" + Address + "', '" + Postcode + "', '" + Email + "', " + Number + ")";

		try {
			stmt.executeUpdate(sqlInsert);
			System.out.println("Record Inserted.");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	
	public void createSupplier(int SupplierID, String Name, String Address, String Postcode, String City, String Number) {
		System.out.println("Starting insert statement.");
		String sqlInsert = "INSERT INTO " + tableName1 + "  (SupplierID, Name, Address, Postcode, City, Number) VALUES(" + SupplierID
				+ ", '" + Name + "', '" + Address + "', '" + Postcode + "','" + City + "', '" + Number + "')";

		try {
			stmt.executeUpdate(sqlInsert);
			System.out.println("Record Inserted into supplier table.");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	
	public void createItem(int ItemID, int supplierid, String Name, String Quantity) {
		System.out.println("Starting insert statement.");
		String sqlInsert = "INSERT INTO " + tableName2 + "  (ItemID, SupplierID, Name, Quantity) VALUES(" + ItemID
				+ ", '" + supplierid + "', '" + Name + "', '" + Quantity + "')";

		try {
			stmt.executeUpdate(sqlInsert);
			System.out.println("Record Inserted.");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void createOrder(int OrderID, int CustomerID, int ItemID, String Quantity, String Date, String Total) {
		System.out.println("Starting insert statement.");
		String sqlInsert = "INSERT INTO " + tableName3 + "  (OrderID, CustomerID, ItemID, Quantity, Date, Total) VALUES(" + OrderID
				+ ", " + CustomerID + ", " + ItemID + ", '" + Quantity + "','" + Date + "', '" + Total + "')";

		try {
			stmt.executeUpdate(sqlInsert);
			System.out.println("Record Inserted into order table.");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	

	//
	// SELECT METHODS
	//

	public void selectUser() {

		String sql2 = "SELECT CustomerID, Name, Address, Postcode, Email, Number from " + tableName;

		ResultSet rs = null;
		try {
			rs = stmt.executeQuery(sql2);
		} catch (SQLException e) {
			e.printStackTrace();
		}

		try {
			while (rs.next()) {
				int custid = rs.getInt("CustomerID");
				String name1 = rs.getString("Name");
				String address1 = rs.getString("Address");
				String postcode1 = rs.getString("Postcode");
				String email1 = rs.getString("Email");
				String number1 = rs.getString("Number");
				System.out.println("CustomerID: " + custid + " Name: " + name1 + " Address: " + address1 + " Postcode: "
						+ postcode1 + " Email: " + email1 + " Number: " + number1);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
	
	
	public void selectSupplier() {

		String sql2 = "SELECT SupplierID, Name, Address, Postcode, City, Number from " + tableName1;

		ResultSet rs = null;
		try {
			rs = stmt.executeQuery(sql2);
		} catch (SQLException e) {
			e.printStackTrace();
		}

		try {
			while (rs.next()) {
				int supplierid = rs.getInt("SupplierID");
				String name2 = rs.getString("Name");
				String address2 = rs.getString("Address");
				String postcode2 = rs.getString("Postcode");
				String city = rs.getString("City");
				String number2 = rs.getString("Number");
				System.out.println("Supplier ID: " + supplierid + " Name: " + name2 + " Address: " + address2
						+ " Postcode: " + postcode2 + " City: " + city + " Number: " + number2);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
	

	public void selectItem() {

		String sql2 = "SELECT ItemID, SupplierID, Name, Quantity from " + tableName2;

		ResultSet rs = null;
		try {
			rs = stmt.executeQuery(sql2);
		} catch (SQLException e) {
			e.printStackTrace();
		}

		try {
			while (rs.next()) {
				int itemid = rs.getInt("ItemID");
				int suppid = rs.getInt("SupplierID");
				String name1 = rs.getString("Name");
				String quantity1 = rs.getString("Quantity");
				System.out.println(
						"Item ID: " + itemid + " Supplier: " + suppid + " Name: " + name1 + " Quantity: " + quantity1);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public void selectOrder() {

		String sql2 = "SELECT OrderID, CustomerID, ItemID, Quantity, Date, Total from " + tableName3;

		ResultSet rs = null;
		try {
			rs = stmt.executeQuery(sql2);
		} catch (SQLException e) {
			e.printStackTrace();
		}

		try {
			while (rs.next()) {
				int orderid = rs.getInt("OrderID");
				int custid2 = rs.getInt("CustomerID");
				int itemid2 = rs.getInt("ItemID");
				String quantity2 = rs.getString("Quantity");
				String date = rs.getString("Date");
				String total = rs.getString("Total");
				System.out.println("Order ID: " + orderid + " Customer ID: " + custid2 + " Item ID: " + itemid2
						+ " Quantity: " + quantity2 + " Date: " + date + " Total: " + total);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
	
	
	
//
//UPDATE METHODS
//

	public void updateUser(int CustomerID) {
		System.out.println("Update Statement.");
		String sql3 = "UPDATE " + tableName + " set name='Troy' where CustomerID= " + CustomerID + ";";
		try {
			stmt.executeUpdate(sql3);
			System.out.println("Record has now been updated.");
		} catch (SQLException e) {
			System.out.println("An error has occured.");
			e.printStackTrace();
		}

	}
	
	public void updateSupplier(int SupplierID) {
		System.out.println("Update Statement.");
		String sql3 = "UPDATE " + tableName1 + " set name='Holden Games Ltd' where SupplierID= " + SupplierID + ";";
		try {
			stmt.executeUpdate(sql3);
			System.out.println("Record has now been updated.");
		} catch (SQLException e) {
			System.out.println("An error has occured.");
			e.printStackTrace();
		}

	}
	

	public void updateItem(int ItemID) {
		System.out.println("Update Statement.");
		String sql3 = "UPDATE " + tableName2 + " set name='Just Cause 4' where ItemID= " + ItemID + ";";
		try {
			stmt.executeUpdate(sql3);
			System.out.println("Record has now been updated.");
		} catch (SQLException e) {
			System.out.println("An error has occured.");
			e.printStackTrace();
		}

	}
	
	public void updateOrder (int OrderID) {
		System.out.println("Update Statement.");
		String sql3 = "UPDATE " + tableName3 + " set quantity='240' where OrderID= " + OrderID + ";";
		try {
			stmt.executeUpdate(sql3);
			System.out.println("Record has now been updated.");
		} catch (SQLException e) {
			System.out.println("An error has occured.");
			e.printStackTrace();
		}

	}
	
	

//
//DELETE METHODS
//

	public void deleteUser(int CustomerID) {
		System.out.println("Delete Statement");
		String sql4 = "delete from " + tableName + " where customerID= " + CustomerID + ";";
		System.out.println(sql4);
		try {
			stmt.executeUpdate(sql4);
			System.out.println("Record has now been deleted from " + tableName);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void deleteSupplier(int SupplierID) {
		System.out.println("Delete Statement");
		String sql4 = "delete from " + tableName1 + " where SupplierID= " + SupplierID + ";";
		System.out.println(sql4);
		try {
			stmt.executeUpdate(sql4);
			System.out.println("Record has now been deleted from " + tableName1);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	
	public void deleteItem(int ItemID) {
		System.out.println("Delete Statement");
		String sql4 = "delete from " + tableName2 + " where ItemID= " + ItemID + ";";
		System.out.println(sql4);
		try {
			stmt.executeUpdate(sql4);
			System.out.println("Record has now been deleted from " + tableName2);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void deleteOrder(int OrderID) {
		System.out.println("Delete Statement");
		String sql4 = "delete from " + tableName3 + " where ItemID= " + OrderID + ";";
		System.out.println(sql4);
		try {
			stmt.executeUpdate(sql4);
			System.out.println("Record has now been deleted from " + tableName3);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	
	

}
