package it.gestore.eventi.rosa;

public class Main {

	public static void main(String[] args) {
		
		
		Evento concerto =  new Evento("Il mio concerto", 5);
		
		concerto.toString();
		System.out.println(concerto);
		System.out.println();
		
		concerto.prenota();
		
		System.out.println(concerto);
		
		System.out.println("       ********");
		
		concerto.prenota();
		concerto.prenota();
		concerto.prenota();
		concerto.prenota();
		concerto.prenota();
		concerto.prenota();
		concerto.prenota();
		concerto.prenota();
		
		System.out.println("       ********");
		
		concerto.prenota();
		
		System.out.println("       ********");
		
		System.out.println(concerto);
		
		System.out.println("       ********");
	}

}
