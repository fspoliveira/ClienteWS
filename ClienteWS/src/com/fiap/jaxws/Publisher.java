package com.fiap.jaxws;

import javax.xml.ws.Endpoint;

public class Publisher {


	public static void main(String[] args) {
		Endpoint.publish(
		         "http://localhost:8080/calculo",
		         new CalculoImpl());

	}

}
