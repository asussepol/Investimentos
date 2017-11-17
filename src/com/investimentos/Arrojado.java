package com.investimentos;

public class Arrojado  implements InvestimentosComChances{

	@Override
	public double calcular(double saldo) {
		
		double investimento =0;
		double chance= new java.util.Random().nextDouble();
		
		if(chance<=0.2){
			
		 return investimento=saldo * 0.5;
		 
		}else if(chance<=0.3){
		return	investimento=saldo * 0.3;
		}else{
			
			return investimento =saldo * 0.6;
		}
		
	}

}
