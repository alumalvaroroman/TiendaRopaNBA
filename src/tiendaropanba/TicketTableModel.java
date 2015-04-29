package tiendaropanba;

import javax.swing.table.AbstractTableModel;


public class TicketTableModel extends AbstractTableModel {
    private ListaTicket listaTicket;

    public TicketTableModel(ListaTicket ticket) {
        this.listaTicket = ticket;
    }
    
    @Override
    public int getRowCount() {
          return listaTicket.getListaTickets().size();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        LineaTicket ticket = listaTicket.getListaTickets().get(rowIndex);
        switch(columnIndex) {
            case 0:
                return ticket.getId().getIdProducto();
            case 1:
                return ticket.getProducto().getNombreProducto();
            case 2:
                return ticket.getCantidad();
            case 3:
                return ticket.getPrecio().getPrecio();
            default:
                return null;
        }
    }
    
    @Override
    public String getColumnName(int column) {
        switch(column) {
            case 0:
                return "Id";
            case 1:
                return "Producto";
            case 2:
                return "Cantidad";
            case 3:
                return "Precio";
            default:
                return null;
        }
    }  
    
}
