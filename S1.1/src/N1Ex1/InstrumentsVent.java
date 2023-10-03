package N1Ex1;

public class InstrumentsVent extends Instruments{
	
	//MÈTODE CONSTRUCTOR
	public InstrumentsVent(String nom, float preu) {
		super(nom, preu);
	}

	//MÈTODE TOCAR()
	public static void tocar() {
		System.out.println("Està sonant un instrument de vent.");
	}
}
