package com.rcastrucci.dev.domain;

import java.math.BigDecimal;

import com.rcastrucci.dev.strategy.Funcionario;

public class CalculadoraComissao {
	
	public BigDecimal calcularComissao(Pedido pedido, Funcionario funcionario) {
		return funcionario.comissao(pedido);
	}

}