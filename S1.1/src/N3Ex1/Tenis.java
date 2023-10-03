package N3Ex1;

public class Tenis extends Noticia{

	//Attributes
	private String competicio;
	private String tenista;
	
	//Constructor
	public Tenis(String titular, String competicio, String tenista) {
		super(titular);
		this.competicio = competicio;
		this.tenista = tenista;
	}
	
	//Get methods
	public String getCompeticio () {
		return competicio;
	}
	public String getTenista() {
		return tenista;
	}
	
	//Set methods
	public void setCompeticio (String competicio) {
		this.competicio = competicio;
	}
	public void setTenista (String tenista) {
		this.tenista = tenista;
	}
}
