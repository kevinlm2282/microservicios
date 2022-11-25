package com.example.microservicetres.dto;

public class MuebleDto {
    private Integer mueble_id;
    private String nombre;
    private String color;
    private Integer cantidad;
    private Boolean estado;
    private Integer categoria_categoria_id;

    public MuebleDto(Integer mueble_id, String nombre, String color, Integer cantidad, Boolean estado,
            Integer categoria_categoria_id) {
        this.mueble_id = mueble_id;
        this.nombre = nombre;
        this.color = color;
        this.cantidad = cantidad;
        this.estado = estado;
        this.categoria_categoria_id = categoria_categoria_id;
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
        return "Mueble [mueble_id=" + mueble_id + ", nombre=" + nombre + ", color=" + color + ", cantidad=" + cantidad
                + ", estado=" + estado + ", categoria_categoria_id=" + categoria_categoria_id + "]";
    }

    
    
    
}
