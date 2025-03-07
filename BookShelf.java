package hw4;
import java.util.ArrayList;

public class BookShelf {
    public char firstL;
    public ArrayList<Book> bookList;

    public BookShelf() {
        bookList = new ArrayList<>(8);
    }

    public BookShelf(char firstL, int shelfSize) {
        this.firstL = firstL;
        this.bookList = new ArrayList<>(shelfSize);
    }

    public int addBook(Book book) {
        for (int i = 0; i < bookList.size(); i++) {
            char bookFL = book.title.charAt(0);
            if (bookFL == firstL) {
                bookList.add(book);
                return i;
            }
        }
        return 1;
    }

    public Book removeBook(int spot) {
        return bookList.remove(spot);
    }

    @Override
    public String toString() {
        int bookCount = 0;
        for (int i = 0; i < bookList.size(); i++) {
            if (!bookList.isEmpty()) {
                bookCount++;
            }
            else {
            	System.out.println("Empty");
            }
        }
        	String strbookCount = String.valueOf(bookCount);
        return strbookCount;
    }
}
