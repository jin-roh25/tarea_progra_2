/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea_1.local;

public class Cliente {
    
  private String nombre;
  private String rut;
    
    Cliente(String Nombre, String Rut){
        
        this.nombre = Nombre;
        this.rut = Rut;
    }
    public String getNombre(){
        return this.nombre;
    }
    public String getRut(){
        return this.rut;
    }
    public void setNombre(String Nombre){
        this.nombre = Nombre;
    }
    public void setRut(String Rut){
        this.rut = Rut;
    }
    public String toString(){
        
        String contenido = "Nombre: "+this.nombre+"\n"+"Rut:"+this.rut;
        return contenido;
    }  
}
