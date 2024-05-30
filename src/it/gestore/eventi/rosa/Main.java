package it.gestore.eventi.rosa;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// metodo Scanner permette di prendere un input dalla tastiera
		Scanner input = new Scanner(System.in);
		// apre il field per inserimento dati utente
		System.out.println(
				"Benvenuto nel programma EVENTI. Inserisci il nuovo evento avendo cura di inserire i dati richiesti ");

		// Titolo evento inserito dall'utente
		System.out.println("Inserisci il Titolo dell'evento");
		String titoloEventoGianna = input.nextLine();

		// numero posti evento
		System.out.println("Inserisci n. posti totali Evento");
		int numeroPostiEventoInseritidaUtente = input.nextInt();
		
		LocalDate date = LocalDate.of(2024, 11, 12);
		LocalTime time = LocalTime.of(10, 33);
		
//		System.out.println(date);
//		System.out.println(time);
		
		// Creo l'oggetto utente a partire dagli input inseriti con scanner
//		Evento Concertotest = new Evento ("test", 44 , date);
//		System.out.println(Concertotest);
		Concerto ConcertoGiannaNannini = new Concerto(titoloEventoGianna, numeroPostiEventoInseritidaUtente, addDate2(), addTime());
		
		System.out.println(ConcertoGiannaNannini);

		// il ciclo DO WHile mi consente di iterare più volte l'istruzione, finchè
		// l'utente non inserisce correttamente i campi SI o NO.
		// solo in quel caso il ciclo si interrompe.
		// DO WHILE AGGIUNGI PRENOTAZIONI
		int ciclo = 0;
		do {
			System.out.println("Vuoi effettuare delle prenotazioni? Digita SI o NO");
			Scanner inputPrenota = new Scanner(System.in);
			String prenota = inputPrenota.nextLine();

			switch (prenota) {

			case "SI":

				System.out.println("Quanti posti vuoi prenotare?");

				int numPrenotaz = inputPrenota.nextInt();
				ConcertoGiannaNannini.prenotazioniNumerose(numPrenotaz);

				ciclo = 6;
				break;

			case "NO":

				System.out.println("Ti ringraziamo per aver usato questo programma. FINE");

				ciclo = 6;
				break;

			default:
				System.out.println("Inserimento non corretto");

				ciclo = 0;

			}

			ciclo++;

		} while (ciclo < 2);

		// DO WHILE DISDICI PRENOTAZIONI
		int ciclo2 = 0;
		do {
			System.out.println("Vuoi disdire delle prenotazioni? Digita SI o NO");
			Scanner inputDisdetta = new Scanner(System.in);
			String prenota = inputDisdetta.nextLine();

			switch (prenota) {

			case "SI":

				System.out.println("Quanti posti vuoi disdire?");

				int numPrenotaz = inputDisdetta.nextInt();
				ConcertoGiannaNannini.disdetteNumerose(numPrenotaz);

				ciclo2 = 6;
				break;

			case "NO":

				System.out.println("Ti ringraziamo per aver usato questo programma. FINE");

				ciclo2 = 6;
				break;

			default:
				System.out.println("Inserimento non corretto");

				ciclo2 = 0;

			}

			ciclo2++;

		}

		while (ciclo2 < 2);

	}

//	// METODO AGGIUNGI DATA CON SCANNER (main)
//	public static LocalDate addDate() {
//        Scanner scanData = new Scanner(System.in);
//        
////        boolean anno = false;
////        boolean mese = false;
////        boolean giorno = false;
//        
//        System.out.println("Inserisci la data evento indicando anno (yyyy) mese (MM) giorno (dd)");
//        LocalDate dataUser = LocalDate.of(scanData.nextInt(), scanData.nextInt(), scanData.nextInt());
//        
////        if (anno) {
////        	
////        	System.out.println("hai inserito un anno non valido");
////        	
////        }
////        
//        
//        return dataUser;
//        
//    }
	
	// METODO AGGIUNGI DATA CON SCANNER2 (main)
	public static LocalDate addDate2() {
        Scanner scanData2 = new Scanner(System.in);
        
        System.out.print("Inserisci la data dell'evento (dd/mm/yyyy): ");
        
        String dateStr = scanData2.nextLine();
        
	    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");  
	    LocalDate data = LocalDate.parse(dateStr, formatter); 

       // LocalDate dataUser = LocalDate.of(scanData.nextInt(), scanData.nextInt(), scanData.nextInt());
        
        return data;
        
    }
	
	// METODO AGGIUNGI ORARIO CON SCANNER (main)
	public static LocalTime addTime() {
        Scanner scanTempo = new Scanner(System.in);
    
        
        System.out.println("Inserisci l'ora dell'evento (HH:mm)");
       // LocalTime timeUser = LocalTime.of(scanTempo.nextInt(), scanTempo.nextInt());
        String timeStr = scanTempo.nextLine();
        
	    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");  
	    LocalTime timeUser = LocalTime.parse(timeStr, formatter);  
        
        return timeUser;
        
    }
	

}


