package com.example.microservicetres.dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.*;

@Table(name = "entrega")
@Entity
public class EntregaEntity {
    @Id
    // @GeneratedValue(strategy = GenerationType.IDENTITY)
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column
    private Integer entrega_id ;
    @Column
    private Date fecha;
    @Column
    private double total;
    @Column
    private String propietario;
    @Column
    private Date fecha_entrega;
    @Column(name = "usuario_user_id")
    private Integer usuario_user_id;
    @OneToMany(mappedBy = "entrega", cascade = CascadeType.ALL)
    private List<MuebleHasEntregaEntity> items = new ArrayList<>();

    // @ManyToMany(fetch=FetchType.LAZY)
    // @JoinTable(
    // name="mueble_has_entrega",
    // joinColumns= {@JoinColumn(name="entrega_entrega_id")},
    // inverseJoinColumns = {@JoinColumn(name="mueble_mueble_id")}
    // )
    // private List<MuebleEntity> muebles;

    

    public EntregaEntity(Integer entrega_id, Date fecha, double total, String propietario, Date fecha_entrega,
            Integer usuario_user_id, List<MuebleHasEntregaEntity> items) {
        this.entrega_id = entrega_id;
        this.fecha = fecha;
        this.total = total;
        this.propietario = propietario;
        this.fecha_entrega = fecha_entrega;
        this.usuario_user_id = usuario_user_id;
        this.items = items;
    }
    

    public EntregaEntity(Date fecha, double total, String propietario, Date fecha_entrega, Integer usuario_user_id,
            List<MuebleHasEntregaEntity> items) {
        this.fecha = fecha;
        this.total = total;
        this.propietario = propietario;
        this.fecha_entrega = fecha_entrega;
        this.usuario_user_id = usuario_user_id;
        this.items = items;
    }


    public EntregaEntity() {

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
    public Integer getUsuario_user_id() {
        return usuario_user_id;
    }
    public void setUsuario_user_id(Integer usuario_user_id) {
        this.usuario_user_id = usuario_user_id;
    }
    
    public List<MuebleHasEntregaEntity> getItems() {
        return items;
    }


    public void setItems(List<MuebleHasEntregaEntity> items) {
        this.items = items;
    }


    @Override
    public String toString() {
        return "EntregaEntity [entrega_id=" + entrega_id + ", fecha=" + fecha + ", total=" + total + ", propietario="
                + propietario + ", fecha_entrega=" + fecha_entrega + ", usuario_user_id=" + usuario_user_id + ", items="
                + items + "]";
    }

    
    
}

