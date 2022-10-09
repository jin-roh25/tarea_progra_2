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
    
    public OrdenCompra(String a, Cliente b, DetalleOrden c){
        
        estado = a;
        fecha = LocalDate.now();
        cliente = b;
        carrito = new ArrayList<DetalleOrden>();
        carrito.add(c);
    }
    public String getEstado(){
        return this.estado;
    }
    public String getFecha(){
        
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        return this.fecha.format(formato);
    }
    public void setEstado(String a){
        estado = a;
    }
    public void setFecha(){
        fecha = LocalDate.now();
    }
    public void getCarrito(OrdenCompra a){
        carrito.add(a);
    }
    public String toString(){
        
        String contenido = "Estado: "+this.estado+"\nFecha: "+this.fecha+"\nCliente:\n"+cliente.toString();
        return contenido;   
    }
    public float calPrecio(){
        return;
    }
    public float calPrecioSinIVA(){
        
        
        return;
    }
    public float calIVA(){
        return;
    }
    public float calPeso(){
        return;
    }
}
