/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxserverside.ejb;

import java.util.List;
import javafxserverside.entity.Cliente;
import javax.ejb.Local;

/**
 *
 * @author 2dam
 */
@Local
public interface ClienteBeanLocal {
    
    public List<Cliente> getAllClientes();
    
    public List<Cliente> getClientesById();
    
    public List<Cliente> getClientesByDni();
    
    public List<Cliente> getClientesByNombre();
    
}
