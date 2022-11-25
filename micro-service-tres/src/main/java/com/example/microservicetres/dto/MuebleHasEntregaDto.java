package com.example.microservicetres.dto;

public class MuebleHasEntregaDto {
    MuebleDto muebleDto;
    Integer cantidad;

    public MuebleHasEntregaDto() {
    }

    public MuebleDto getMuebleDto() {
        return muebleDto;
    }

    public void setMuebleDto(MuebleDto muebleDto) {
        this.muebleDto = muebleDto;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "MuebleHasEntregaDto [muebleDto=" + muebleDto + ", cantidad=" + cantidad + "]";
    }

    
    
}
