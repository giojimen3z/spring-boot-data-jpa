package com.springbootdatajpa.models.dao;

import com.springbootdatajpa.models.entity.Cliente;
import org.springframework.data.repository.CrudRepository;



public interface IClientDao extends CrudRepository<Cliente, Long> {

}
