package it.gestore.eventi.rosa;

import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// metodo Scanner permette di prendere un input dalla tastiera
		Scanner input = new Scanner(System.in);
		// apre il field per inserimento dati utente
		System.out.println("Benvenuto nel programma EVENTI. Inserisci il nuovo evento avendo cura di inserire TITOLO, N. POSTI TOTALI, DATA");
		
		// Titolo evento inserito dall'utente
		System.out.println("Inserisci il Titolo dell'evento");
		String titoloEventoGianna = input.nextLine();
		
		// numero posti evento
		System.out.println("Inserisci n. posti totali Evento");
		int numeroPostiEventoInseritidaUtente = input.nextInt();
		
		
		// Creo l'oggetto utente a partire dagli input inseriti con scanner
		Evento ConcertoGiannaNannini = new Evento(titoloEventoGianna, numeroPostiEventoInseritidaUtente );
		System.out.println(ConcertoGiannaNannini);
		
		System.out.println("Vuoi effettuare delle prenotazioni? Digita SI o NO");
		String prenota = input.nextLine();
		
		
		if (prenota.equals("SI")) {
			
			System.out.println("Quanti posti vuoi prenotare?");
			int numPrenotaz = input.nextInt();
			ConcertoGiannaNannini.prenotazioniNumerose(numPrenotaz);
			
		}
		
		else if (prenota.equals("NO")) {
			
			System.out.println("Ti ringraziamo per aver usato questo programma. FINE");
		}
		
		else {
			
			System.out.println("Hai inserito un valore non corretto.");
			
		}
		//System.out.println("La tua password è " + PasswordGeneratorOOP.generaPassword(ConcertoGiannaNannini));

	}

}
