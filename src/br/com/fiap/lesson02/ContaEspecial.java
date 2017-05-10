package br.com.fiap.lesson02;

public class ContaEspecial extends ContaBancaria {
	
	@Override
	public void saque(Double valor) {
		super.saque(valor * 1.1);
	}
	
	@Override
	public void deposita(Double valor) {
		super.deposita(valor * 0.9);
	}
}
