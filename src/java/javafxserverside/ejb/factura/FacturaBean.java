package javafxserverside.ejb.factura;

import java.util.Collection;
import java.util.Date;
import java.util.List;
import javafxserverside.entity.Factura;
import javafxserverside.exception.factura.FacturasCreateException;
import javafxserverside.exception.factura.FacturasDataException;
import javafxserverside.exception.factura.FacturasQueryException;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Define EJB for Facturas
 *
 * @author Carlos
 */
@Stateless
public class FacturaBean implements FacturaBeanLocal {

    @PersistenceContext
    private EntityManager em;

    /**
     * Get all facturas
     *
     * @return facturas collection
     */
    @Override
    public Collection<Factura> getAllFacturas() {
        return em.createNamedQuery("findAllClientes").getResultList();
    }

    /**
     * Create new factura.
     *
     * @param factura new factura
     * @return 0 error, 1 ok, 2 already exists.
     */
    @Override
    public void createFactura(Factura factura) {
        try {
            if (!isValid(factura)) {
                throw new FacturasDataException();
            }
            
            em.persist(factura);
            
        } catch (Exception ex) {
            //throw new FacturasCreateException();
        }

    }

    /**
     * Get facturas by date range
     *
     * @return facturas collection
     */
    @Override
    public Collection<Factura> getFacturasByDate(Date fromDate, Date toDate) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     *
     * @param id
     * @return
     */
    @Override
    public Collection<Factura> getFacturasByCliente(int id) throws FacturasQueryException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Factura getFacturaById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * Update factura values
     *
     * @param factura factura to update (Same id, new values)
     * @return 0 error, 1 ok, 2 doesnt exists.
     */
    @Override
    public void updateFactura(Factura factura) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * Delete factura by id.
     *
     * @param id factura id
     * @return 0 error, 1 ok, 2 doesnt exists.
     */
    @Override
    public void deleteFactura(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private boolean isValid(Factura f) {

        if (f.getId() == null || f.getFecha() == null || f.getFechavenc() == null || f.getReparacion() == null
                || f.getPagada() == null || f.getTotal() == null || f.getCliente() == null) {
            return false;
        } else {
            return true;
        }
    }
}
