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
		Scanner input2 = new Scanner(System.in);
		String prenota = input2.nextLine();
		
			
		
			boolean corretto = false;
		
				switch(corretto) {
				
				case false:
			
							switch(prenota) {
							
							case "SI":
								
								System.out.println("Quanti posti vuoi prenotare?");
								
								int numPrenotaz = input2.nextInt();
								ConcertoGiannaNannini.prenotazioniNumerose(numPrenotaz);
								corretto = true;
								break;
							
							case "NO":
								
								System.out.println("Ti ringraziamo per aver usato questo programma. FINE");
								corretto = true;
								break;
							
							default: 
								System.out.println("Inserimento non corretto");
								corretto = false;
					
							}
				default:
					break;
					
				}
		
		
		
//		if (prenota.equals("SI")) {
//			
//			System.out.println("Quanti posti vuoi prenotare?");
//			
//			int numPrenotaz = input2.nextInt();
//			ConcertoGiannaNannini.prenotazioniNumerose(numPrenotaz);
//			
//		}
//		
//		else if (prenota.equals("NO")) {
//			
//			System.out.println("Ti ringraziamo per aver usato questo programma. FINE");
//		}
//		
//		else {
//			
//			System.out.println("Hai inserito un valore non corretto.");
//			
//		}
		//System.out.println("La tua password è " + PasswordGeneratorOOP.generaPassword(ConcertoGiannaNannini));

	}

}
