package br.edu.ifpe.soapserver.ws.service;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

import br.edu.ifpe.soapserver.ws.model.Book;

@WebService
@SOAPBinding(style = Style.RPC)
public interface BookService {

	@WebMethod
	public boolean addBook(Book book);

	@WebMethod
	public boolean removeBook(String code);

	@WebMethod
	public Book getBookById(String code);

	@WebMethod
	public Book[] getBooks();

	@WebMethod
	public boolean isBookAvailable(String code);

	@WebMethod
	public boolean isBookCostAbove(String code, double value);
}
