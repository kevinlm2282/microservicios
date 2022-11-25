package com.example.microservicedos.dao;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "mueble")
@Entity
public class MuebleEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Integer mueble_id;
    @Column
    private String nombre;
    @Column
    private String color;
    @Column
    private Integer cantidad;
    @Column
    private Boolean estado;
    @Column
    private Integer categoria_categoria_id;
    
    public MuebleEntity(Integer mueble_id, String nombre, String color, Integer cantidad, Boolean estado,
            Integer categoria_categoria_id) {
        this.mueble_id = mueble_id;
        this.nombre = nombre;
        this.color = color;
        this.cantidad = cantidad;
        this.estado = estado;
        this.categoria_categoria_id = categoria_categoria_id;
    }

    public MuebleEntity(String nombre, String color, Integer cantidad, Boolean estado, Integer categoria_categoria_id) {
        this.nombre = nombre;
        this.color = color;
        this.cantidad = cantidad;
        this.estado = estado;
        this.categoria_categoria_id = categoria_categoria_id;
    }

    public MuebleEntity() {
    }

    public Integer getMueble_id() {
        return mueble_id;
    }

    public void setMueble_id(Integer mueble_id) {
        this.mueble_id = mueble_id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    public Integer getCategoria_categoria_id() {
        return categoria_categoria_id;
    }

    public void setCategoria_categoria_id(Integer categoria_categoria_id) {
        this.categoria_categoria_id = categoria_categoria_id;
    }

    @Override
    public String toString() {
        return "MuebleEntity [mueble_id=" + mueble_id + ", nombre=" + nombre + ", color=" + color + ", cantidad="
                + cantidad + ", estado=" + estado + ", categoria_categoria_id=" + categoria_categoria_id + "]";
    }
    
    
    
}
