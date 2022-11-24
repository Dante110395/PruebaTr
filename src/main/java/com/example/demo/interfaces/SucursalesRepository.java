package com.example.demo.interfaces;

import org.hibernate.metamodel.model.convert.spi.JpaAttributeConverter;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.Sucursales;

public interface SucursalesRepository extends JpaRepository<Sucursales,Long>{

    public Sucursales findBySnombre(String nombre);
    
}
