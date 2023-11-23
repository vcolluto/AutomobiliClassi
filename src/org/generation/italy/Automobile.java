package org.generation.italy;

public class Automobili {

	int velocit‡;
	float carburante, consumoMedio, totKmPercorsi; //disponibilit‡Carburante consumoMedio kmPercorsi
	
	public void accelera() {
		
		if (velocit‡<=190)
			velocit‡+=10; // mi incrementa di 10
	}
		
	public void decelera() {
		
		if (velocit‡>=10)
			velocit‡-=10; // mi decrementa di 10
	
	}
			
	public void visualizzaDati() {
		
		System.out.println(" velocit‡ attuale :" + velocit‡ + "km/h");
		System.out.println("carburante: " + carburante + "l");
		System.out.println("consumo medio: " + consumoMedio + "km/l" );
		System.out.println("km percorsi: " + totKmPercorsi + "km");
	}
	
	public void aggiorna() { //simula il passaggio di 1h
		
		int kmPercorsi1h=velocit‡; //in un ora ho percorso un n di km pari alla velocit‡
		
		totKmPercorsi+=kmPercorsi1h; //aggiunge al totale i km percorsi in un ora
		carburante-=kmPercorsi1h/consumoMedio; //scalo l da carburante (in un ora)
		
		
	
}

	}		
			
		
	
	
	

