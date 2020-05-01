package com.qa.createmenus;

import java.util.Scanner;

import com.qa.Createitem;
import com.qa.Createorder;
import com.qa.Createsupplier;
import com.qa.Createuser;
import com.qa.CrudMethods;

public class Createmenu {

	CrudMethods cs = new CrudMethods();
	Createuser cu = new Createuser();
	Createsupplier cu1 = new Createsupplier();
	Createitem cu2 = new Createitem();
	Createorder cu3 = new Createorder();
	
	public void inputcreate() {
		
		
		System.out.println("Select a table to create record: 1 = Customer, 2 = Supplier, 3 = Item, 4 = Order");
	    Scanner cc = new Scanner(System.in);
	    
	    String txt = cc.nextLine();
	    switch (txt) {
	        case "1":
	            System.out.println(txt + " Selected Customer...");
	            cu.insertUser();
	            
	            break;

	        case "2":
	            System.out.println(txt + " Selected Supplier...");
	            cu1.insertSupplier();
	            break;

	        case "3":
	            System.out.println(txt + " Selected Item...");
	            cu2.insertItem();
	            break;

	        case "4":
	            System.out.println(txt + " Selected Order...");
	            cu3.insertOrder();
	            break;

	        default:
	            System.out.println("Invalid choice");
	   }
		
	}
}
