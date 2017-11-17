package com.investimentos;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		
		
		
		double saldo;
		int menu=0;
		
		RealizadorDeInvestimentos realizador = new RealizadorDeInvestimentos();
		
		System.out.println("digite o valor do saldo");
		Scanner input = new Scanner(System.in);
		saldo=input.nextDouble();
		
		Scanner input1= new Scanner(System.in);
		
		while (menu != 4) {
            System.out.println("\nMenu Principal\n");
            System.out.println(" 1) Investimento Conservador");
            System.out.println(" 2) Investimento Moderado");
            System.out.println(" 3) Arrojado");
            System.out.println(" 4) Sair do programa\n");
            menu = input.nextInt();
            
            switch(menu){
            
            case 1:
            	System.out.println("valor bruto = " + realizador.calcularConservador(saldo));
            	System.out.println("valor com desconto de 25% =" + realizador.calcularConservador(saldo)* 0.75);;
            	break;
            case 2:
            	System.out.println("valor bruto = " + realizador.calcularModerado(saldo));
            	System.out.println("valor com desconto de 25% =" + realizador.calcularModerado(saldo)* 0.75);
            	break;
            case 3:
            	System.out.println("valor bruto = " + realizador.calcularArrojado(saldo));
            	System.out.println("valor com desconto de 25% =" + realizador.calcularArrojado(saldo)* 0.75);
            	break;
            case 4:
            	System.out.println("saindo do programa");
            	System.exit(0);
            	break;
            default:
            	System.out.println("default");
            	break;
            	
            }
            
		}
		
		

	}

}
