package com.springbootdatajpa.models.dao;

import com.springbootdatajpa.models.entity.Cliente;

import java.util.List;

public interface IClientDao {

    public List<Cliente> findAll();

}
