package com.rcastrucci.dev.domain;

import java.math.BigDecimal;

import com.rcastrucci.dev.singleton.ComissaoProperties;
import com.rcastrucci.dev.strategy.Funcionario;
import com.rcastrucci.dev.strategy.TipoFuncionario;

public class Vendedor implements Funcionario {

	@Override
	public BigDecimal comissao(Pedido pedido) {
		return (pedido.getValor().multiply(new BigDecimal(ComissaoProperties.getInstance().getProperty(TipoFuncionario.VENDEDOR.toString()))));
	}

}