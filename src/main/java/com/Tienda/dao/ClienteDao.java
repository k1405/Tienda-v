
package com.Tienda.dao;

import org.springframework.data.repository.CrudRepository;
import com.Tienda.domain.Cliente;

public interface ClienteDao extends CrudRepository<Cliente,Long> {
    
    
    
}
