package com.example.demo.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "productos", schema = "contasystem")
public class Productos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long kproducto;
    private Long kordenes;
    private String scodigo;
    private String sdescripcion;
    private Float nprecio;


    public Productos() {
        super();
    }

    public Productos(Long kproducto, Long kordenes, String scodigo, String sdescripcion, Float nprecio) {
        this.kproducto = kproducto;
        this.kordenes = kordenes;
        this.scodigo = scodigo;
        this.sdescripcion = sdescripcion;
        this.nprecio = nprecio;
    }

    public Long getKproducto() {
        return this.kproducto;
    }

    public void setKproducto(Long kproducto) {
        this.kproducto = kproducto;
    }

    public Long getKordenes() {
        return this.kordenes;
    }

    public void setKordenes(Long kordenes) {
        this.kordenes = kordenes;
    }

    public String getScodigo() {
        return this.scodigo;
    }

    public void setScodigo(String scodigo) {
        this.scodigo = scodigo;
    }

    public String getSdescripcion() {
        return this.sdescripcion;
    }

    public void setSdescripcion(String sdescripcion) {
        this.sdescripcion = sdescripcion;
    }

    public Float getNprecio() {
        return this.nprecio;
    }

    public void setNprecio(Float nprecio) {
        this.nprecio = nprecio;
    }

    @Override
    public String toString() {
        return "{" +
            " kproducto='" + getKproducto() + "'" +
            ", kordenes='" + getKordenes() + "'" +
            ", scodigo='" + getScodigo() + "'" +
            ", sdescripcion='" + getSdescripcion() + "'" +
            ", nprecio='" + getNprecio() + "'" +
            "}";
    }


    
}
