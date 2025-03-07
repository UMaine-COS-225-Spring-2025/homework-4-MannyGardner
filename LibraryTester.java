package hw4; //UNFINISHED SORRY :(

public class LibraryTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BookShelf bs1 = new BookShelf('O',8);
		BookShelf bs2 = new BookShelf('T',8);
		
		System.out.println(bs1);
		System.out.println(bs2);
		
		Book book1 = new Book("The Heart of the Betrayed", "Crime");
		Book book2 = new Book("Our Hill of Stars","Fantasy");
		Book book3 = new Book("One of a Kind","Science Fiction");
		Book book4 = new Book("The Vision of Romance","Romance");
		
		System.out.println(book1);
		System.out.println(book2);
		System.out.println(book3);
		System.out.println(book4);
		
		bs1.addBook(book1); bs2.addBook(book1);
		bs1.addBook(book2); bs2.addBook(book2);
		bs1.addBook(book3); bs2.addBook(book3);
		bs1.addBook(book4); bs2.addBook(book4);
		
		System.out.println(bs1);
		System.out.println(bs2);
		

		
	}

}
