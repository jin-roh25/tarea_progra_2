/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tarea_1.local;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Tarea_1Local {

	public static void main(String[] args) {

		Direccion dir1 = new Direccion("roma 159");
		Direccion dir2 = new Direccion("ñuñoa");
		Direccion dir3 = new Direccion("san martin"); // direccion del local

		Cliente juan = new Cliente("juan", "21.004.069-2 rut juan", dir2);
		Cliente gabriel = new Cliente("gabriel", "61.125.123-9 rut gabriel", dir3);

		Articulo art1 = new Articulo(1, "juguete", "de toistory", 4);
		Articulo art2 = new Articulo((float) 78.2, "magazine", "ducha telefono", (float) 19000);
		Articulo art3 = new Articulo(3, "donal duck", "patito de hule", 12000);
		Articulo art4 = new Articulo((float) 7.2, "tocadiscos", "reproductor de discos de vinilo", (float) 200000);
		Articulo art5 = new Articulo(1, "juguete", "de toistory", 4);

		Boleta bol1 = new Boleta("exhtrcjtvkyglhuñ", "23.004.069-k rut bol1", dir1);
		Boleta bol2 = new Boleta("696969fchjb", "23.004.069-k rut bol2", dir1);
		Factura fac1 = new Factura("123456789gh", "23.004.069-k rut fac1", dir1);

		OrdenCompra ord1 = new OrdenCompra(juan, new DetalleOrden(3, art1), bol1, null);
		OrdenCompra ord2 = new OrdenCompra(gabriel, new DetalleOrden(8, art2), bol2, null);
		OrdenCompra ord3 = new OrdenCompra(juan, new DetalleOrden(2, art3), null, fac1);

		ord1.setCarrito(new DetalleOrden(25, art4));
		ord2.setCarrito(new DetalleOrden(1, art5));

		ord1.pagar(1, 10000, 1, null, null);
		ord2.pagar(2, 10000, 1, "Santander", "12345654321");
		ord3.pagar(3, 10000, 4, "credito", "951357");

		System.out.println(ord1.toString() + "\n" + ord2.toString() + "\n" + ord3.toString());

		/*
		 * Factura doc = new Factura("945832139","21.355.546-7");
		 * System.out.println(doc.toString());
		 */

		/*
		 * Prueba p = new Prueba();
		 * System.out.println(p.getFecha());
		 */

	}
}
