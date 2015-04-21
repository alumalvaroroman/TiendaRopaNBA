package tiendaropanba;

import java.util.ArrayList;

public class ListaProductos {
    private ArrayList<Producto> listaProductos = new ArrayList();

    public Producto getProducto(int index){
        return this.listaProductos.get(index);
    }   
    
    public ArrayList<Producto> getListaProductos() {
        return listaProductos;
    }
    
}
