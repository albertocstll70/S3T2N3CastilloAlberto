package S3T2N3.divisas;

public class Divisa {
	
	private String nombre;
	private double valorEuro;
	
	public Divisa(String nombre, double valorEuro) {
		
		this.nombre = nombre;
		this.valorEuro = valorEuro;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getValorEuro() {
		return valorEuro;
	}

	public void setValorEuro(double valorEuro) {
		this.valorEuro = valorEuro;
	}
	
	
	

}
