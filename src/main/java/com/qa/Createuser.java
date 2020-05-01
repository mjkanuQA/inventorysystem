package com.qa;

import java.util.Scanner;

public class Createuser {

	CrudMethods c = new CrudMethods();
	int CustomerID = 0;

	
	public void insertUser() {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Please enter name:");
		String name = sc.nextLine();

		System.out.println("Please enter address:");
		String address = sc.nextLine();
		
		System.out.println("Please enter Post Code:");
		String postcode = sc.nextLine();
		
		System.out.println("Please enter Email:");
		String email = sc.nextLine();
		
		System.out.println("Please enter number:");
		String number = sc.nextLine();
		
		c.createUser(CustomerID, name, address, postcode, email, number);
		
		
		
	}
	
}
