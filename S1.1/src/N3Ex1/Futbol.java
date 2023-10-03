package N3Ex1;

public class Futbol extends Noticia{

	//Attributes
	private String competicio;
	private String club;
	private String jugador;
	
	//Constructor
	public Futbol(String titular, String competicio, String club, String jugador) {
		super(titular);
		this.competicio = competicio;
		this.club = club;
		this.jugador = jugador;
	}
	
	//Get methods
	public String getCompeticio() {
		return competicio;
	}
	public String getClub() {
		return club;
	}
	public String getJugador() {
		return jugador;
	}
	
	//Set methods
	public void setCompeticio (String competicio) {
		this.competicio = competicio;
	}
	public void setClub (String club) {
		this.club = club;
	}
	public void setJugador (String jugador) {
		this.jugador = jugador;
	}

}
