package br.edu.ifpe.soapserver.ws.publisher;

import javax.xml.ws.Endpoint;

import br.edu.ifpe.soapserver.ws.service.BookServiceImpl;

public class ServicePublisher {

	public static void main(String[] args) {
		System.out.println("Publishing services...");
		Endpoint.publish("http://localhost:8888/ws/Book", new BookServiceImpl());
		System.out.println("Service Published...");
	}
}
