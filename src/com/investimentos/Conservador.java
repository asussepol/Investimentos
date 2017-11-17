package com.investimentos;

public class Conservador implements CalcularInvestimentos {

	@Override
	public double calcular(double saldo) {
		
		double valorInvestimento= saldo*0.8;
		
		return valorInvestimento;
	}

}
