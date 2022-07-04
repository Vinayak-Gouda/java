import java.util.*;

public class Main {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		BookList b1=new BookList();
		ArrayList<Book> al=new ArrayList<Book>();
		b1.getInput(al);
		ArrayList<Book> booklist=new ArrayList<Book>();
		for(Book b:al)
			booklist.add(b);
		booklist.sort(new BookCompare());
		System.out.println("After sorting :");
		for(Book b:booklist)
			System.out.println(b);
		b1.BookHashmap(booklist);
		System.out.println("Enter the title of book to search:");
		String t=sc.nextLine();
		b1.search_book(t,al);
		System.out.println("Enter the name to search his books:");
		String a=sc.nextLine();
		b1.search_auth(a);
		System.out.println("Enter publisher name to search for books:");
		String p=sc.nextLine();
		b1.search_pub(p);
		System.out.println("Enter the title of book whose publisher you wish to update:");
		String ut=sc.nextLine();
		System.out.println("Enter new publisher details:");
		String up=sc.nextLine();
		b1.update_pub(ut,up);
		sc.close();
	}

}
