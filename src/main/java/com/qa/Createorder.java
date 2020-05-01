package com.qa;

import java.util.Scanner;

public class Createorder {

	CrudMethods cs = new CrudMethods();
	int OrderID = 0;
	int CustomerID = 1;
	int ItemID = 1;
	double price = 29.99;
	
	
	public void insertOrder() {
		
		Scanner scs = new Scanner(System.in);

		System.out.println("Please enter Quantity:");
		String quantity1 = scs.nextLine();

		System.out.println("Please enter Date:");
		String date = scs.nextLine();
		
//		System.out.println("Please enter Total:");
//		String total = scs.nextLine();
		
		Double x = Double.valueOf(quantity1);
		Double total1 = price * x;
		String total2 = String.valueOf(total1);
	
		
		System.out.println(total2);
		
		cs.createOrder(OrderID, CustomerID, ItemID, quantity1, date, total2);
		
		
		
	}
	
}
