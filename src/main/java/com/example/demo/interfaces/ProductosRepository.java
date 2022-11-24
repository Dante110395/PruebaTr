package com.example.demo.interfaces;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.Productos;

public interface ProductosRepository extends JpaRepository<Productos,Long>{

    public Productos findByScodigo(String clave);
    
}
