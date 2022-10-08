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
