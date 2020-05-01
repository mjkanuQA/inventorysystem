package com.qa;

import java.util.Scanner;

public class Createitem {
	CrudMethods c = new CrudMethods();
	int ItemID = 0;
	int SupplierID = 3;

	
	public void insertItem() {
		
		Scanner si = new Scanner(System.in);

		System.out.println("Please enter name:");
		String name = si.nextLine();

		System.out.println("Please enter quantity:");
		String quantity = si.nextLine();
		
		
		c.createItem(ItemID, SupplierID, name, quantity);
		
		
		
	}
}
