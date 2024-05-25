package it.gestore.eventi.rosa;

import java.sql.Date;

public  class Evento {

	private String titolo;
	private Date dataEvento;
	private int numeroPostiTotale;
	private static int numeroPostiPrenotati = 0;
	
	// costruttore
	public Evento(String titolo,  int numeroPostiTotale) {
		super();
		this.titolo = titolo;
		this.dataEvento = dataEvento;
		this.numeroPostiTotale = numPositivo(numeroPostiTotale);
		this.numeroPostiPrenotati = numeroPostiPrenotati;
	}
	
	// metodo che controlla che la data non sia già passata, ma solo futura
	public void controlloDataPassata() {
		
		
	}
	
	// metodo che controlla che i posti totali sia un umero positivo.
	
	public int numPositivo(int numeroPosti) {
		
		if(numeroPosti < 0) {
		
			 System.out.println("ERRORE: Hai inserito un numero di posti inferiore a zero");
			
		}
		
		return numeroPosti;
	}
	
	// METODO PRENOTA: aggiunge uno ai posti prenotati. Se l’evento è già passato o non ha posti disponibili deve restituire un messaggio di avviso.
	
	public void prenota() {
		
		this.numeroPostiPrenotati = numeroPostiPrenotati + 1;
		// se la data è antecedente alla data evento da errore.
		
		// se i posti prenotati è maggiore di posti disponibili da errore.
		if(numeroPostiPrenotati > numeroPostiTotale) {
			
			this.numeroPostiPrenotati = numeroPostiPrenotati;
			
			System.out.println("L'evento ha raggiunto la capienza massima" + "\n" +
			"I posti totali sono " + numeroPostiTotale + "\n" + 
					"I posti prenotati sono " + numeroPostiPrenotati);
			
			
		}
		
		else {
			System.out.println("Hai effettuato correttamente la prenotazione " + "\n" + 
		"I posti prenotati sono " + numeroPostiPrenotati);
		}
		
	}
	
	// METODO DISIDICI
	
	// OVERRIDE METODO TOSTRING
	
	public String toString() {
		
		return "L'evento si intitola " + titolo + "\n" +
		"Il numero di posti totale è " + numeroPostiTotale + "\n" + 
				"Il numero di posti prenotati è " + numeroPostiPrenotati;
		
		
	}
	
	
	
	// GETTER E SETTER

	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public Date getDataEvento() {
		return dataEvento;
	}

	public void setDataEvento(Date dataEvento) {
		this.dataEvento = dataEvento;
	}

	private int getNumeroPostiTotale() {
		return numeroPostiTotale;
	}

	private void setNumeroPostiTotale(int numeroPostiTotale) {
		this.numeroPostiTotale = numeroPostiTotale;
	}

	private int getNumeroPostiPrenotati() {
		return numeroPostiPrenotati;
	}

	private void setNumeroPostiPrenotati(int numeroPostiPrenotati) {
		this.numeroPostiPrenotati = numeroPostiPrenotati;
	}
	
	
}
