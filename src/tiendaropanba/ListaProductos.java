package tiendaropanba;

import java.util.ArrayList;

public class ListaProductos {
    private ArrayList<Producto> listaProductos = new ArrayList();

    Producto producto1 = new Producto("Hola", 1, "Hola2", "XL","Rojo", 21.00, 1, "fagfagsd");
    
    public void añadir(){
        listaProductos.add(producto1);
    }
    
    
    
//    public String mostrar(){
//        String array = "";
//        for (int i = 0; i < listaProductos.size(); i++) {
//            System.out.println(listaProductos.set(i, producto1));
//        }
//        return array;
//    }  

    public ArrayList<Producto> getListaProductos() {
        return listaProductos;
    }
    
}
