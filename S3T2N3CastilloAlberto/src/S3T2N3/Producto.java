package S3T2N3;

public class Producto {
	
	private String descripcion;
	private double precioEuro;
	
	public Producto(String descripcion, double precio) {
		
		this.descripcion = descripcion;
		this.precioEuro = precio;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public double getPrecio() {
		return precioEuro;
	}

	public void setPrecio(double precio) {
		this.precioEuro = precio;
	}
	
	
	
	

}
