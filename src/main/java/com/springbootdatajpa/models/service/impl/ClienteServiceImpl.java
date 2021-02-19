package com.springbootdatajpa.models.service.impl;

import com.springbootdatajpa.models.dao.IClientDao;
import com.springbootdatajpa.models.entity.Cliente;
import com.springbootdatajpa.models.service.IClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ClienteServiceImpl implements IClienteService {

    @Autowired

    private IClientDao clientDao;

    @Override
    @Transactional(readOnly = true)
    public List<Cliente> findAll() {
        return (List<Cliente>) clientDao.findAll();
    }

    @Override
    @Transactional
    public void save(Cliente cliente) {
        clientDao.save(cliente);
    }

    @Override
    @Transactional(readOnly = true)
    public Cliente findOne(long id) {
        return clientDao.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public void delete(long id) {
        clientDao.deleteById(id);
    }
}
