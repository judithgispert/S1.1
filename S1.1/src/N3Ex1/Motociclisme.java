package N3Ex1;

public class Motociclisme extends Noticia{

	//Attributes
	private String equip;
	
	//Constructor
	public Motociclisme(String titular, String equip) {
		super(titular);
		this.equip = equip;
	}
	
	//Get methods
	public String getEquip() {
		return equip;
	}
	
	//Set methods
	public void setEquip (String equip) {
		this.equip = equip;
	}

}
