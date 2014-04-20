/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mobile.manager;

import com.mycompany.mobile.entity.Property;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author maq
 */
@Stateless
public class PropertyFacade extends AbstractFacade<Property> {

    @PersistenceContext(unitName = "com.mycompany_Mobile_war_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public PropertyFacade() {
        super(Property.class);
    }

    public Property findByKey(final String key) {
        Query q = em.createNamedQuery("Property.findByKey", Property.class);
        System.out.println("" + q);
        q.setParameter(1, key);
        return (Property) q.getSingleResult();
    }

//    public void insert(final String id, final String string) {
//        em.getTransaction().begin();
//
//    }

}
