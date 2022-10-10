package tarea_1.local;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public abstract class Pago {
	public OrdenCompra orden;
	private float monto;
	private LocalDate fecha;

	public Pago(float monto, LocalDate fecha, OrdenCompra orden) {
		this.monto = monto;
		this.fecha = fecha;
		this.orden = orden;
	}

	public float getMonto(){
		return monto;
	}

	public void setMonto(float monto){
		this.monto = monto;
	}

	public LocalDate getFecha() {
		return this.fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public OrdenCompra getOrden() {
		return this.orden;
	}

	public void setOrden(OrdenCompra orden){
		this.orden = orden;
	}

	public abstract String toString();
}
