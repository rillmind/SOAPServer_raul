package br.edu.ifpe.soapserver.ws.service;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import javax.jws.WebService;

import br.edu.ifpe.soapserver.ws.model.Book;

@WebService(endpointInterface = "br.edu.ifpe.soapserver.ws.service.BookService")
public class BookServiceImpl implements BookService {

	private static Map<String, Book> books = new HashMap<String, Book>();

	@Override
	public boolean addBook(Book book) {
		if (books.get(book.getCode()) != null)
			return false;
		System.out.println("Adding book: " + book);
		books.put(book.getCode(), book);
		return true;
	}

	@Override
	public boolean removeBook(String code) {
		if (books.get(code) == null)
			return false;
		System.out.println("Removing book: " + books.get(code));
		books.remove(code);
		return true;
	}

	@Override
	public Book getBookById(String code) {
		System.out.println("Getting book: " + books.get(code));
		return books.get(code);
	}

	@Override
	public Book[] getBooks() {
		System.out.println("Listing Books...");
		Set<String> codes = books.keySet();
		Book[] p = new Book[codes.size()];
		int i = 0;
		for (String code : codes) {
			p[i] = books.get(code);
			System.out.println("Book: " + p[i]);
			i++;
		}
		return p;
	}

	@Override
	public boolean isBookAvailable(String code) {
		if (books.get(code) != null) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public boolean isBookCostAbove(String code, double value) {
		Book book = books.get(code);
		if (book != null && book.getCost() > value) {
			return true;
		} else {
			return false;
		}
	}

	public BookServiceImpl() {
		// TODO Auto-generated constructor stub
	}
}
