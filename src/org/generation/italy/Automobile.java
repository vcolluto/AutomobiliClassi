package org.generation.italy;

public class Automobile {

	//private: gli attributi posso esser "visti" solo dall'interno della stessa classe (automobile)
	private int velocit�;			
	private float carburante, consumoMedio, totKmPercorsi; //disponibilit�Carburante consumoMedio kmPercorsi
	
	//metodo costruttore: si utilizza per inizializzare gli attributi di un oggetto
	//si differenzia dagli altri metodi perch�:
	// - il nome del metodo � uguale al nome della classe
	// - non ha un valore di ritorno (per il momento: non ha il "void")
	//ogni volta che si crea un oggetto Automobile bisogna indicare il valore del carburante 
	//e il valore del consumo medio (nella classe in cui si crea l'oggetto (ad. es. Main))
	//
	//le variabili (float carburante, float consumoMedio) indicate nel costruttore 
	//vengono chiamate "parametri"
	//e rappresentano i valori che ci vengono forniti da chi "crea" l'oggetto
	//normalmente i parametri del costruttore hanno lo stesso nome degli attributi.
	//per capire a quale delle due variabili ci si riferisce, si usa la parola chiave "this".
	//ad esempio: 
	//   "this.carburante" 	indica l'attributo della classe
	//	 "carburante" 		indica il parametro
	//la parola "this" � obbligatoria solo se c'� ambiguit� (variabili con lo stesso nome).
	//se i parametri hanno un nome diverso (anche se non � la prassi), il "this" non � necessario
	public Automobile(float carburante, float consumoMedio) {
		if (carburante<0) {
			System.out.println("carburante non valido");
			carburante=0;		//valore di default
		}
		else
			this.carburante=carburante;
		
		if (consumoMedio<=0) {
			System.out.println("consumo medio non valido");
			consumoMedio=10;		//valore di default
		}
		else
			this.consumoMedio=consumoMedio;	//this.consumoMedio � l'attributo; consumoMedio � il parametro
			
		velocit�=0;
		totKmPercorsi=0;
	}
	
	
	public void accelera() {		
		if (velocit�<=190 && carburante>0)
			velocit�+=10; // mi incrementa di 10		
	}
		
	public void decelera() {		
		if (velocit�>=10)
			velocit�-=10; // mi decrementa di 10	
	}
			
	public void visualizzaDati() {
		
		System.out.println("velocit� attuale :" + velocit� + " km/h");
		System.out.println("carburante: " + carburante + " l");
		System.out.println("consumo medio: " + consumoMedio + " km/l" );
		System.out.println("km percorsi: " + totKmPercorsi + " km");
	}
	
	public void aggiorna() { //simula il passaggio di 1h
		
		int kmPercorsi1h=velocit�; //in un ora ho percorso un n di km pari alla velocit�
		
		totKmPercorsi+=kmPercorsi1h; //aggiunge al totale i km percorsi in un ora
		if (kmPercorsi1h/consumoMedio<=carburante)	
			carburante-=kmPercorsi1h/consumoMedio; //scalo l da carburante (in un ora)
		else
			carburante=0;	//se il consumo dell'ultima ora � maggior di quello che ho nel serbatoio => il carburante va a zero
		
		if(carburante<=0)//non c'� carburante la macchina si ferma
			velocit�=0;
	}

}		
			
		
	
	
	

