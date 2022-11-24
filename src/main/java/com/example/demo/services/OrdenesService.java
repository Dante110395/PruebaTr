package com.example.demo.services;

import java.util.Date;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Ordenes;
import com.example.demo.entities.Productos;
import com.example.demo.entities.Sucursales;
import com.example.demo.interfaces.OrdenesRepository;
import com.example.demo.interfaces.ProductosRepository;
import com.example.demo.interfaces.SucursalesRepository;
import com.example.demo.objects.SaveOrden;

@Service
public class OrdenesService {

    Logger logger = LoggerFactory.getLogger(OrdenesService.class);

    @Autowired
    private SucursalesRepository sucursalesRepository;

    @Autowired
    private ProductosRepository productosRepository;

    @Autowired
    private OrdenesRepository ordenesRepository;

    public Boolean saveOrdenes(SaveOrden saved) {
        Ordenes orden = new Ordenes();
        orden.setDfechareg(new Date());
        orden.setNtotal(saved.getTotal());
        Sucursales sucID = sucursalesRepository.findBySnombre(saved.getSucursal());
        orden.setKsucursal(sucID.getKsucursal());
        Ordenes ord = ordenesRepository.saveAndFlush(orden);
        Productos prod = new Productos();
        prod.setKordenes(ord.getKordenes());
        prod.setScodigo(saved.getClaveProducto().toString());
        prod.setNprecio(saved.getPrecio());
        prod.setSdescripcion(saved.getNombreProducto());
        productosRepository.saveAndFlush(prod);
        return true;
    }


    public Ordenes getOrdenes (Long ordenId){
        Optional <Ordenes> orden= ordenesRepository.findById(ordenId);
        if(orden.isPresent()){
            return orden.get();
        }else{
            return null;
        }
        
    }

}
