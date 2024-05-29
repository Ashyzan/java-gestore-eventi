package it.gestore.eventi.rosa;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Concerto extends Evento {

	
	private String titolo;
	private LocalDate currentDate = LocalDate.now(ZoneId.of("Europe/Paris"));
	private LocalDate dataEvento; 
	private int numeroPostiTotale;
	private int numeroPostiPrenotati = 0;
	private int numeroPostiDisponibili;
	private LocalTime orario;
	
	
	public Concerto(String titolo, int numeroPostiTotale, LocalDate dataEvento, LocalTime orarioEvento) {
		super(titolo, numeroPostiTotale, dataEvento);
		this.titolo = titolo;
		this.currentDate = currentDate;
		this.dataEvento = controlloDataPassata(dataEvento);
		this.numeroPostiDisponibili = numeroPostiTotale - numeroPostiPrenotati;
		this.numeroPostiPrenotati = numeroPostiPrenotati;
		this.numeroPostiTotale = numPositivo(numeroPostiTotale);
		this.orario = orarioEvento;
	}
	
	// OVERRIDE METODO TOSTRING
	
		public String toString() {
			
			return "L'evento si intitola " + titolo + "\n" +
			"La data dell'evento inserita è il " + dataEvento.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"))  + "\n" + 
					"L'orario dell'evento è " + orario.format(DateTimeFormatter.ofPattern("HH:mm")) + "\n" +
			"Il numero di posti totale è " + numeroPostiTotale + "\n" + 
					"Il numero di posti prenotati è " + numeroPostiPrenotati + "\n" + 
					"I posti disponibili sono " + numeroPostiDisponibili;
			
		}

		public String getTitolo() {
			return titolo;
		}

		public void setTitolo(String titolo) {
			this.titolo = titolo;
		}

		public LocalDate getCurrentDate() {
			return currentDate;
		}

		public void setCurrentDate(LocalDate currentDate) {
			this.currentDate = currentDate;
		}

		public LocalDate getDataEvento() {
			return dataEvento;
		}

		public void setDataEvento(LocalDate dataEvento) {
			this.dataEvento = dataEvento;
		}

		public int getNumeroPostiTotale() {
			return numeroPostiTotale;
		}

		public void setNumeroPostiTotale(int numeroPostiTotale) {
			this.numeroPostiTotale = numeroPostiTotale;
		}

		public int getNumeroPostiPrenotati() {
			return numeroPostiPrenotati;
		}

		public void setNumeroPostiPrenotati(int numeroPostiPrenotati) {
			this.numeroPostiPrenotati = numeroPostiPrenotati;
		}

		public int getNumeroPostiDisponibili() {
			return numeroPostiDisponibili;
		}

		public void setNumeroPostiDisponibili(int numeroPostiDisponibili) {
			this.numeroPostiDisponibili = numeroPostiDisponibili;
		}

		public LocalTime getOrario() {
			return orario;
		}

		public void setOrario(LocalTime orario) {
			this.orario = orario;
		}
		
		
}


	