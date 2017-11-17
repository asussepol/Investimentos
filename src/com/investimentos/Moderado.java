package com.investimentos;

public class Moderado implements InvestimentosComChances {

	@Override
	public double calcular(double saldo) {
		
		double investimento =0;
		double chance= new java.util.Random().nextDouble();
		
		if(chance>0.5){
			
		 investimento=saldo * 0.7;
		 return investimento;
		}else{
		return	investimento=saldo * 2.5;
		}
		
	}

	

}
