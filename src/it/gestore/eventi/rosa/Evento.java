package it.gestore.eventi.rosa;

import java.sql.Date;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;


public  class Evento {

	private String titolo;
	private LocalDate currentDate = LocalDate.now(ZoneId.of("Europe/Paris"));
	private LocalDate dataEvento; 
	private int numeroPostiTotale;
	private int numeroPostiPrenotati = 0;
	private int numeroPostiDisponibili;
	

	// costruttore
	public Evento(String titolo,  int numeroPostiTotale, LocalDate dataEvento) {
		super();
		this.titolo = titolo;
		this.currentDate = currentDate;
		this.dataEvento = controlloDataPassata(dataEvento);
		this.numeroPostiDisponibili = numeroPostiTotale - numeroPostiPrenotati;
		this.numeroPostiPrenotati = numeroPostiPrenotati;
		this.numeroPostiTotale = numPositivo(numeroPostiTotale);
		
		
	}
	
        
    
	
	// metodo che controlla che la data non sia già passata, ma solo futura
	public LocalDate controlloDataPassata(LocalDate dataEventoInserito) {
		if(dataEventoInserito.isBefore(currentDate))  {
		    
			System.out.println("ERRORE: la data dell'evento è antecedente alla data inserita (l'evento è già passato!");
		
		} 
		
		return dataEventoInserito;

		
	}
	
	// metodo che controlla che i posti totali sia un umero positivo.
	
	public final int numPositivo(int numeroPosti) {
		
		if(numeroPosti <= 0) {
			
			System.out.println("ERRORE: devi inserire un numero positivo");
			numeroPosti = 0;
			setNumeroPostiDisponibili(numeroPostiTotale - numeroPostiPrenotati);
			
		}
		
		return numeroPosti;
	}
	
	// METODO PRENOTA: aggiunge uno ai posti prenotati. Se l’evento è già passato o non ha posti disponibili deve restituire un messaggio di avviso.
	// I metodi final impediscono l'ovveride
	public final void prenota() {
		
		this.numeroPostiPrenotati = numeroPostiPrenotati + 1;
		setNumeroPostiDisponibili(numeroPostiTotale - numeroPostiPrenotati);
		// se la data è antecedente alla data evento da errore.
		
		// se i posti prenotati è maggiore di posti disponibili da errore.
		if(numeroPostiPrenotati > numeroPostiTotale) {
			
			this.numeroPostiPrenotati = numeroPostiTotale;
			setNumeroPostiDisponibili(0);
			
			System.out.println("L'evento ha raggiunto la capienza massima" + "\n" +
			"I posti totali sono " + numeroPostiTotale + "\n" + 
					"I posti prenotati sono " + numeroPostiPrenotati + "\n" +
			"I posti disponibili sono " + numeroPostiDisponibili );	
		}
		
		else {
			System.out.println("Hai effettuato correttamente la prenotazione " + "\n" + 
		"I posti prenotati sono " + numeroPostiPrenotati);
		}
		
	}
	
	// METODO DISIDICI una prenotazione alla volta
	
	public final void disdici() {
		
		this.numeroPostiPrenotati = numeroPostiPrenotati - 1;
		setNumeroPostiDisponibili(numeroPostiTotale - numeroPostiPrenotati);
		
		// Se l’evento è già passato o non ci sono prenotazioni restituisce un messaggio di avviso.
		if(numeroPostiPrenotati <= 0) {
			
			this.numeroPostiPrenotati = numeroPostiTotale;
			setNumeroPostiDisponibili(numeroPostiTotale);
			
			System.out.println("L'evento non ha prenotazioni" + "\n" +
			"I posti totali sono " + numeroPostiTotale + "\n" + 
					"I posti prenotati sono " + numeroPostiPrenotati + "\n" + 
					"I posti disponibili sono " + numeroPostiDisponibili);	
		}
		
		else {
			System.out.println("Hai disdetto correttamente la prenotazione " + "\n" + 
		"I posti prenotati sono " + numeroPostiPrenotati + "\n"+
		"I posti disponibili sono " + numeroPostiDisponibili);
		}
		
	}
	
	// METODO PRENOTA piu prenotazioni alla vota
	public final void prenotazioniNumerose(int inputUtente) {
		
		this.numeroPostiPrenotati = numeroPostiPrenotati + inputUtente;
		setNumeroPostiDisponibili(numeroPostiTotale - numeroPostiPrenotati);
		// se la data è antecedente alla data evento da errore.
		
		// se i posti prenotati è maggiore di posti disponibili da errore.
		if(numeroPostiPrenotati > numeroPostiTotale) {
			
			this.numeroPostiPrenotati = numeroPostiTotale;
			setNumeroPostiDisponibili(0);
			
			System.out.println("L'evento ha raggiunto la capienza massima" + "\n" +
			"I posti totali sono " + numeroPostiTotale + "\n" + 
					"I posti prenotati sono " + numeroPostiPrenotati + "\n" +
			"I posti disponibili sono " + numeroPostiDisponibili );	
		}
		
		else {
			System.out.println("Hai effettuato correttamente la prenotazione " + "\n" + 
		"I posti prenotati sono " + numeroPostiPrenotati + "\n" + 
		"I posti disponibili sono " + numeroPostiDisponibili );
		}
		
	}
	
	// METODO DISIDICI PIU PRENOTAZIONI
	
		public final void disdetteNumerose(int inputUtente2) {
			
			this.numeroPostiPrenotati = numeroPostiPrenotati - inputUtente2;
			setNumeroPostiDisponibili(numeroPostiTotale - numeroPostiPrenotati);
			
			// Se l’evento è già passato o non ci sono prenotazioni restituisce un messaggio di avviso.
			if(numeroPostiPrenotati <= 0) {
				
				this.numeroPostiPrenotati = numeroPostiTotale;
				setNumeroPostiDisponibili(numeroPostiTotale);
				
				System.out.println("L'evento non ha prenotazioni" + "\n" +
				"I posti totali sono " + numeroPostiTotale + "\n" + 
						"I posti prenotati sono " + numeroPostiPrenotati + "\n" + 
						"I posti disponibili sono " + numeroPostiDisponibili);	
			}
			
			else {
				System.out.println("Hai disdetto correttamente la prenotazione " + "\n" + 
			"I posti prenotati sono " + numeroPostiPrenotati + "\n"+
			"I posti disponibili sono " + numeroPostiDisponibili);
			}
			
		}
	
	
	
	// OVERRIDE METODO TOSTRING
	
	public String toString() {
		
		return "L'evento si intitola " + titolo + "\n" +
		"La data dell'evento è " + dataEvento.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"))  + "\n" + 
		"Il numero di posti totale è " + numeroPostiTotale + "\n" + 
				"Il numero di posti prenotati è " + numeroPostiPrenotati + "\n" + 
				"I posti disponibili sono " + numeroPostiDisponibili;
		
		
	}
	
	
	
	// GETTER E SETTER

	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}


	private LocalDate getDataEvento() {
		return dataEvento;
	}

	private void setDataEvento(LocalDate dataEvento) {
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
	
	private int getNumeroPostiDisponibili() {
		return numeroPostiDisponibili;
	}

	private void setNumeroPostiDisponibili(int numeroPostiDisponibili) {
		this.numeroPostiDisponibili = numeroPostiDisponibili;
	}
	
}
