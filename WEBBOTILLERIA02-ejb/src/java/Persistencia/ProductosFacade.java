/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia;

import Procesos.Productos;
import java.util.List;
//import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
//import javax.persistence.Query;

/**
 *
 * @author Francisco
 */
@Stateless
public class ProductosFacade extends AbstractFacade<Productos> implements ProductosFacadeLocal {

    @PersistenceContext(unitName = "WEBBOTILLERIA02-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }
     public List<Productos>buscarProductoSegunTipo(String tipo){
        Query q;
        q=getEntityManager().createQuery("select p from Productos p where p.tipo=:"+tipo);
        List<Productos>listaProducto=q.getResultList();
        return listaProducto;
        
    }

    public ProductosFacade() {
        super(Productos.class);
    }
}

   
    

