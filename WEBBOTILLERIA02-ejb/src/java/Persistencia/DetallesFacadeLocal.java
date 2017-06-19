/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia;

import Procesos.Detalles;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Francisco
 */
@Local
public interface DetallesFacadeLocal {

    void create(Detalles detalles);

    void edit(Detalles detalles);

    void remove(Detalles detalles);

    Detalles find(Object id);

    List<Detalles> findAll();

    List<Detalles> findRange(int[] range);

    int count();
    
}
