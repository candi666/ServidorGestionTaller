package javafxserverside.ejb.factura;

import java.util.Collection;
import java.util.Date;
import javafxserverside.entity.Factura;
import javafxserverside.exception.factura.FacturasCreateException;
import javafxserverside.exception.factura.FacturasDeleteException;
import javafxserverside.exception.factura.FacturasQueryException;
import javafxserverside.exception.factura.FacturasUpdateException;
import javax.ejb.Local;

/**
 * Facturas Local Interface
 * @author Carlos
 */
@Local
public interface FacturaBeanLocal {
    
    // Insert
    public void createFactura(Factura factura) throws FacturasCreateException;
    
    // Get 
    public Collection<Factura> getAllFacturas() throws FacturasQueryException;
    public Collection<Factura> getFacturasByDate(Date fromDate, Date toDate) throws FacturasQueryException;;
    public Collection<Factura> getFacturasByCliente(int id) throws FacturasQueryException;;
    public Factura getFacturaById(int id) throws FacturasQueryException;;
    
    // Update
    public void updateFactura(Factura factura) throws FacturasUpdateException;
    
    // Delete
    public void deleteFactura(int id) throws FacturasDeleteException;
    
    
    
    
    
}
