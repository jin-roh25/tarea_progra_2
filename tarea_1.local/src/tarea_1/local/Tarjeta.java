package tarea_1.local;

import java.time.LocalDate;

public class Tarjeta extends Pago {
	private String tipo;
	private String numTransacción;

	public Tarjeta(float monto, LocalDate fecha, OrdenCompra orden, String tipo, String numTransacción){
		super(monto, fecha, orden);
		this.tipo = tipo;
		this.numTransacción = numTransacción;
	}

	public String getTipo(){
		return tipo;
	}

	public void setTipo(String tipo){
		this.tipo = tipo;
	}

	public String getNumTransacción() {
		return numTransacción;
	}

	public void setNumTransacción(String nuCuenta){
		this.numTransacción = numTransacción;
	}
}