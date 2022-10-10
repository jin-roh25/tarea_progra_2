package tarea_1.local;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

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
        public String toString(){
            
            DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd-MM-yyyy");
            return "monto: " + getMonto() + "\nfecha: " + getFecha().format(formato)+"\ntipo: "+this.tipo+"\nnumTransaccion: "+this.numTransacción;
        }
}