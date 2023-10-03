package N3Ex1;

public class Basquet extends Noticia{

	//Attributes
	private String competicio;
	private String club;
	
	//Constructor
	public Basquet(String titular, String competicio, String club) {
		super(titular);
		this.competicio = competicio;
		this.club = club;
	}

	//Get methods
	public String getCompeticio () {
		return competicio;
	}
	public String getClub() {
		return club;
	}
	
	//Set methods
	public void setCompeticio (String competicio) {
		this.competicio = competicio;
	}
	public void setClub(String club) {
		this.club = club;
	}
}
