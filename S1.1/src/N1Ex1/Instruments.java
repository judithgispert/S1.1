package N1Ex1;

public class Instruments {

	
	//CREEM ATRIBUTS
	protected String nom;
	protected float preu;
		
	//MÈTODE CONSTRUCTOR
	public Instruments(String nom, float preu) {
		this.nom = nom.toUpperCase();
		this.preu = preu;
	}
	
	//MÈTODES GET
	public String getNom() {
		return nom;
	}
	public float getPreu() {
		return preu;
	}
	
	//MÈTODES SET
	public void setNom(String nom) {
		this.nom = nom.toUpperCase();
	}
	public void setPreu(float preu) {
		this.preu = preu;
	}
	
	//MÈTODE TOCAR()
	public static void tocar() {
		System.out.println("Està sonant un instrument de ");
	}
		
}
