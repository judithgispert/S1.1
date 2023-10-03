package N3Ex1;

import java.util.ArrayList;

public class Redaccio {

	//Attributes
	protected float sou;
	private ArrayList <Redactor> llistaRedactors;
	
	//Constructor
	public Redaccio () {
		sou = 1500;
		llistaRedactors = new ArrayList <Redactor>();
	}
	
	//Get methods
	public float getSou() {
		return sou;
	}
	public ArrayList<Redactor> getLlistaRedactors() {
		return llistaRedactors;
	}
	
	//Set method
	public void setSou(float sou) {
		this.sou = sou;
	}
}
