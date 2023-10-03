package N2Ex1;
import java.util.Scanner;

public class N2Ex1 {

	public static void main (String[]args) {
		
		Scanner input = new Scanner(System.in);
		
		//CREAR OBJECTE
		Smartphone smartphone1 = new Smartphone ("Samsung", "GalaxyNote");
		
		//CRIDA MÈTODE TRUCAR()
		System.out.println("Escriu al número de telèfon que voleu trucar:");
		String numTelefon = input.nextLine();
		smartphone1.trucar(numTelefon);
		
		smartphone1.alarma();
		smartphone1.fotografiar();
		
		input.close();
	}
}
