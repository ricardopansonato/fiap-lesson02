package br.com.fiap.ex01;

public abstract class Conta {
	protected double saldo;
	protected Cliente cliente;

	public abstract void saque(double valor);

	public void exibirSaldo() {
		System.out.println(saldo);
	}
}
