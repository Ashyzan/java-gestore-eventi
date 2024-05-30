package it.gestore.eventi.rosa;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class MainProgEventi {

	public static void main(String[] args) {
		
		
		
		LocalDate date = LocalDate.of(2024, 11, 12);
		LocalTime time = LocalTime.of(10, 33);
		
		Evento ConcertoGiorgia = new Concerto ("Giorgia in concerto" , 300, date, time, 120 );
		
		Evento ConcertoMannoia = new Concerto ("Mannoia in concerto" , 300, date, time, 120);
		
		Evento ConcertoMannarino = new Concerto ("Mannarino in concerto" , 300, date, time, 120);
		
		List<ProgrammaEventi> eventiSummer24 = new ArrayList<ProgrammaEventi>();
		
		eventiSummer24.addAll(ConcertoGiorgia);
		eventiSummer24.addAll(ConcertoMannoia);
		eventiSummer24.addAll(ConcertoMannarino);
		

		System.out.println("Stampo la lista Eventi " + eventiSummer24);
		

	}

}
