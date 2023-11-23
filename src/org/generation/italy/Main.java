package org.generation.italy;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		Automobile auto1 = new Automobile(); //dichiaro gli oggetti della classe automobile
		Automobile auto2 = new Automobile();
		Automobile autoCorrente=auto1;
		String risposta;
		
		auto1.velocità=0;     //inizializziamo gli attributi, che sono delle variabili
		auto1.carburante=30;
		auto1.consumoMedio=20;
		auto1.totKmPercorsi=0;
		
		auto2.velocità=0;
		auto2.carburante=50;
		auto2.consumoMedio=23;
		auto2.totKmPercorsi=0;
		
		do {
		
		System.out.println("\n\n\n\n-Auto1: " );
		auto1.visualizzaDati();
		
		System.out.println("\n-Auto2: ");
		auto2.visualizzaDati();
		
		System.out.println("\nQuale auto vuoi guidare? (1/2/nessuna)");
		risposta=sc.nextLine();
		if(risposta.equals("1"))
			autoCorrente=auto1;
		else if	(risposta.equals("2"))
			autoCorrente=auto2;
		else if	(risposta.equals("nessuna"));
		
		else System.out.println("risposta non valida");
		
		if(risposta.equals("1") || risposta.equals("2")) {
			
		System.out.println("Vuoi accelerare, decelerare?");
		risposta=sc.nextLine();
		if(risposta.equals("accelerare"))
			autoCorrente.accelera();
		else if (risposta.equals("decelerare"))
			autoCorrente.decelera();
		
		}	
		auto2.aggiorna();
		auto1.aggiorna();
		
		
		System.out.println("vuoi continuare?(s/n)");
		risposta=sc.nextLine();
		
		}while(risposta.equals("s"));
			
			
		
				
				
		
		
		
	}
	
	
	}
