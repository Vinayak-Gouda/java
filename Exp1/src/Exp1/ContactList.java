package Exp1;
import java.util.*;

public class ContactList {
	Scanner in = new Scanner(System.in);
	static ArrayList<Contact> c = new ArrayList<Contact>();
	public ContactList() {
		while(true) {
			System.out.println("Enter 1 to enter 0 to exit..");
			if(in.nextLine().equals("1")) {
				System.out.println("Enter Name:");
				String name = in.nextLine();
				System.out.println("Enter Phone Number:");
				long phone = in.nextLong();
				in.nextLine();
				Contact cs= new Contact(name,phone);
				c.add(cs);
			}
			else {
				break;
				}
			}
			
	}
			public static ArrayList<Contact> getclist(){
				return c;
				
			}
			public void viewList() {
				for(Contact i:c) {
					System.out.println(i);
				}
			}
}
