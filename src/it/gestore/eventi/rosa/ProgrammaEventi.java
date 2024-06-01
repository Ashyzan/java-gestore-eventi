package it.gestore.eventi.rosa;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class ProgrammaEventi {
	
	private String titoloProgEventi;
	private List<Evento> eventi; // creo una lista di Oggetti Evento
	
// costruttore PROGRAMMA EVENTI
	
	public ProgrammaEventi(String Titolo) {
		this.titoloProgEventi = Titolo;
		List<Evento> listaEvento1 = new ArrayList<>();
		this.eventi = listaEvento1; //istanzio la ista nel costruttore
		System.out.println("Ho creato un nuovo programma eventi dal titolo " + Titolo);
		
		
		}
		
// metodo che aggiunge un evento alla lista
		public void addEvento(Evento evento ) {
			this.eventi.add(evento);
			System.out.println("Ho aggiunto un nuovo evento a programma eventi" );
			
		}
		
//metodo che restituisce una lista con tutti gli eventi presenti in una certa data
		public void filtraPerData() {
			
		}
		
//metodo che restituisce quanti eventi sono presenti nel programma
		public void numeroEventiTotale() {
			int size = this.eventi.size();
			System.out.println("La lista contiene " + size + " elementi");
		}
		
		
// metodo che svuota la lista di eventi
		public void svuotaLista() {
			this.eventi.clear();
			System.out.println("Ho svuotato la lista" );
			
		}
		
//		metodo che restituisce una stringa che mostra il titolo del programma e tutti gli eventi ordinati per data nella forma: 
//			data1 - titolo1
//			data2 - titolo2 
		public void sortLista() {
			
			
		}
		
		public String toString() {
			return "Il programma si chiama " + titoloProgEventi + "\n"
					+ "sono presenti ..." ;
		}

}
