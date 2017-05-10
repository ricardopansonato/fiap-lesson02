package br.com.fiap.lesson02;

public class Main {
	public static void main(String[] args) {
		ContaBancaria especial = new ContaEspecial();
		especial.deposita(10d);
		System.out.println(especial.getSaldo());
		especial.saque(2d);
		System.out.println(especial.getSaldo());
		
		System.out.println(fatorial(5l));
	}
	
	public static Long fatorial(Long valor) {
		return valor == 1 ? 1 : valor * fatorial(valor - 1);
	}
}
