package it.gestore.eventi.rosa;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// metodo Scanner permette di prendere un input dalla tastiera
		Scanner input = new Scanner(System.in);
		// apre il field per inserimento dati utente
		System.out.println(
				"Benvenuto nel programma EVENTI. Inserisci il nuovo evento avendo cura di inserire TITOLO, N. POSTI TOTALI, DATA");

		// Titolo evento inserito dall'utente
		System.out.println("Inserisci il Titolo dell'evento");
		String titoloEventoGianna = input.nextLine();

		// numero posti evento
		System.out.println("Inserisci n. posti totali Evento");
		int numeroPostiEventoInseritidaUtente = input.nextInt();
		
		// Creo l'oggetto utente a partire dagli input inseriti con scanner
		Evento ConcertoGiannaNannini = new Evento(titoloEventoGianna, numeroPostiEventoInseritidaUtente, 2024-08-15);
		System.out.println(ConcertoGiannaNannini);

		// il ciclo DO WHile mi consente di iterare più volte l'istruzione, finchè
		// l'utente non inserisce correttamente i campi SI o NO.
		// solo in quel caso il ciclo si interrompe.
		// DO WHILE AGGIUNGI PRENOTAZIONI
		int ciclo = 0;
		do {
			System.out.println("Vuoi effettuare delle prenotazioni? Digita SI o NO");
			Scanner input2 = new Scanner(System.in);
			String prenota = input2.nextLine();

			switch (prenota) {

			case "SI":

				System.out.println("Quanti posti vuoi prenotare?");

				int numPrenotaz = input2.nextInt();
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
			Scanner input2 = new Scanner(System.in);
			String prenota = input2.nextLine();

			switch (prenota) {

			case "SI":

				System.out.println("Quanti posti vuoi disdire?");

				int numPrenotaz = input2.nextInt();
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

}
