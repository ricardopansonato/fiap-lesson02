package br.com.fiap;

import br.com.fiap.ex01.ContaEspecial;
import br.com.fiap.ex03.ContaBancaria;
import br.com.fiap.ex04.TipoCliente;

public class Main {
	public static void main(String[] args) {
		ContaBancaria especial = new ContaEspecial(0d,"TESTE","RUA","37091036816");
		especial.deposita(500010d);
		System.out.println(especial.getSaldo());
		especial.saque(2d);
		System.out.println(especial.getSaldo());
		System.out.println(especial.getTaxaBancaria(1, 10));
		System.out.print("Tipo: ");
		if (TipoCliente.BAIXO.isCompatible(especial)) {
			System.out.println(TipoCliente.BAIXO.name());
		}
		if (TipoCliente.MEDIO.isCompatible(especial)) {
			System.out.println(TipoCliente.MEDIO.name());
		}
		if (TipoCliente.POTENCIAL.isCompatible(especial)) {
			System.out.println(TipoCliente.POTENCIAL.name());
		}
		
		System.out.println(fatorial(5l));
	}
	
	public static Long fatorial(Long valor) {
		return valor == 1 ? 1 : valor * fatorial(valor - 1);
	}
}
