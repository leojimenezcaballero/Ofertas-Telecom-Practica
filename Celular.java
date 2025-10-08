//Definir package


public class Celular extends Oferta {

	private String Marca;
	private String Modelo;
	private char color;
	private int InternMemory;
	private int RAM;
	private boolean banda5g;

	
	public Celular(int id, double price, boolean aplicaPromo, String Marca, String Modelo, char color, int InternMemory, int RAM, boolean banda5g) {
		//Definir constructor|
	}

	
	public String getMarca() {
		//Completar
	}

	
	public void setMarca(String Marca) {
		//Completar
	}

	
	public String getModelo() {
		//Completar
	}

	public void setModelo(String Modelo) {
		//Completar
	}

	
	public char getColor() {
		//Completar
	}

	
	public void setColor(char color) {
		//Completar
	}

	
	public int getInternMemory() {
		//Completar
	}

	
	public void setInternMemory(int InternMemory) {
		//	Completar
	}

	
	public int getRAM() {
		//Completar
	}

	
	public void setRAM(int RAM) {
		//Completar
	}

	
	public boolean getBanda5g() {
		//Completar
	}

	
	public void setBanda5g(boolean banda5g) {
		//Completar
	}

	
	@Override   //Nota: Este método sobreescribe (override) el método mostrarInfo de la superclase Oferta
	public String mostrarInfo() {
		//Completar (Incluir atributos de Celular y llamar al método mostrarInfo de la superclase)	
	}

}