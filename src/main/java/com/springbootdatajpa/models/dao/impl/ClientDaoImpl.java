package com.springbootdatajpa.models.dao.impl;

import com.springbootdatajpa.models.dao.IClientDao;
import com.springbootdatajpa.models.entity.Cliente;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class ClientDaoImpl implements IClientDao {


    @PersistenceContext
    private EntityManager em;

    @Transactional(readOnly = true)
    @Override
    public List<Cliente> findAll() {
        return em.createQuery("select c from Cliente c").getResultList();
    }
}
