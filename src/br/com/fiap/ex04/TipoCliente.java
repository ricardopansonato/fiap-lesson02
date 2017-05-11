package br.com.fiap.ex04;

import br.com.fiap.ex03.ContaBancaria;

public enum TipoCliente {
	POTENCIAL(400_000d, 500_000d),
	MEDIO(200_000d, 400_000d),
	BAIXO(0d, 200_000d);
	
	private Double minValue;
	private Double maxValue;
	
	private TipoCliente(Double minValue, Double maxValue) {
		this.minValue = minValue;
		this.maxValue = maxValue;
	}

	public Double getMinValue() {
		return minValue;
	}
	
	public Double getMaxValue() {
		return maxValue;
	}

	public boolean isCompatible(ContaBancaria conta) {
		return conta.getSaldo() >= minValue && conta.getSaldo() <= maxValue;
	}
}
