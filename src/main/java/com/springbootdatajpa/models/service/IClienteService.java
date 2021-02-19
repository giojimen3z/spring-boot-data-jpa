package com.springbootdatajpa.models.service;

import com.springbootdatajpa.models.entity.Cliente;

import java.util.List;

public interface IClienteService {

    public List<Cliente> findAll();

    public void save(Cliente cliente);

    public Cliente findOne(long id);

    public void delete(long id);

}
