package tarea_1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

class Pago {

    private float monto;
    private LocalDate fecha;

    Pago(float monto) {
        this.monto = monto;
        this.fecha = LocalDate.now();
    }
}

class Efectivo extends Pago {

    Efectivo(float monto) {
        super(monto);

    }
}

class Transferencia extends Pago {

    private String banco;
    private String numCuenta;

    Transferencia(float monto, String banco, String numCuenta) {
        super(monto);
        this.banco = banco;
        this.numCuenta = numCuenta;
    }

    public String getBanco() {
        return banco;
    }

    public String getNumCuenta() {
        return numCuenta;
    }
}

class Tarjeta extends Pago {

    private String tipo;
    private String numTransaccion;

    Tarjeta(float monto, String tipo, String numTransaccion) {
        super(monto);
        this.tipo = tipo;
        this.numTransaccion = numTransaccion;
    }

    public String getTipo() {
        return tipo;
    }

    public String getNumTransaccion() {
        return numTransaccion;
    }
}

class DocTriburtario {

    DocTriburtario() {

    }
}

class Boleta extends DocTriburtario {

    Boleta() {

    }
}

class Factura extends DocTriburtario {

    Factura() {

    }
}

class Dierccion {

    private String direccion;

    Dierccion(String direccion) {
        this.direccion = direccion;
    }

    public String getDireccion() {
        return direccion;
    }
}

class Cliente {

    private String nombre;
    private String rut;

    Cliente(String nombre, String rut) {
        this.nombre = nombre;
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public String getRut() {
        return rut;
    }
}

class Articulo {

    private float peso;
    private String nombre;
    private String descripcion;
    private float precio;

    Articulo(float peso, String nombre, String descripcion, float precio) {
        this.peso = peso;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
    }

    public float getPeso() {
        return peso;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public float getPrecio() {
        return precio;
    }
}

class DetalleOrden {

    DetalleOrden() {

    }
}

class OrdenCompra {

    OrdenCompra() {

    }
}

public class Tarea_1 {

    public static void main(String[] args) {

    }

}
