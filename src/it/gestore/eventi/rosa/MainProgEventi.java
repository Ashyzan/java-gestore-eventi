package it.gestore.eventi.rosa;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainProgEventi {

	public static void main(String[] args) {
		

		// esercizi sulle liste //
		LocalDate date = LocalDate.of(2024, 11, 12);
		LocalDate date1 = LocalDate.of(2024, 12, 12);
		LocalDate date2 = LocalDate.of(2024, 10, 12);
		LocalTime time = LocalTime.of(22, 30);
		
		Concerto ConcertoGiorgia = new Concerto ("Giorgia in concerto", 400, date, time , 120  );
		
		Concerto ConcertoMannoia = new Concerto ("Mannoia in concerto", 300, date1, time , 80);
		
		Concerto ConcertoMannarino = new Concerto ("Mannarino in concerto", 200, date2, time , 60);
		
		List <Concerto> ListaConcerti = new ArrayList<>();
		
		ListaConcerti.add(ConcertoGiorgia);
		
		ListaConcerti.add(ConcertoMannoia);
		
		ListaConcerti.add(ConcertoMannarino);
		
		Collections.sort(ListaConcerti);
		
		System.out.println("Stampo la lista Concerti " + ListaConcerti);
		
		//System.out.println("******   *********  FINE ESERCIZI SULLE LISTE **********");
		
		
		 ProgrammaEventi summer24 = new ProgrammaEventi("'Programma Estate 2024'"); 

		 summer24.addEvento(ConcertoGiorgia);
		 summer24.addEvento(ConcertoMannoia);
		 summer24.addEvento(ConcertoMannarino);
		 
		 summer24.numeroEventiTotale();
		 
		 summer24.sortData();
		 
		 System.out.println("Stampo la lista Eventi " + summer24);
		 
		 summer24.svuotaLista();
		 summer24.numeroEventiTotale();
		 

	}

}
