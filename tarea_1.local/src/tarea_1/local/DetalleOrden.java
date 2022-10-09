/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea_1.local;

public class DetalleOrden {
    
    private int cantidad;
    private Articulo articulo;
    
    public DetalleOrden(int a, Articulo b){
        
        cantidad = a;
        articulo = b;
    }
    public int getCantidad(){
        return this.cantidad;
    }
    public void setCantidad(int a){
        
        this.cantidad = a;
    }
    public String toString(){
        
        String contenido = "Cantidad: "+this.cantidad+"\nArticulo:\n"+articulo.toString();
        return contenido;
    }
    public float calPrecio(){
        
        float precio =  (float)1.19*articulo.getPrecio()*cantidad;
        return precio;
    }
    public float calPrecioSinIVA(){
        
        float precio =  articulo.getPrecio()*cantidad;
        return precio;
    }
    public float calIVA(){
        
        float precio = (float)0.19*articulo.getPrecio();
        return precio;
    }
    public float calPeso(){

        float peso = articulo.getPeso()*cantidad;
        return peso;
    }
}
