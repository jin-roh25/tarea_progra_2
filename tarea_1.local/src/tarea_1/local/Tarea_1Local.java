/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tarea_1.local;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

class Pago{
    Pago(){
        
    }
}

class Efectivo extends Pago{
    Efectivo(){
        
    }
}

class Transferencia extends Pago{
    Transferencia(){
        
    }
}

class Tarjeta extends Pago{
    Tarjeta(){
        
    }
}

class DocTriburtario{
    
    private String numero;
    private String rut;
    private LocalDate fecha;
    
    DocTriburtario(String a, String b){
        
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

class Boleta extends DocTriburtario{
    Boleta(String num, String rut){
        
        super(num,rut);
    }
    
}

class Factura extends DocTriburtario{
    Factura(String num, String rut){
        
        super(num,rut);
    }
    
}

class Dierccion{
    
    private String direccion;
    
    Dierccion(String Direccion){
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
class Cliente{
    
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
        
        String s = "Nombre: "+this.nombre+"\n"+"Rut:"+this.rut;
        return s;
    }
}

class Articulo{
    Articulo(){
        
    }
}

class DetalleOrden{
    DetalleOrden(){
        
    }
}

class OrdenCompra{
    OrdenCompra(){
        
    }
}

public class Tarea_1Local {

    public static void main(String[] args) {
        
        /*Factura doc = new Factura("945832139","21.355.546-7");
        System.out.println(doc.toString());*/
        
        Prueba p = new Prueba();
        System.out.println(p.getFecha());
    }
    
}
