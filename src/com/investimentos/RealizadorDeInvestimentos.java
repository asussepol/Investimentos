package com.investimentos;

public class RealizadorDeInvestimentos {
	
	
	
	
	public double calcularConservador(double saldo){
		
		Conservador con = new Conservador();
		double valorInvestido=con.calcular(saldo);
		
		return valorInvestido;
		
	}
	
	public double calcularModerado(double saldo){
		
		Moderado moderado= new Moderado();
		double valorInvestido= moderado.calcular(saldo);
		return valorInvestido;
	}
	
public double calcularArrojado(double saldo){
		
		Arrojado arrojado= new Arrojado();
		double valorInvestido= arrojado.calcular(saldo);
		return valorInvestido;
	}
	

}
