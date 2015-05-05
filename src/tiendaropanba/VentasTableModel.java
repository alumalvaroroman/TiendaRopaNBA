package tiendaropanba;

import javax.swing.table.AbstractTableModel;


public class VentasTableModel extends AbstractTableModel {
    private ListaVentas listaVentas;

    public VentasTableModel(ListaVentas venta) {
        this.listaVentas = venta;
    }
    
    @Override
    public int getRowCount() {
          return listaVentas.getListaVentas().size();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Ventas venta = listaVentas.getListaVentas().get(rowIndex);
        switch(columnIndex) {
            case 0:
                return venta.getIdVentas();
            case 1:
                return venta.getIdProducto().getIdProducto();
            case 2:
                return venta.getIdTicket().getIdTicket();
            case 3:
                return venta.getPrecio();
            default:
                return null;
        }
    }
    
    @Override
    public String getColumnName(int column) {
        switch(column) {
            case 0:
                return "Id Venta";
            case 1:
                return "Id Producto";
            case 2:
                return "Id Ticket";
            case 3:
                return "Precio";
            default:
                return null;
        }
    }  
    
}
