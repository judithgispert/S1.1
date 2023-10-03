package N3Ex1;
import java.util.ArrayList;
import java.util.Scanner;



public class N3Ex1 {
	
	public static void main (String[]args) {
		
		//CREEM OBJ DE LA REDACCIÓ (APP ÚNICA UNA REDACCIÓ)
		Redaccio totEsport = new Redaccio ();
		
		//CREEM ARRAYLIST DE REDACTORS
		//ArrayList <Redactor> llistaRedactors = new ArrayList <Redactor>();
		
		
		//CREEM MENÚ APLICACIÓ
		int seguirAplicacio;
		do {
			System.out.println("MENÚ DE L'APLICACIÓ:");
			System.out.println("0. Sortir de l'aplicació.");
			System.out.println("1. Introduir redactor.");
			System.out.println("2. Eliminar redactor.");
			System.out.println("3. Introduir notícia.");
			System.out.println("4. Eliminar notícia.");
			System.out.println("5. Mostrar notícies d'algun redactor.");
			System.out.println("6. Calcular la puntuació de la notícia.");
			System.out.println("7. Calcular preu de la notícia.");
			int menu = demanarInt ("A quin apartat voleu accedir?");
			
			switch (menu) {
			
			case 0: //SORTIR DE L'APLICACIÓ
				System.out.println("Esteu apunt de sortir de l'aplicació.");
				break;
				
			case 1: //INTRODUIR REDACTOR
				System.out.println("1. INTRODUIR REDACTOR");
				crearRedactor(totEsport, demanarString("Nom del redactor:"), demanarString ("DNI del redactor:"));
				break;
			
			case 2: //ELIMINAR REDACTOR
				System.out.println("2. ELIMINAR REDACTOR");
				eliminarRedactor(totEsport);
				break;
				
			case 3: //INTRODUIR NOTÍCIA
				System.out.println("3. INTRODUIR NOTÍCIA");
				crearNoticies(totEsport);
				break;
				
			case 4: //ELIMINAR NOTÍCIA
				System.out.println("4. ELIMINAR NOTÍCIA");
				eliminarNoticia(totEsport);
				break;
				
			case 5: //MOSTRAR NOTÍCIES D'UN REDACTOR
				System.out.println("5. MOSTRAR NOTÍCIES D'ALGUN REDACTOR");
				mostrarNoticies(totEsport);
				break;
				
			case 6: //CALCULAR PUNTUACIÓ NOTÍCIA
				System.out.println("6. CALCULAR PUNTUACIÓ DE LA NOTÍCIA");
				calcularPuntuacio(totEsport);
				break;
				
			case 7: //CALCULAR PREU NOTÍCIA
				System.out.println("7. CALCULAR PREU DE LA NOTÍCIA");
				break;
			
			}
			
			seguirAplicacio = demanarInt("Voleu tornar al menú o sortir de l'aplicació? 1.MENÚ / 2.SORTIR");
		}while(seguirAplicacio == 1);
	}

	
///DEFINICIÓ DELS MÈTODES///
///DEFINIR MÈTODES PER INTRODUIR DADES///
	//DEFINIR MÈTODE PER DEMANAR INT
	static int demanarInt (String missatge) {
		Scanner input = new Scanner (System.in);
		System.out.println(missatge);
		return input.nextInt();
	}
	//DEFINIR MÈTODE PER DEMANAR STRING
	static String demanarString (String missatge) {
		Scanner input = new Scanner (System.in);
		System.out.println(missatge);
		return input.nextLine();
	}
	
///DEFINIR MÈTODES PER CREAR OBJECTES///
	//MÈTODE PER CREAR REDACTOR
	static void crearRedactor (Redaccio totEsport, String nom, String dni) {
		totEsport.getLlistaRedactors().add(new Redactor(nom, dni));
	}
	
	//MÈTODE PER CREAR TOTES LES NOTÍCIES
	static void crearNoticies (Redaccio totEsport) {
		int numRedactor = buscarRedactor(totEsport);
		String titularNoticia = demanarString("Titular notícia:");
		
		if(numRedactor != -1) {
			System.out.println("De quin esport parlarà la notícia?");
			System.out.println("0. Tornar menú principal.");
			System.out.println("1. Notícia futbol.");
			System.out.println("2. Notícia bàsquet.");
			System.out.println("3. Notícia tenis.");
			System.out.println("4. Notícia F1.");
			System.out.println("5. Notícia motociclisme.");
			int menuNoticia = demanarInt ("A quin apartat voleu accedir?");
		
			switch(menuNoticia){
			case 0: 
				System.out.println("Esteu apunt de tornar al menú principal.");
				break;
			
			case 1: //FUTBOL
				System.out.println("NOTÍCIA DE FUTBOL");
				crearFutbol(totEsport, titularNoticia, demanarString("Tipus de competició:"), demanarString("Club del que es parla:"), demanarString("Jugador principal de la notícia:"));
				int idNoticiaFutbol = buscarTitular(totEsport, titularNoticia);
				totEsport.getLlistaRedactors().get(numRedactor).getLlistaNoticies().get(idNoticiaFutbol).setText(demanarString("Introdueix el text de la notícia:"));
			break;
			
			case 2: //BÀSQUET
				System.out.println("NOTÍCIA DE BÀSQUET");
				crearBasquet(totEsport, titularNoticia, demanarString("Tipus de competició:"), demanarString("Club del que es parla:"));
				int idNoticiaBasquet = buscarTitular(totEsport, titularNoticia);
				totEsport.getLlistaRedactors().get(numRedactor).getLlistaNoticies().get(idNoticiaBasquet).setText(demanarString("Introdueix el text de la notícia:"));
				break;
			
			case 3: //TENIS
				System.out.println("NOTÍCIA DE TENIS");
				crearTenis(totEsport, titularNoticia, demanarString("Tipus de competició:"), demanarString("Tenista principal de la notícia:"));
				int idNoticiaTenis = buscarTitular(totEsport, titularNoticia);
				totEsport.getLlistaRedactors().get(numRedactor).getLlistaNoticies().get(idNoticiaTenis).setText(demanarString("Introdueix el text de la notícia:"));
				break;
			
			case 4: //F1
				System.out.println("NOTÍCIA DE F1");
				crearF1(totEsport, titularNoticia, demanarString("Escuderia principal de la notícia:"));
				int idNoticiaF1 = buscarTitular(totEsport, titularNoticia);
				totEsport.getLlistaRedactors().get(numRedactor).getLlistaNoticies().get(idNoticiaF1).setText(demanarString("Introdueix el text de la notícia:"));
				break;
			
			case 5: //MOTOCICLISME
				System.out.println("NOTÍCIA DE MOTOCICLISME");
				crearMotociclisme(totEsport, titularNoticia, demanarString("Equip:"));
				int idNoticiaMoto = buscarTitular(totEsport, titularNoticia);
				totEsport.getLlistaRedactors().get(numRedactor).getLlistaNoticies().get(idNoticiaMoto).setText(demanarString("Introdueix el text de la notícia:"));
				break;
			}
		}else {
			System.out.println("Redactor no trobat a la redacció. Accediu al punt 1 del menú principal.");
		}
	}
	
	//MÉTODE PER CREAR NOTÍCIA FUTBOL
	public static void crearFutbol (Redaccio totEsport, String titular, String competicio, String club, String jugador) {
		int numRedactor = buscarRedactor(totEsport);
		totEsport.getLlistaRedactors().get(numRedactor).getLlistaNoticies().add(new Futbol(titular, competicio, club, jugador));
	}
	//MÈTODE PER CREAR NOTÍCIA BÀSQUET
	public static void crearBasquet (Redaccio totEsport, String titular, String competicio, String club) {
		int numRedactor = buscarRedactor(totEsport);
		totEsport.getLlistaRedactors().get(numRedactor).getLlistaNoticies().add(new Basquet(titular, competicio, club));
	}
	//MÉTODE PER CREAR NOTÍCIA TENIS
	public static void crearTenis(Redaccio totEsport, String titular, String competicio, String tenista) {
		int numRedactor = buscarRedactor(totEsport);
		totEsport.getLlistaRedactors().get(numRedactor).getLlistaNoticies().add(new Tenis(titular, competicio, tenista));
	}
	//MÉTODE PER CREAR NOTÍCIA F1
	public static void crearF1(Redaccio totEsport, String titular, String escuderia) {
		int numRedactor = buscarRedactor(totEsport);
		totEsport.getLlistaRedactors().get(numRedactor).getLlistaNoticies().add(new F1(titular, escuderia));
	}
	//MÉTODE PER CREAR NOTÍCIA MOTOCICLISME
	public static void crearMotociclisme(Redaccio totEsport, String titular, String equip) {
		int numRedactor = buscarRedactor(totEsport);
		totEsport.getLlistaRedactors().get(numRedactor).getLlistaNoticies().add(new Motociclisme(titular, equip));
	}

///DEFINIR MÈTODES PER BUSCAR OBJECTES///
	//MÈTODE PER BUSCAR REDACTOR
	static int buscarRedactor (Redaccio totEsport) {
		String dniRedactor = demanarString("Escriu el dni del redactor:");
		boolean dniTrobat = false;
		int cont = 0;
		int contDni = -1;
		
		do {
			if (dniRedactor.equalsIgnoreCase(totEsport.getLlistaRedactors().get(cont).getDni())){
				contDni = cont;
				dniTrobat = true;
			}else {
				dniTrobat = false;
				cont++;
			}
		}while((cont<totEsport.getLlistaRedactors().size()) || dniTrobat == false);
		return contDni;
	}
	
	//MÉTODE PER BUSCAR UN TITULAR
	static int buscarTitular (Redaccio totEsport, String titularNoticia) {
		int idRedactor = buscarRedactor (totEsport);
		
		boolean nomTrobat = false;
		int cont = 0;
		int contTitularNoticia = -1;
		
		do {
			if (titularNoticia.equalsIgnoreCase(totEsport.getLlistaRedactors().get(idRedactor).getLlistaNoticies().get(cont).getTitular())){
				contTitularNoticia = cont;
				nomTrobat = true;
			} else {
				nomTrobat = false;
				cont++;
			}
		} while (cont < totEsport.getLlistaRedactors().get(idRedactor).getLlistaNoticies().size() || nomTrobat == false);
		return contTitularNoticia;
	}
///DEFINIR MÈTODES PER MOSTRAR///
	static void mostrarNoticies (Redaccio totEsport) {
		int idRedactor = buscarRedactor(totEsport);
		if (idRedactor != -1) {
			int cont = 0;
			System.out.println("Els titulars de les notícies del redactor:");
			do {
				System.out.println(totEsport.getLlistaRedactors().get(idRedactor).getLlistaNoticies().get(cont).getTitular());
			}while (cont < totEsport.getLlistaRedactors().get(idRedactor).getLlistaNoticies().size());
		}else {
			System.out.println("Redactor no trobat a l'aplicació");
		}
	}
	
	
///DEFINIR MÈTODES PER ELIMINAR OBJECTES///
	//MÈTODE PER ELIMINAR REDACTOR
	static void eliminarRedactor (Redaccio totEsport) {
		int numRedactor = buscarRedactor(totEsport);
		
		if(numRedactor != -1) {
			totEsport.getLlistaRedactors().remove(numRedactor);
			System.out.println("Redactor eliminat correctament.");
		}else {
			System.out.println("Redactor no trobat a l'aplicació.");
		}
	}
	
	//MÈTODE PER ELIMINAR NOTÍCIA
	static void eliminarNoticia (Redaccio totEsport) {
		int numRedactor = buscarRedactor (totEsport);
		
		if (numRedactor != -1) {
			String titularNoticia = demanarString("Escriu el títol de la notícia que vulgueu eliminar:");
			int idNoticia = buscarTitular(totEsport, titularNoticia);
				if (idNoticia != -1) {
					totEsport.getLlistaRedactors().get(numRedactor).getLlistaNoticies().remove(idNoticia);
				}else {
					System.out.println("Notícia no trobada a l'aplicació.");
				}
		}else {
			System.out.println("Redactor no trobat a l'aplicació.");
		}
	}
	
///DEFINIR MÈTODES PER CALCULAR///
	//MÈTODE CALCULAR PUNTUACIÓ NOTÍCIES FUTBOL
	static int calcularPuntuacioFutbol (Redaccio totEsport, Object tipusNoticia) {
		int contPuntuacioFutbol = 5;
		
		//PUNTUACIÓ COMPETICIÓ
		String nomCompeticio = ((Futbol) tipusNoticia).getCompeticio();
		if(nomCompeticio.equalsIgnoreCase("Campions")) {
			contPuntuacioFutbol += 3;
		}else if(nomCompeticio.equalsIgnoreCase("Lliga")) {
			contPuntuacioFutbol += 2;
		}else {
			contPuntuacioFutbol += 0;
		}
		//PUNTUACIÓ CLUB
		String nomClub = ((Futbol)tipusNoticia).getClub();
		if(nomClub.equalsIgnoreCase("Barça")) {
			contPuntuacioFutbol += 1;
		}else if(nomCompeticio.equalsIgnoreCase("Madrid")) {
			contPuntuacioFutbol += 1;
		}else {
			contPuntuacioFutbol += 0;
		}
		//PUNTUACIÓ JUGADOR
		String nomJugador = ((Futbol) tipusNoticia).getJugador();
		if(nomJugador.equalsIgnoreCase("Ferran Torres")) {
			contPuntuacioFutbol += 1;
		}else if(nomJugador.equalsIgnoreCase("Benzema")) {
			contPuntuacioFutbol += 1;
		}else {
			contPuntuacioFutbol += 0;
		}
		
		return contPuntuacioFutbol;
	}
	
	//MÈTODE PER CALCULAR PUNTUACIÓ NOTÍCIES BÀSQUET
	static int calcularPuntuacioBasquet (Redaccio totEsport, Object tipusNoticia) {
		int contPuntuacioBasquet = 4;
	
		//PUNTUACIÓ COMPETICIÓ
		String nomCompeticio = ((Basquet)tipusNoticia).getCompeticio();
		if(nomCompeticio.equalsIgnoreCase("Eurolliga")) {
			contPuntuacioBasquet += 3;
		}else if(nomCompeticio.equalsIgnoreCase("ACB")) {
			contPuntuacioBasquet += 2;
		}else {
			contPuntuacioBasquet += 0;
		}
		//PUNTUACIÓ CLUB
		String nomClub = ((Basquet)tipusNoticia).getClub();
		if(nomClub.equalsIgnoreCase("Barça")) {
			contPuntuacioBasquet += 1;
		}else if(nomCompeticio.equalsIgnoreCase("Madrid")) {
			contPuntuacioBasquet += 1;
		}else {
			contPuntuacioBasquet += 0;
		}
		
		return contPuntuacioBasquet;
	}
	
	//MÈTODE PER CALCULAR PUNTUACIÓ NOTÍCIES TENIS
	static int calcularPuntuacioTenis (Redaccio totEsport, Object tipusNoticia) {
		int contPuntuacioTenis = 4;
		
		//PUNTUACIÓ NOM TENISTA
		String nomTenista = ((Tenis) tipusNoticia).getTenista();
		if(nomTenista.equalsIgnoreCase("Federer")) {
			contPuntuacioTenis += 3;
		}else if(nomTenista.equalsIgnoreCase("Nadal")) {
			contPuntuacioTenis += 3;
		}else if(nomTenista.equalsIgnoreCase("Djokovic")) {
			contPuntuacioTenis += 3;		
		}else {
			contPuntuacioTenis += 0;
		}
		
		return contPuntuacioTenis;
	}
	
	//MÈTODE PER CALCULAR PUNTUACIÓ NOTÍCIES F1
	static int calcularPuntuacioF1(Redaccio totEsport, Object tipusNoticia) {
		int contPuntuacioF1 = 4;
		//PUNTUACIÓ ESCUDERIA	
		String nomEscuderia = ((F1) tipusNoticia).getEscuderia();
		if(nomEscuderia.equalsIgnoreCase("Ferrari")) {
			contPuntuacioF1 += 2;
		}else if(nomEscuderia.equalsIgnoreCase("Mercedes")) {
			contPuntuacioF1 += 2;	
		}else {
			contPuntuacioF1 += 0;
		}
		
		return contPuntuacioF1;
	}
	
	//MÈTODE PER CALCULAR PUNTUACIÓ NOTÍCIES MOTOCICLISME
	static int calcularPuntuacioMotociclisme (Redaccio totEsport, Object tipusNoticia) {
		int contPuntuacioMoto = 3;
		//PUNTUACIÓ EQUIP
		String nomEquip = ((Motociclisme) tipusNoticia).getEquip();
		if(nomEquip.equalsIgnoreCase("Honda")) {
			contPuntuacioMoto += 3;
		}else if(nomEquip.equalsIgnoreCase("Yamaha")) {
			contPuntuacioMoto += 3;	
		}else {
			contPuntuacioMoto += 0;
		}
		
		return contPuntuacioMoto;
	}
	
	//MÈTODE PER CALCULAR PUNTUACIÓ
	static void calcularPuntuacio(Redaccio totEsport) {
	
		int idRedactor = buscarRedactor (totEsport);
		String titularNoticia = demanarString ("Escriu el nom de la notícia per calcular la puntuació:");
		int idNoticia = buscarTitular (totEsport, titularNoticia);

		if (idRedactor != -1) {
			
			if (idNoticia != -1) {
				Object tipusNoticia = totEsport.getLlistaRedactors().get(idRedactor).getLlistaNoticies().get(idNoticia);
				
				//NOTÍCIA FUTBOL
				if (tipusNoticia instanceof Futbol) {
					System.out.println("La puntuació de la notícia és de " + calcularPuntuacioFutbol (totEsport, tipusNoticia) + " punts");
					
				//NOTÍCIA BÀSQUET
				}else if(tipusNoticia instanceof Basquet) {
					System.out.println("La puntuació de la notícia és de " + calcularPuntuacioBasquet (totEsport, tipusNoticia) + " punts");
					
				//NOTÍCIA TENIS
				}else if(tipusNoticia instanceof Tenis) {
					System.out.println("La puntuació de la notícia és de " + calcularPuntuacioTenis (totEsport, tipusNoticia) + " punts");
					
				//NOTÍCIA F1
				}else if(tipusNoticia instanceof F1) {
					System.out.println("La puntuació de la notícia és de " + calcularPuntuacioF1 (totEsport, tipusNoticia) + " punts");
					
				//NOTÍCIA MOTOCICLISME
				}else if(tipusNoticia instanceof Motociclisme);
					System.out.println("La puntuació de la notícia és de " + calcularPuntuacioMotociclisme (totEsport, tipusNoticia) + " punts");
			}else {
				System.out.println("Notícia no trobada a l'aplicació.");
			}		
		}else {
			System.out.println("Redactor no trobat a l'aplicació.");
		}
	}
}
	

