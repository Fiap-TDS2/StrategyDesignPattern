package com.rcastrucci.dev.main;

import java.math.BigDecimal;

import com.rcastrucci.dev.domain.CalculadoraComissao;
import com.rcastrucci.dev.domain.Pedido;
import com.rcastrucci.dev.domain.Vendedor;

public class Teste {
	
	public static void main(String[] args) {
		
		Pedido pedido = new Pedido();
		pedido.setValor(new BigDecimal("1000"));
		
		CalculadoraComissao comissao = new CalculadoraComissao();
		
		System.out.println(comissao.calcularComissao(pedido, new Vendedor()));
		
	}
	

}