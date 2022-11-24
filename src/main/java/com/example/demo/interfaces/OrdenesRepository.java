package com.example.demo.interfaces;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.Ordenes;

public interface OrdenesRepository extends JpaRepository<Ordenes,Long>{
    
}
