package com.qa;

import java.util.Scanner;

public class Createsupplier {

	CrudMethods cs = new CrudMethods();
	int SupplierID = 0;

	
	public void insertSupplier() {
		
		Scanner scs = new Scanner(System.in);

		System.out.println("Please enter name:");
		String name = scs.nextLine();

		System.out.println("Please enter address:");
		String address = scs.nextLine();
		
		System.out.println("Please enter Post Code:");
		String postcode = scs.nextLine();
		
		System.out.println("Please enter city:");
		String city = scs.nextLine();
		
		System.out.println("Please enter number:");
		String number = scs.nextLine();
		
		cs.createSupplier(SupplierID, name, address, postcode, city, number);
		
		
		
	}
	
}