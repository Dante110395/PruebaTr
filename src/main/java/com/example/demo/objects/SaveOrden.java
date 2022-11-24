package com.example.demo.objects;

public class SaveOrden {

    private Long claveProducto;
    private String nombreProducto;
    private Float precio;
    private String Sucursal;
    private Float total;

    public SaveOrden() {
        super();
    }


    public SaveOrden(Long claveProducto, String nombreProducto, Float precio, String Sucursal, Float total) {
        this.claveProducto = claveProducto;
        this.nombreProducto = nombreProducto;
        this.precio = precio;
        this.Sucursal = Sucursal;
        this.total = total;
    }


    public Long getClaveProducto() {
        return this.claveProducto;
    }

    public void setClaveProducto(Long claveProducto) {
        this.claveProducto = claveProducto;
    }

    public String getNombreProducto() {
        return this.nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public Float getPrecio() {
        return this.precio;
    }

    public void setPrecio(Float precio) {
        this.precio = precio;
    }

    public String getSucursal() {
        return this.Sucursal;
    }

    public void setSucursal(String Sucursal) {
        this.Sucursal = Sucursal;
    }


    public Float getTotal() {
        return this.total;
    }

    public void setTotal(Float total) {
        this.total = total;
    }



    @Override
    public String toString() {
        return "{" +
            " claveProducto='" + getClaveProducto() + "'" +
            ", nombreProducto='" + getNombreProducto() + "'" +
            ", precio='" + getPrecio() + "'" +
            ", Sucursal='" + getSucursal() + "'" +
            ", total='" + getTotal() + "'" +
            "}";
    }


}
