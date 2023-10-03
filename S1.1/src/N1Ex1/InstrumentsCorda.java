package N1Ex1;

public class InstrumentsCorda extends Instruments{
	
	//MÈTODE CONSTRUCTOR
	public InstrumentsCorda(String nom, float preu) {
		super(nom, preu);
	}
	
	//MÈTODE TOCAR()
	public static void tocar() {
		System.out.println("Està sonant un instrument de corda.");
	}

}
