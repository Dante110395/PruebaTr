package com.example.demo.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ordenes", schema = "contasystem")
public class Ordenes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long kordenes;
    private Long ksucursal;
    private Date dfechareg;
    private Float ntotal;


    public Ordenes() {
        super();
    }

    public Ordenes(Long kordenes, Long ksucursal, Date dfechareg, Float ntotal) {
        this.kordenes = kordenes;
        this.ksucursal = ksucursal;
        this.dfechareg = dfechareg;
        this.ntotal = ntotal;
    }

    public Long getKordenes() {
        return this.kordenes;
    }

    public void setKordenes(Long kordenes) {
        this.kordenes = kordenes;
    }

    public Long getKsucursal() {
        return this.ksucursal;
    }

    public void setKsucursal(Long ksucursal) {
        this.ksucursal = ksucursal;
    }

    public Date getDfechareg() {
        return this.dfechareg;
    }

    public void setDfechareg(Date dfechareg) {
        this.dfechareg = dfechareg;
    }

    public Float getNtotal() {
        return this.ntotal;
    }

    public void setNtotal(Float ntotal) {
        this.ntotal = ntotal;
    }

    @Override
    public String toString() {
        return "{" +
            " kordenes='" + getKordenes() + "'" +
            ", ksucursal='" + getKsucursal() + "'" +
            ", dfechareg='" + getDfechareg() + "'" +
            ", ntotal='" + getNtotal() + "'" +
            "}";
    }


}
