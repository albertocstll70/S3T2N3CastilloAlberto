package S3T2N3;

import java.util.ArrayList;

import S3T2N3.divisas.*;


public class MostrarPrecios {

	private ArrayList<Producto> listaProductos;
	private Divisa divisa;

	public MostrarPrecios(ArrayList<Producto> listaProductos, Divisa divisa) {

		this.listaProductos = listaProductos;
		this.divisa = divisa;

	}

	public void printar() {
		ConversorMonedas conversor = new ConversorMonedas(this.divisa);

		for (Producto i : this.listaProductos) {
			if (this.divisa instanceof Euro) {
				System.out.println(i.getDescripcion() + "  precio " + i.getPrecio() + " Euros");
			}

			else if (this.divisa instanceof Dolar) {
				System.out.printf(i.getDescripcion());
				System.out.printf("  precio %.2f", conversor.cambioEuro(i.getPrecio()));
				System.out.printf(" Dolares \n");
			}

			else if (this.divisa instanceof Libras) {
				System.out.printf(i.getDescripcion());
				System.out.printf("  precio %.2f", conversor.cambioEuro(i.getPrecio()));
				System.out.printf(" Libras \n");

			}

		}

	}

}
