package com.springbootdatajpa.controllers;

import com.springbootdatajpa.models.dao.IClientDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ClienteController {

    @Autowired
    private IClientDao clientDao;


    @RequestMapping(value = "listar", method = RequestMethod.GET)
    public String listar(Model model) {

        model.addAttribute("titulo", "Lista de clientes");
        model.addAttribute("Clientes", clientDao.findAll());
        return "listar";
    }

}
