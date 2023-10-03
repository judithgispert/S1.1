package N1Ex2;

public class Cotxe {

	private static final String marca = "Toyota";
		//STATIC = ATRIBUT DE LA CLASSE + FINAL = CONSTANT
	private static String model;
		//STATIC = ATRIBUT DE LA CLASSE, NO DEFINIT PQ NO ÉS FINAL = NO CONSTANT
	private final int potencia;
		//FINAL = CONSTANT
	
	//MÈTODE CONSTRUCTOR
	public Cotxe(String model, int potencia) {
		this.model = model;
		this.potencia = potencia;
	}
	
	public Cotxe(String model) { 
		this.model = model;
		potencia = 140;
	}
		
	//MÈTODES GET
	public String getMarca() {
		return marca;
	}
	public String getModel() {
		return model;
	}
	public int getPotencia() {
		return potencia;
	}
		
	//MÈTODES SET
	public void setModel(String model) {
		this.model = model;
	}
		
	//MÈTODE FRENAR()
	public static void frenar() {
		System.out.println("El vehicle està frenant.");
	}

	//MÈTODE ACCELERAR()
	public void accelerar() {
		System.out.println("El vehicle està accelerant.");
	}
		
	
	
}
