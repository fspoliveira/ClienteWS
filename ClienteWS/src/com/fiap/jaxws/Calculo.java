package com.fiap.jaxws;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

@WebService
@SOAPBinding(style = Style.RPC)
public interface Calculo {
	
	@WebMethod int soma(int a, int b);
	@WebMethod String buscaEnderecoEntrega(int codCliente);

}
