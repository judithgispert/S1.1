package N3Ex1;

import java.util.ArrayList;

public class Redactor extends Redaccio {

	//Attributes
	private String nom;
	private String dni;
	private ArrayList <Noticia> llistaNoticies;
	
	//Constructor
	public Redactor (String nom, String dni) {
		super();
		this.nom = nom.toUpperCase();
		this.dni = dni.toUpperCase();
		llistaNoticies = new ArrayList <Noticia>();
	}
	
	//Get methods
	public String getNom(){
		return nom;
	}
	public String getDni(){
		return dni;
	}
	public ArrayList<Noticia> getLlistaNoticies() {
		return llistaNoticies;
	}
	
	//Set methods
	public void setNom (String nom) {
		this.nom = nom.toUpperCase();
	}
	public void setDni (String dni) {
		this.dni = dni.toUpperCase();
	}
	public void setSou(float sou) {
		this.sou = sou;
	}
	
	
}
