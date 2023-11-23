package org.generation.italy;

public class Automobili {

	int velocit‡;
	float carburante, consumoMedio, kmPercorsi; //disponibilit‡Carburante consumoMedio kmPercorsi
	
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
		System.out.println("km percorsi: " + kmPercorsi + "km");
	}
	
	public void aggiorna() {
		
		kmPercorsi+=velocit‡;
		carburante-=kmPercorsi/consumoMedio;
	
}

	}		
			
		
	
	
	

