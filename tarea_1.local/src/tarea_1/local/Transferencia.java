package tarea_1.local;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Transferencia extends Pago {
	private String banco;
	private String numCuenta;

	public Transferencia(float monto, LocalDate fecha, OrdenCompra orden, String banco, String numCuenta) {
		super(monto, fecha, orden);
		this.banco = banco;
		this.numCuenta = numCuenta;
	}

	public String getBanco() {
		return banco;
	}

	public void setBanco(String banco) {
		this.banco = banco;
	}

	public String getNumCuenta() {
		return numCuenta;
	}

	public void setNumCuenta(String nuCuenta) {
		this.numCuenta = numCuenta;
	}

	public String toString() {

		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		return "monto: " + getMonto() + "\nfecha: " + getFecha().format(formato) + "\nbanco:" + banco + "\nnumCuenta:"
				+ numCuenta;
	}
}