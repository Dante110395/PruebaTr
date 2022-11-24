package com.example.demo.services;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Productos;
import com.example.demo.interfaces.ProductosRepository;

@Service
public class ProductosServices {

    Logger logger = LoggerFactory.getLogger(ProductosServices.class);

    @Autowired
    private ProductosRepository productosRepository;


    public Boolean updatePrecio(String claveProducto,Float precio){
        Productos prod = productosRepository.findByScodigo(claveProducto);
        if(prod == null){
            return false;
        }else{
            prod.setNprecio(precio);
            productosRepository.saveAndFlush(prod);
        }
        return true;
    }
    
}
