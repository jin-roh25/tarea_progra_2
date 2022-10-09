/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea_1.local;

public class Direccion {
    
    private String direccion;
    
    Direccion(String Direccion){
        this.direccion = Direccion;
    }
    public String getDireccion(){
        return this.direccion;
    }
    public void setDireccion(String Direccion){
        this.direccion = Direccion;
    }
    public String toString(){
        
        String s = "Direccion: "+this.direccion;
        return s;
    }
}
