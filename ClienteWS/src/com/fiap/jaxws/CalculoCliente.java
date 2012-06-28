package com.fiap.jaxws;

import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

public class CalculoCliente {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try { 
//			CircleFunctionsService service =	new CircleFunctionsService();
//			ws.CircleFunctions port = service.getCircleFunctionsPort();
//			// TODO initialize WS operation arguments here
//			double arg0 = 3.0;
//			// TODO process result here
//			double result = port.getArea(arg0);
//			System.out.println("Result = "+result);
			
			URL url = new URL("http://localhost:8080/calculo?wsdl");
			QName qname = new QName("http://jaxws.fiap.com/", "CalculoImplService");

			Service service = Service.create(url, qname);
			Calculo eif = service.getPort(Calculo.class);
			System.out.println(eif.soma(1, 3));
			

		} catch (Exception ex) {
			ex.printStackTrace();
		}
		// TODO code application logic here
	}


}
