/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia;

import Procesos.Detalles;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Francisco
 */
@Stateless
public class DetallesFacade extends AbstractFacade<Detalles> implements DetallesFacadeLocal {

    @PersistenceContext(unitName = "WEBBOTILLERIA02-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public DetallesFacade() {
        super(Detalles.class);
    }
    
}
