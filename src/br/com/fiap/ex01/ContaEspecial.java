package br.com.fiap.ex01;

import br.com.fiap.ex03.ContaBancaria;

public class ContaEspecial extends ContaBancaria {
	
	public ContaEspecial(Double saldo, String nomeCliente, String endCliente, String cpfCliente) {
		super(saldo, nomeCliente, endCliente, cpfCliente);
	}

	@Override
	public void saque(Double valor) {
		super.saque(valor * 1.1);
	}
	
	@Override
	public void deposita(Double valor) {
		super.deposita(valor * 0.9);
	}
}
