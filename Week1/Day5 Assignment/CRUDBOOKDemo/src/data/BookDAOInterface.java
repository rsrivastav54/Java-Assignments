package data;

import java.util.ArrayList;

import model.Book;

public interface BookDAOInterface {
	
	ArrayList<Book> getAllBooks();
	String addBook(Book book);
	boolean updatePrice(int bId, int bPrice);
	Book searchBookbyName(String bname);
}
