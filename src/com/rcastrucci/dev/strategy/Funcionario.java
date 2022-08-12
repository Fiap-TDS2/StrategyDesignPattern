package com.rcastrucci.dev.strategy;

import java.math.BigDecimal;

import com.rcastrucci.dev.domain.Pedido;

public interface Funcionario {
	
	public BigDecimal comissao(Pedido pedido);

}