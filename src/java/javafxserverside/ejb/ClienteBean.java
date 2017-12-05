/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxserverside.ejb;

import java.util.List;
import javafxserverside.entity.Cliente;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author 2dam
 */
@Stateless
public class ClienteBean implements ClienteBeanLocal {
    @PersistenceContext
    private EntityManager em;

    @Override
    public List<Cliente> getAllClientes() {
        return em.createNamedQuery("findAllClientes").getResultList();
    }
    
    @Override
    public List<Cliente> getClientesById() {
        return em.createNamedQuery("findClienteById").getResultList();
    }

    @Override
    public List<Cliente> getClientesByDni() {
        return em.createNamedQuery("findClienteByDni").getResultList();
    }

    @Override
    public List<Cliente> getClientesByNombre() {
        return em.createNamedQuery("findClienteByNombre").getResultList();
    }
    
}
