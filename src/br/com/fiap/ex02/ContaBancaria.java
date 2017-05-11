package br.com.fiap.ex02;


public class ContaBancaria {
	protected static final Double TAXA_BANCARIA = 1d;

	protected Double saldo;
	protected String nomeCliente;
	protected String endCliente;
	protected String cpfCliente;

	public ContaBancaria(Double saldo, String nomeCliente, String endCliente, String cpfCliente) {
		super();
		this.saldo = saldo;
		this.nomeCliente = nomeCliente;
		this.endCliente = endCliente;
		this.cpfCliente = cpfCliente;
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
	
	public Double getTaxaBancaria() {
		return TAXA_BANCARIA;
	}
	
	public Double getTaxaBancaria(int dias) {
		return getTaxaBancaria() * dias;
	}
	
	public Double getTaxaBancaria(int dias, int meses) {
		return getTaxaBancaria(dias + (meses * 30));
	}
}
