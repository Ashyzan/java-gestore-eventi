package it.gestore.eventi.rosa;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class MainProgEventi {

	public static void main(String[] args, Object Evento) {
		
		// esercizi sulle liste //
//		LocalDate date = LocalDate.of(2024, 11, 12);
//		LocalTime time = LocalTime.of(10, 33);
		
		Concerto ConcertoGiorgia = new Concerto ("Giorgia in concerto");
		
		Concerto ConcertoMannoia = new Concerto ("Mannoia in concerto");
		
		Concerto ConcertoMannarino = new Concerto ("Mannarino in concerto");
		
		List <Concerto> ListaConcerti = new ArrayList<>();
		
		ListaConcerti.add(ConcertoGiorgia);
		
		ListaConcerti.add(ConcertoMannoia);
		
		ListaConcerti.add(ConcertoMannarino);
		
		System.out.println("Stampo la lista Concerti " + ListaConcerti);
		
		System.out.println("******   *********  FINE ESERCIZI SULLE LISTE **********");
		
		List<ProgrammaEventi> eventiSummer24 = new ArrayList<ProgrammaEventi>();
		
		//eventiSummer24.addEvento(ConcertoMannarino);
		//eventiSummer24.addEvento(ConcertoGiorgia);

		System.out.println("Stampo la lista Eventi " + eventiSummer24);
		


	}

}
