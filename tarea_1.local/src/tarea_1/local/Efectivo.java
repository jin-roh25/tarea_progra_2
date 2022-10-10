package tarea_1.local;

import java.time.LocalDate;

public class Efectivo extends Pago {
	public Efectivo(float monto,LocalDate fecha,OrdenCompra orden){
		super(monto,fecha,orden);
	}

	public float calcDevolucion(){
		return this.getMonto() - orden.calPrecio();
	}
}