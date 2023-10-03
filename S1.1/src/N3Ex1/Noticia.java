package N3Ex1;

public class Noticia {

	//Attributes
	protected String titular;
	protected String text;
	protected int puntuacio;
	protected int preu;
	
	//Constructor
	public Noticia (String titular) {
		this.titular = titular;
		text = "";
		puntuacio = 0;
		preu = 0;
	}
	
	//Get methods
	public String getTitular () {
		return titular;
	}
	public String getText() {
		return text;
	}
	public int getPuntuacio() {
		return puntuacio;
	}
	public int getPreu() {
		return preu;
	}
	
	//Set methods
	public void setTitular(String titular) {
		this.titular = titular;
	}
	public void setText(String text) {
		this.text = text;
	}
	
	public void calcularPreuNoticia() {
		
	}
	
	
	
	
	
	
	
}