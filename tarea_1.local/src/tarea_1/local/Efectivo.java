package tarea_1.local;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Efectivo extends Pago {
	public Efectivo(float monto,LocalDate fecha,OrdenCompra orden){
		super(monto,fecha,orden);
	}

	public float calcDevolucion(){
		return this.getMonto() - orden.calPrecio();
	}
        public String toString(){
            
            DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		return "monto: " + getMonto() + "\nfecha: " + getFecha().format(formato);
        }
}