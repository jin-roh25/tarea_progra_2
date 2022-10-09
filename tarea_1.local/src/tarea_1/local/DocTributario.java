/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea_1.local;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DocTributario {
    private String numero;
    private String rut;
    private LocalDate fecha;
    private Direccion direccion;
    
    DocTributario(String a, String b, Direccion c){
        
        this.numero = a;
        this.rut = b;
        this.fecha = LocalDate.now();
        this.direccion = c;
    }
    public String getNumero(){
        return this.numero;
    }
    public String getRut(){
        return this.rut;
    }
    public LocalDate getFecha(){
        return this.fecha;
    }
    public Direccion getDireccion(){
        return this.direccion;
    }
    public void setNumero(String a){
        
        this.numero =a;
    }
    public void setRut(String a){
        
        this.rut = a;
    }
    public void setFecha(){
        
        this.fecha = LocalDate.now();
    }
    public void setDireccion(String a){
        
        this.direccion.setDireccion(a);
    }
    public String toString(){
        
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String s = "Numero: "+this.numero+"\nRut: "+this.rut+"\nFecha: "+this.fecha.format(formato);
        return s;
    }
}
