package com.example.microservicetres.dao;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity(name = "mueble_has_entrega")
@Table(name = "mueble_has_entrega")
public class MuebleHasEntregaEntity {
    @EmbeddedId
    private MuebleHasEntregaId muebleHasEntregaId = new MuebleHasEntregaId();
    @ManyToOne(optional = false)
    @MapsId("muebleId")
    @JoinColumn(name = "mueble_mueble_id",insertable = false,updatable = false)
    private MuebleEntity mueble;
    @ManyToOne(optional = false)
    @MapsId("entregaId")
    @JoinColumn(name = "entrega_entrega_id",insertable = false,updatable = false)
    @JsonIgnore
    private EntregaEntity entrega;
    @Column(name = "cantidad")
    private Integer cantidad;

    public MuebleHasEntregaEntity(MuebleHasEntregaId muebleHasEntregaId, MuebleEntity mueble, EntregaEntity entrega,
            Integer cantidad) {
        this.muebleHasEntregaId = muebleHasEntregaId;
        this.mueble = mueble;
        this.entrega = entrega;
        this.cantidad = cantidad;
    }

    

    public MuebleHasEntregaEntity() {
    }



    public MuebleHasEntregaId getMuebleHasEntregaId() {
        return muebleHasEntregaId;
    }

    public void setMuebleHasEntregaId(MuebleHasEntregaId muebleHasEntregaId) {
        this.muebleHasEntregaId = muebleHasEntregaId;
    }

    public MuebleEntity getMueble() {
        return mueble;
    }

    public void setMueble(MuebleEntity mueble) {
        this.mueble = mueble;
    }

    public EntregaEntity getEntrega() {
        return entrega;
    }

    public void setEntrega(EntregaEntity entrega) {
        this.entrega = entrega;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "MuebleHasEntregaEntity [muebleHasEntregaId=" + muebleHasEntregaId + ", mueble=" + mueble +", cantidad=" + cantidad + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((muebleHasEntregaId == null) ? 0 : muebleHasEntregaId.hashCode());
        result = prime * result + ((mueble == null) ? 0 : mueble.hashCode());
        result = prime * result + ((entrega == null) ? 0 : entrega.hashCode());
        result = prime * result + ((cantidad == null) ? 0 : cantidad.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        MuebleHasEntregaEntity other = (MuebleHasEntregaEntity) obj;
        if (muebleHasEntregaId == null) {
            if (other.muebleHasEntregaId != null)
                return false;
        } else if (!muebleHasEntregaId.equals(other.muebleHasEntregaId))
            return false;
        if (mueble == null) {
            if (other.mueble != null)
                return false;
        } else if (!mueble.equals(other.mueble))
            return false;
        if (entrega == null) {
            if (other.entrega != null)
                return false;
        } else if (!entrega.equals(other.entrega))
            return false;
        if (cantidad == null) {
            if (other.cantidad != null)
                return false;
        } else if (!cantidad.equals(other.cantidad))
            return false;
        return true;
    }

    

    
    
}
