/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea_1.local;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class OrdenCompra {
    
    private LocalDate fecha;
    private String estado;
    
    public OrdenCompra(String a){
        
        estado = a;
        fecha = LocalDate.now();
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
    public String toString(){
        
        String contenido = "Estado: "+this.estado+"\nFecha: "+this.fecha;
        return contenido;   
    }
    
}
