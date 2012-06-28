package com.fiap.jaxws;

import javax.jws.WebService;


@WebService(endpointInterface = "com.fiap.jaxws.Calculo")
public class CalculoImpl implements Calculo {

	public int soma(int a, int b) {
		return a+b;
	}

	public String buscaEnderecoEntrega(int codCliente) {
		if (codCliente ==1)
			return "Av. Lins de Vansconcelos";
		else if (codCliente ==2)
			return "Av. Paulista";
		else
			return "Av. Lins de Vansconcelos";
		
	}

	
}
