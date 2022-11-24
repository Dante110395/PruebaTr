package com.example.demo.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Productos;
import com.example.demo.entities.Role;
import com.example.demo.entities.Sucursales;
import com.example.demo.interfaces.ProductosRepository;
import com.example.demo.interfaces.RoleRepository;
import com.example.demo.interfaces.SucursalesRepository;

@Service
public class PruebaServices {

    Logger logger= LoggerFactory.getLogger(PruebaServices.class);

    @Autowired
	private RoleRepository roleRepository;

    @Autowired
	private SucursalesRepository sucursalesRepository;


    public String saveRole(){
        Role role = new Role(null, "pruebas");
        roleRepository.saveAndFlush(role);
        return "true";
    }

    public Boolean saveSucursal(){
        Sucursales suc = new Sucursales(null, "CDMX");
        sucursalesRepository.saveAndFlush(suc);
        return true;

    }
    
}
