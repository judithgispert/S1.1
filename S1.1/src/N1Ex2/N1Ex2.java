package N1Ex2;

public class N1Ex2 {

	public static void main(String[]args) {
		
		//CRIDA MÈTODE STATIC FRENAR
		Cotxe.frenar();
		
		//CRIDA MÈTODE ACCELERAR, S'HA DE CREAR UN OBJECTE
		Cotxe cotxe1 = new Cotxe ("CHR");
		cotxe1.accelerar();
		
	}
}
