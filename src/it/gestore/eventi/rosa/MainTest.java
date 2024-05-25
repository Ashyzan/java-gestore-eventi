package it.gestore.eventi.rosa;

public class MainTest {

	public static void main(String[] args) {
		
		
		Evento concerto =  new Evento("Il mio concerto", 3);
		
		concerto.toString();
		
		System.out.println("   STAMPO ISTANZA CREATA    ********");
		System.out.println(concerto);
		
		concerto.prenota();
		
		System.out.println("    +1   ********");
		
		System.out.println(concerto);
		
		System.out.println("       ********");
		
		concerto.prenota();
		
		System.out.println("    +2   ********");
		
		System.out.println(concerto);
		
		System.out.println("       ********");
		
		concerto.prenota();
		
		System.out.println("   +3    ********");
		
		System.out.println(concerto);
		
		concerto.disdici();
		
		System.out.println("   -1    ********");
		
		System.out.println(concerto);
		
		System.out.println("       ********");
		
		concerto.disdici();
		
		System.out.println("  -2     ********");
		
		System.out.println(concerto);
		
		concerto.prenota();
		concerto.prenota();
		concerto.prenota();
		concerto.prenota();
		concerto.prenota();
		
		System.out.println(concerto);
		
		concerto.prenota();
		
		System.out.println(concerto);
	
	// ********************************+
		
		Evento mostra =  new Evento("La mia mostra", -3);
		
		mostra.toString();
		
		System.out.println("   STAMPO ISTANZA CREATA    ********");
		System.out.println(mostra);
	
	}

}
