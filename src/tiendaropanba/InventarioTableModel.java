package tiendaropanba;

import javax.swing.table.AbstractTableModel;


public class InventarioTableModel extends AbstractTableModel {

    private ListaProductos listaProductos;
    
    public InventarioTableModel(ListaProductos productos) {
        this.listaProductos = productos;
    }
    
    @Override
    public int getRowCount() {
          return listaProductos.getListaProductos().size();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Producto producto = listaProductos.getListaProductos().get(rowIndex);
        switch(columnIndex) {
            case 0:
                return producto.getNombreProducto();
            case 1:
                return producto.getReferencia();
            case 2:
                return producto.getEquipo();
            case 3:
                return producto.getPrecio();
            default:
                return null;
        }
    }
    
    @Override
    public String getColumnName(int column) {
        switch(column) {
            case 0:
                return "Nombre de producto";
            case 1:
                return "Ref";
            case 2:
                return "Equipo";
            case 3:
                return "Precio";
            default:
                return null;
        }
    }  
    
}