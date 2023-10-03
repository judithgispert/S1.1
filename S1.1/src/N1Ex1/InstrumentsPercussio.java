package N1Ex1;

public class InstrumentsPercussio extends Instruments{

	
	//MÈTODE CONSTRUCTOR
	public InstrumentsPercussio(String nom, float preu) {
		super(nom, preu);
	}
	
	//MÈTODE TOCAR()
	public static void tocar() {
		System.out.println("Està sonant un instrument de percussió.");
	}
	

	
	
}
