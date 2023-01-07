package S3T2N3;

import java.util.ArrayList;
import java.util.Scanner;

import S3T2N3.divisas.*;


public class Main {

	public static void main(String[] args) {

		// euro 1
		// dolar 0,95
		// libras 1,13

		Divisa euro = new Euro("Euro", 1);
		Divisa dolar = new Dolar("Dolar", 0.95);
		Divisa libras = new Libras("Libras esterlinas", 1.13);

		Producto zapato = new Producto("Zapatos", 90.25);
		Producto sandalias = new Producto("Sandalias", 40.35);
		Producto vestido = new Producto("Vestido", 60.95);
		Producto pantalon = new Producto("Pantalon", 75.12);

		ArrayList<Producto> listProductos = new ArrayList<Producto>();
		listProductos.add(zapato);
		listProductos.add(sandalias);
		listProductos.add(vestido);
		listProductos.add(pantalon);

		boolean salir = false;
		do {
			switch (menu()) {
			case 1:
				MostrarPrecios mostrar = new MostrarPrecios(listProductos, euro);
				mostrar.printar();
				break;
			case 2:
				MostrarPrecios mostrar2 = new MostrarPrecios(listProductos, dolar);
				mostrar2.printar();
				break;
			case 3:
				MostrarPrecios mostrar3 = new MostrarPrecios(listProductos, libras);
				mostrar3.printar();
				break;

			case 0:
				System.out.println("Gracias por utilizar la aplicación");
				salir = true;
				break;

			default:
				System.err.println("ERROR");
				break;
			}
		} while (!salir);

	}

	public static byte menu() {
		Scanner scan = new Scanner(System.in);
		byte opcion;
		final byte MINIMO = 0;
		final byte MAXIMO = 3;
		do {
			System.out.println("\n**Elije en cual divisa quieres ver los precios.**");
			System.out.println("1.- Euro");
			System.out.println("2.- Dolar");
			System.out.println("3.- Libras esterlinas");
			System.out.println("0.- Salir\n");
			opcion = scan.nextByte();
			if (opcion < MINIMO || opcion > MAXIMO) {
				System.out.println("Escoje una opción valida");
			}

		} while (opcion < MINIMO || opcion > MAXIMO);

		return opcion;
	}

}
