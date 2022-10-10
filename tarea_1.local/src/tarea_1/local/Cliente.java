/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea_1.local;

public class Cliente {
    
  private String nombre;
  private String rut;
  private Direccion direccion;
    
    Cliente(String nombre, String rut, Direccion direccion){
        
        this.nombre = nombre;
        this.rut = rut;
        this.direccion = direccion;
    }
    public String getNombre(){
        return this.nombre;
    }
    public String getRut(){
        return this.rut;
    }
    public String getDireccion(){
        return this.direccion.getDireccion();
    }
    public void setNombre(String Nombre){
        this.nombre = Nombre;
    }
    public void setRut(String Rut){
        this.rut = Rut;
    }
    public void setDireccion(String a){
        this.direccion.setDireccion(a);
    }
    public String toString(){
        
        String contenido = "Nombre: "+this.nombre+"\nRut:"+this.rut+"\n"+this.direccion.toString();
        return contenido;
    }  
}
