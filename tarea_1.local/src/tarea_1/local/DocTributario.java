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
    
    DocTributario(String a, String b){
        
        this.numero = a;
        this.rut = b;
        this.fecha = LocalDate.now();
    }
    
    public String getNumero(){
        
        return this.numero;
    }
    public String getRut(){
        
        return this.rut;
    }
    public String getFecha(){
        
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        return this.fecha.format(formato);
    }
    public void setNumero(String a){
        
        this.numero =a;
    }
    public void setRut(String b){
        
        this.rut = b;
    }
    public void setFecha(){
        
        this.fecha = LocalDate.now();
    }
    public String toString(){
        
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String s = "Numero: "+this.numero+"\nRut: "+this.rut+"\nFecha: "+this.fecha.format(formato);
        return s;
    }
}
