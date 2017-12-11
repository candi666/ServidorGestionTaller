/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxserverside.ejb.cliente;

import java.util.List;
import javafxserverside.entity.Cliente;
import javafxserverside.exception.cliente.ClienteQueryException;
import javax.ejb.Local;

/**
 *
 * @author 2dam
 */
@Local
public interface ClienteBeanLocal {
    
    public List<Cliente> getAllClientes() throws ClienteQueryException;
    
    public List<Cliente> getClientesById(Integer id) throws ClienteQueryException;
    
    public List<Cliente> getClientesByDni(String dni) throws ClienteQueryException;
    
    public List<Cliente> getClientesByNombre(String nombre) throws ClienteQueryException;
    
    public void createClient(Cliente cliente);
    
    public void updateClient(Cliente cliente);
    
    public void deleteClient(Cliente cliente);
    
}
