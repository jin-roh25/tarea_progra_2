/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea_1.local;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class OrdenCompra {
    
    private LocalDate fecha;
    private String estado;
    private Cliente cliente;
    private ArrayList<DetalleOrden> carrito;
    private Boleta boleta;
    private Factura factura;
    
    public OrdenCompra(String a, Cliente b, DetalleOrden c, Boleta d, Factura e){
        
        estado = a;
        fecha = LocalDate.now();
        cliente = b;
        carrito = new ArrayList<DetalleOrden>();
        carrito.add(c);
        boleta = d;
        factura = e;
    }
    public String getEstado(){
        return this.estado;
    }
    public LocalDate getFecha(){
        return this.fecha;
    }
    public ArrayList<DetalleOrden> getCarrito(){
        return this.carrito;
    }
    public Cliente getCliente(){
        return this.cliente;
    }
    public Boleta getBoleta(){
        return this.boleta;
    }
    public Factura getFactura(){
        return this.factura;
    }
    public void setEstado(String a){
        estado = a;
    }
	 public void setFecha(LocalDate fecha) {
	     this.fecha = fecha;
	 }
    public void setCarrito(DetalleOrden a){
        carrito.add(a);
    }
    public void setCliente(Cliente a){
        cliente = a;
    }
    public void setBoleta(Boleta a){
        boleta = a;
    }
    public void setFactura(Factura a){
        factura = a;
    }
    public String toString(){
        
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String contenido = "Estado: "+this.estado+"\nFecha: "+this.fecha.format(formato)+"\nCliente:\n"+cliente.toString();
        return contenido;   
    }
    public float calPrecio() {
        float sum = 0;
        for (int i=0; i < carrito.size(); i++) {
            sum += carrito.get(i).calPrecio();
        }
        return sum;
    }

    public float calPrecioSinIVA() {
        float sum = 0;
        for (int i=0; i < carrito.size(); i++) {
            sum += carrito.get(i).calPrecioSinIVA();
        }
        return sum;
    }

    public float calIVA() {
        float sum = 0;
        for (int i=0; i < carrito.size(); i++) {
            sum += carrito.get(i).calIVA();
        }
        return sum;
    }

    public float calPeso() {
        float sum = 0;
        for (int i=0; i < carrito.size(); i++) {
            sum += carrito.get(i).calPeso();
        }
        return sum;
    }
}
