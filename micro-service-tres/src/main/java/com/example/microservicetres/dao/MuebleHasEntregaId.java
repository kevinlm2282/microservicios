package com.example.microservicetres.dao;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class MuebleHasEntregaId implements Serializable{
    @Column(name = "entrega_entrega_id")
    private Integer entregaId;
    @Column(name = "mueble_mueble_id")
    private Integer muebleId;
    
    public MuebleHasEntregaId() {
    }

    public Integer getEntregaId() {
        return entregaId;
    }

    public void setEntregaId(Integer entregaId) {
        this.entregaId = entregaId;
    }

    public Integer getMuebleId() {
        return muebleId;
    }

    public void setMuebleId(Integer muebleId) {
        this.muebleId = muebleId;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((entregaId == null) ? 0 : entregaId.hashCode());
        result = prime * result + ((muebleId == null) ? 0 : muebleId.hashCode());
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
        MuebleHasEntregaId other = (MuebleHasEntregaId) obj;
        if (entregaId == null) {
            if (other.entregaId != null)
                return false;
        } else if (!entregaId.equals(other.entregaId))
            return false;
        if (muebleId == null) {
            if (other.muebleId != null)
                return false;
        } else if (!muebleId.equals(other.muebleId))
            return false;
        return true;
    }
    
    
    
}
