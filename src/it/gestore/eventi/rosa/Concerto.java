package it.gestore.eventi.rosa;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Concerto extends Evento {

	
	private LocalTime orario;
	private double prezzo;
	
	
	public Concerto(String titolo, int numeroPostiTotale, LocalDate dataEvento, LocalTime orarioEvento , double prezzo) {
		super(titolo, numeroPostiTotale, dataEvento);
		this.orario = orarioEvento;
		this.prezzo = prezzo;
	}
	
	public Concerto (String titolo) {
		super(titolo);
		
	}
	
	
	
	// OVERRIDE METODO TOSTRING
	
		public String toString() {
			
			return super.toString() + "\n" +
					"L'orario dell'evento è " + orario.format(DateTimeFormatter.ofPattern("HH:mm")) + "\n" +
					"Il prezzo è " + String.format("%.2f €", prezzo);
			
			
			
		}
		




		public LocalTime getOrario() {
			return orario;
		}

		public void setOrario(LocalTime orario) {
			this.orario = orario;
		}

		public double getPrezzo() {
			return prezzo;
		}

		public void setPrezzo(double prezzo) {
			this.prezzo = prezzo;
		}
		
		
}


	