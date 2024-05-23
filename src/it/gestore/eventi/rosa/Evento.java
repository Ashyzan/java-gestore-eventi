package it.gestore.eventi.rosa;

import java.sql.Date;

public abstract class Evento {

	private String titolo;
	private Date dataEvento;
	private int numeroPostiTotale;
	private int numeroPostiPrenotati = 0;
	
	// costruttore
	public Evento(String titolo, Date dataEvento, int numeroPostiTotale, int numeroPostiPrenotati) {
		super();
		this.titolo = titolo;
		this.dataEvento = dataEvento;
		this.numeroPostiTotale = numeroPostiTotale;
		this.numeroPostiPrenotati = numeroPostiPrenotati;
	}
	
	// metodo che controlla che la data non sia già passata, ma solo futura
	public void controlloDataPassata() {
		
		
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
