package com.qa.createmenus;

import java.util.Scanner;

import com.qa.Createitem;
import com.qa.Createorder;
import com.qa.Createsupplier;
import com.qa.Createuser;
import com.qa.CrudMethods;

public class Selectmenu {

	CrudMethods cs = new CrudMethods();
	Createuser cu = new Createuser();
	Createsupplier cu1 = new Createsupplier();
	Createitem cu2 = new Createitem();
	Createorder cu3 = new Createorder();
	
	

	public void inputselect() {

		System.out.println("Select a table to view: 1 = Customer, 2 = Supplier, 3 = Item, 4 = Order");
		Scanner cc = new Scanner(System.in);

		String txt = cc.nextLine();
		switch (txt) {
		case "1":
			System.out.println(txt + " Selected Customer...");
			cs.selectUser();

			break;

		case "2":
			System.out.println(txt + " Selected Supplier...");
			cs.selectSupplier();
			break;

		case "3":
			System.out.println(txt + " Selected Item...");
			cs.selectItem();
			break;

		case "4":
			System.out.println(txt + " Selected Order...");
			cs.selectOrder();
			break;

		default:
			System.out.println("Invalid choice");
		}

	}

}
