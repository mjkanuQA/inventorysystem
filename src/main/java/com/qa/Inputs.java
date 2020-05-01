package com.qa;

import java.util.Scanner;

import com.qa.createmenus.Createmenu;
import com.qa.createmenus.Deletemenu;
import com.qa.createmenus.Selectmenu;
import com.qa.createmenus.Updatemenu;

public class Inputs {

	Createuser cu = new Createuser();
	Createmenu cm = new Createmenu();
	Selectmenu cm2 = new Selectmenu();
	Deletemenu cm3 = new Deletemenu();
	Updatemenu cm4 = new Updatemenu();

	Createsupplier cu1 = new Createsupplier();
	CrudMethods c = new CrudMethods();

	public void inputs() {

//		Create methods

		System.out.println("Select a function: 1 = Create, 2 = Select, 3 = Update, 4 = Delete. ");
		Scanner cc = new Scanner(System.in);

		String txt = cc.nextLine();
		switch (txt) {
		case "1":
			System.out.println(txt + " Selected Create...");
			cm.inputcreate();

			break;

		case "2":
			System.out.println(txt + " Selected Select...");
			cm2.inputselect();
			break;

		case "3":
			System.out.println(txt + " Selected Update...");
			cm4.inputupdate();
			break;

		case "4":
			System.out.println(txt + " Selected Delete...");
			cm3.inputdelete();
			break;

		default:
			System.out.println("Invalid choice");
		}

//		cu1.insertSupplier();
//		cu.insertUser();

//		 c.createUser(3, name, "'50 High Street'", "'SE14 LNQ'","'star@mail.com'", "'07567428910'");
//		 c.updateUser(1);
//		 c.deleteUser(3);
//		 c.selectUser();

//		 c.createItem(1, 0,  "'Just Cause 4'", "'200'");
//		 c.selectItem();

	}

}
