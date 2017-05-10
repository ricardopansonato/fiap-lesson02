package br.com.fiap.lesson02;

public class ContaBancaria {
	protected Double saldo;
	
	public ContaBancaria() {
		this.saldo = 0d;
	}

	public void saque(Double valor) {
		saldo -= valor;
	}
	
	public void deposita(Double valor) {
		saldo += valor;
	}

	public Double getSaldo() {
		return saldo;
	}
}
