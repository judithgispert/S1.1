package N3Ex1;

public class F1 extends Noticia{

	//Attributes
	private String escuderia;
	
	//Constructor
	public F1(String titular, String escuderia) {
		super(titular);
		this.escuderia = escuderia;
	}
	
	//Get methods
	public String getEscuderia() {
		return escuderia;
	}
	
	//Set methods
	public void setEscuderia(String escuderia) {
		this.escuderia = escuderia;
	}

}
