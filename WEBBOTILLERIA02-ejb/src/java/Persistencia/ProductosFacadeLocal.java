/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia;

import Procesos.Productos;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Francisco
 */
@Local
public interface ProductosFacadeLocal {

    void create(Productos productos);

    void edit(Productos productos);

    void remove(Productos productos);

    Productos find(Object id);

    List<Productos> findAll();

    List<Productos> findRange(int[] range);

    int count();
    
    //List<Productos> buscarProductosSegunNombre(String nombre);
    
    List<Productos> buscarProductoSegunTipo(String tipo);
}
