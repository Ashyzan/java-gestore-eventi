package it.gestore.eventi.rosa;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProgrammaEventi {

	private String titoloProgEventi;
	private List<Evento> eventi; // creo una lista di Oggetti Evento

// costruttore PROGRAMMA EVENTI

	public ProgrammaEventi(String Titolo) {
		this.titoloProgEventi = Titolo;
		List<Evento> listaEvento1 = new ArrayList<>(); // istanzio la ista nel costruttore
		this.eventi = listaEvento1;

		System.out.println("Ho creato un nuovo programma eventi dal titolo " + Titolo);

	}

// metodo che aggiunge un evento alla lista
	public void addEvento(Evento evento) {
		this.eventi.add(evento);
		System.out.println("Ho aggiunto un nuovo evento a programma eventi");

	}

//metodo che restituisce quanti eventi sono presenti nel programma
	public void numeroEventiTotale() {
		int size = this.eventi.size();
		System.out.println("La lista contiene " + size + " elementi");
	}

// metodo che svuota la lista di eventi
	public void svuotaLista() {
		this.eventi.clear();
		System.out.println("Ho svuotato la lista");

	}

//metodo che ordina la lista per date 
	public void sortData() {
		Collections.sort(this.eventi);
		System.out.println("Ho ordinato la lista per date");
	}

//// metodo che restituisce una lista con tutti gli eventi presenti in una certa data
	public void filtraPerData(LocalDate dataInput) {

		for (int i = 0; i < this.eventi.size(); i++) {

			Evento current = this.eventi.get(i);
			if (dataInput.equals(current.getDataEvento())) {

				System.out.println("Stampo la lista degli eventi presenti in data " + dataInput.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) + "\n"
						+ "Titolo: " + current.getTitolo() + "\n" + "Data: "
						+ current.getDataEvento().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
			}

		}

	}

//		metodo che restituisce una stringa che mostra il titolo del programma e tutti gli eventi ordinati per data nella forma: 
//			data1 - titolo1
//			data2 - titolo2 
	public void stampoLista() {

		for (int i = 0; i < this.eventi.size(); i++) {

			Evento current = this.eventi.get(i);
			System.out.println("Titolo: " + current.getTitolo() + "\n" + "Data: "
					+ current.getDataEvento().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));

		}

	}

}
