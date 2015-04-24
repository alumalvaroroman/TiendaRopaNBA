package tiendaropanba;

public class Producto {
    private String nombreProducto;
    private int id;
    private String equipo;
    private String talla;
    private String color;
    private double precio;
    private int cantidadesDisponibles;
    private String descripcion;

    public Producto() {
    }

    public Producto(int id, String nombreProducto, String equipo, String talla, String color, double precio, int cantidadesDisponibles, String descripcion) {
        this.id = id;
        this.nombreProducto = nombreProducto;
        this.equipo = equipo;
        this.talla = talla;
        this.color = color;
        this.precio = precio;
        this.cantidadesDisponibles = cantidadesDisponibles;
        this.descripcion = descripcion;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEquipo() {
        return equipo;
    }

    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidadesDisponibles() {
        return cantidadesDisponibles;
    }

    public void setCantidadesDisponibles(int cantidadesDisponibles) {
        this.cantidadesDisponibles = cantidadesDisponibles;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    
    
}
