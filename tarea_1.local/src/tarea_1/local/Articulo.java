/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea_1.local;

public class Articulo {
    
    private float peso;
    private String nombre;
    private String descripcion;
    private float precio;
    
    public Articulo(float peso,String nombre,String descripcion, float precio){
        
        this.peso = peso;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
    }
    public float getPeso(){
        return this.peso;
    }
    public String getNombre(){
        return this.nombre;
    }
    public String getDescripcion(){
        return this.descripcion;
    }
    public float getPrecio(){
        return this.precio;
    }
    public void setpPeso(float a){
        this.peso = a;
    }
    public void setNombre(String b){
        this.nombre = b;
    }
    public void setDescripcion(String c){
        this.descripcion = c;
    }
    public void setPrecio(float d){
        this.precio = d;
    }
    public String toString(){
        String contenido = "Peso: "+this.peso+"\nNombre: "+this.nombre+"\nDescripcion: "+this.descripcion+"\nPrecio: "+this.precio;
        return contenido;
    }
}
