package S3T2N3.divisas;

public class ConversorMonedas  {
	
	private Divisa moneda;

	public ConversorMonedas(Divisa moneda) {		
		this.moneda = moneda;
		
	}

	
	public double cambioEuro(double cantidad) {		
		return cantidad/moneda.getValorEuro();
				
	}
	
	
}
