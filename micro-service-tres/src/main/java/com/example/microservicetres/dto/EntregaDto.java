package com.example.microservicetres.dto;

import java.sql.Date;
import java.util.List;

public class EntregaDto {
    private Integer entrega_id;
    private Date fecha;
    private double total;
    private String propietario;
    private Date fecha_entrega;
    private Integer usuario_user_id;
    private List<MuebleHasEntregaDto> muebles;
    
    public EntregaDto(Integer entrega_id, Date fecha, double total, String propietario, Date fecha_entrega,Integer usuario_user_id,
            List<MuebleHasEntregaDto> muebles) {
        this.entrega_id = entrega_id;
        this.fecha = fecha;
        this.total = total;
        this.propietario = propietario;
        this.fecha_entrega = fecha_entrega;
        this.usuario_user_id = usuario_user_id;
        this.muebles = muebles;
    }
    

    public EntregaDto(Date fecha, double total, String propietario, Date fecha_entrega, Integer usuario_user_id,
            List<MuebleHasEntregaDto> muebles) {
        this.fecha = fecha;
        this.total = total;
        this.propietario = propietario;
        this.fecha_entrega = fecha_entrega;
        this.usuario_user_id = usuario_user_id;
        this.muebles = muebles;
    }
    


    public EntregaDto() {
    }


    public Integer getUsuario_user_id() {
        return usuario_user_id;
    }

    public void setUsuario_user_id(Integer usuario_user_id) {
        this.usuario_user_id = usuario_user_id;
    }

    public Integer getEntrega_id() {
        return entrega_id;
    }

    public void setEntrega_id(Integer entrega_id) {
        this.entrega_id = entrega_id;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public String getPropietario() {
        return propietario;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    public Date getFecha_entrega() {
        return fecha_entrega;
    }

    public void setFecha_entrega(Date fecha_entrega) {
        this.fecha_entrega = fecha_entrega;
    }

    public List<MuebleHasEntregaDto> getMuebles() {
        return muebles;
    }

    public void setMuebles(List<MuebleHasEntregaDto> muebles) {
        this.muebles = muebles;
    }

    @Override
    public String toString() {
        return "EntregaDto{" +
                "entrega_id=" + entrega_id +
                ", fecha=" + fecha +
                ", total=" + total +
                ", propietario='" + propietario + '\'' +
                ", fecha_entrega=" + fecha_entrega +
                ", usuario_user_id=" + usuario_user_id +
                ", muebles=" + muebles +
                '}';
    }

}
