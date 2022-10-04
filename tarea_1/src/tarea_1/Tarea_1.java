<<<<<<< HEAD
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tarea_1;
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
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        
    }
    
    public String getNumero(){
        
        return this.numero;
    }
    public String getRut(){
        
        return this.rut;
    }
    public String getFecha(){
        
        return this.fecha.format(myFormatObj);
    }
    public void setNumero(String a){
        
        this.numero =a;
    }
    public void setRut(String b){
        
        this.rut = b;
    }
    public void setFecha(){
        
        this.fecha = LocalDate.now();
        myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy");
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
    Dierccion(){
        
    }
}
class Cliente{
    Cliente(){
        
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

public class Tarea_1 {

    public static void main(String[] args) {
        
    }
    
}
>>>>>>> 65226a48433b647b54f63aa745de97de3191b370
