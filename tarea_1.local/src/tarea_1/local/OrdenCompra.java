/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea_1.local;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class OrdenCompra {
    
    private LocalDate fecha;
    private String estado;
    private Cliente cliente;
    private ArrayList<DetalleOrden> carrito;
    private Boleta boleta;
    private Factura factura;
	 private ArrayList pagos;
    
    public OrdenCompra(Cliente cliente, DetalleOrden primerDetalle, Boleta boleta, Factura factura){
        
        estado = "PorPagar";
        fecha = LocalDate.now();
        this.cliente = cliente;
        carrito = new ArrayList<DetalleOrden>();
        carrito.add(primerDetalle);
        this.boleta = boleta;
        this.factura = factura;
    }
    public String getEstado(){
        return this.estado;
    }
    public LocalDate getFecha(){
        return this.fecha;
    }
    public ArrayList<DetalleOrden> getCarrito(){
        return this.carrito;
    }
    public Cliente getCliente(){
        return this.cliente;
    }
    public Boleta getBoleta(){
        return this.boleta;
    }
    public Factura getFactura(){
        return this.factura;
    }
    public void setEstado(String a){
        estado = a;
    }
	 public void setFecha(LocalDate fecha) {
	     this.fecha = fecha;
	 }
    public void setCarrito(DetalleOrden a){
        carrito.add(a);
    }
    public void setCliente(Cliente a){
        cliente = a;
    }
    public void setBoleta(Boleta a){
        boleta = a;
    }
    public void setFactura(Factura a){
        factura = a;
    }
    public float calPrecio() {
        float sum = 0;
        for (int i=0; i < carrito.size(); i++) {
            sum += carrito.get(i).calPrecio();
        }
        return sum;
    }

    public float calPrecioSinIVA() {
        float sum = 0;
        for (int i=0; i < carrito.size(); i++) {
            sum += carrito.get(i).calPrecioSinIVA();
        }
        return sum;
    }

    public float calIVA() {
        float sum = 0;
        for (int i=0; i < carrito.size(); i++) {
            sum += carrito.get(i).calIVA();
        }
        return sum;
    }

    public float calPeso() {
        float sum = 0;
        for (int i=0; i < carrito.size(); i++) {
            sum += carrito.get(i).calPeso();
        }
        return sum;
    }
	 
		public String toString() {

			DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd-MM-yyyy");
			String contenido = "Estado: " + this.estado + "\nFecha: " + this.fecha.format(formato) + "\nprecio:" + this.calPrecio() + 
									"\nCliente:" + cliente.toString() + "\n";
			if (estado == "pagadoCnEfct"){
				Efectivo temp = pagos.get(0);
				contenido = contenido + temp.toString();
			}else if (estado == "pagadoCnTrans"){
			}else if (estado == "pagadoCnTarj"){
				for (int i = 0;i<pagos.size();i++){
					Pago temp = 
					contenido = contenido + pagos[i].toString();
				}
			return contenido;
		}

	 public void pagar(int metodoDePago, float monto, int cuotas, String s1, String s2) {

		if (metodoDePago == 1){
			this.estado = "pagadoCnEfect";
			pagos.add(new Efectivo(monto,LocalDate.now(),this));
		}else if(metodoDePago == 2){
			this.estado = "pagadoCnTrans";
			pagos.add(new Transferencia(this.calPrecio(),LocalDate.now(),this,s1,s2));
		}else if(metodoDePago == 3){
			this.estado = "pagadoCnTarj";
			float cuota = this.calPrecio()/cuotas;
			LocalDate fecha = LocalDate.now();
			for (int i = 0;i<cuotas;i++){
				pagos.add(new Tarjeta(cuota, fecha.plusDays(i*30), this, s1, s2));
			}
		}
	 }
}
