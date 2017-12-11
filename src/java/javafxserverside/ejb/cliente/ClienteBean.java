/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxserverside.ejb.cliente;

import java.util.List;
import javafxserverside.entity.Cliente;
import javafxserverside.exception.cliente.ClienteQueryException;
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
    public List<Cliente> getAllClientes() throws ClienteQueryException{
        return em.createNamedQuery("findAllClientes").getResultList();
    }
    
    @Override
    public List<Cliente> getClientesById(Integer id) throws ClienteQueryException{
        return em.createNamedQuery("findClienteById").setParameter("id",id).getResultList();
    }

    @Override
    public List<Cliente> getClientesByDni(String dni) throws ClienteQueryException{
        return em.createNamedQuery("findClienteByDni").setParameter("id",dni).getResultList();
    }

    @Override
    public List<Cliente> getClientesByNombre(String nombre) throws ClienteQueryException{
        return em.createNamedQuery("findClienteByNombre").setParameter("id",nombre).getResultList();
    }

    @Override
    public void createClient(Cliente cliente) {
        
    }

    @Override
    public void updateClient(Cliente cliente) {
        
    }

    @Override
    public void deleteClient(Cliente cliente) {
        
    }
    
}
