package br.com.fiap.ex01;

public class ContaInvestimento extends Conta {
	public void saque(double valor) {
		saldo -= valor + 0.03 * valor;
	}
}
