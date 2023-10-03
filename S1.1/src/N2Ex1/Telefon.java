package N2Ex1;

public class Telefon {

	//ATRIBUTS
	protected String marca;
	protected String model;
	
	//MÈTODE CONSTRUCTOR
	public Telefon (String marca, String model) {
		this.marca = marca;
		this.model = model;
	}
	
	//MÈTODES GET
	public String getMarca() {
		return marca;
	}
	public String getModel() {
		return model;
	}
	
	//MÈTODES SET
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public void setModel(String model) {
		this.model = model;
	}
	
	//MÈTODE TRUCAR()
	public void trucar(String numTelefon) {
		System.out.println("S'està trucant al " + numTelefon);
	}
}
