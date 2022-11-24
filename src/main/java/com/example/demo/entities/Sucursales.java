package com.example.demo.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "sucursales",schema = "contasystem")
public class Sucursales {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ksucursal;
    private String snombre;

    public Sucursales() {
        super();
    }

    public Sucursales(Long ksucursal, String snombre) {
        this.ksucursal = ksucursal;
        this.snombre = snombre;
    }

    public Long getKsucursal() {
        return this.ksucursal;
    }

    public void setKsucursal(Long ksucursal) {
        this.ksucursal = ksucursal;
    }

    public String getSnombre() {
        return this.snombre;
    }

    public void setSnombre(String snombre) {
        this.snombre = snombre;
    }

    @Override
    public String toString() {
        return "{" +
            " ksucursal='" + getKsucursal() + "'" +
            ", snombre='" + getSnombre() + "'" +
            "}";
    }

    
}
