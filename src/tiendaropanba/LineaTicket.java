package tiendaropanba;

public class LineaTicket {
   private Producto id;
   private Producto producto;
   private int cantidad;
   private Producto precio;

   public LineaTicket() {
   }

    public LineaTicket(Producto id, Producto producto, int cantidad, Producto precio) {
        this.id = id;
        this.producto = producto;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    public Producto getId() {
        return id;
    }

    public void setId(Producto id) {
        this.id = id;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }
 
    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Producto getPrecio() {
        return precio;
    }

    public void setPrecio(Producto precio) {
        this.precio = precio;
    }
  
   
}
