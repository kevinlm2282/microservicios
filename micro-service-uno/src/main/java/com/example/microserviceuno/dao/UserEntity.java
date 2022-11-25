package com.example.microserviceuno.dao;

import javax.persistence.*;

@Table(name = "usuario")
@Entity
 public class UserEntity {

 @Id
//  @GeneratedValue(strategy=GenerationType.IDENTITY)
 @GeneratedValue(strategy=GenerationType.SEQUENCE)
 @Column(name = "user_id")
 private Integer id;
 @Column(name = "nombre")
 private String nombre;
 @Column(name = "telefono")
 private Integer telefono;
 @Column(name = "direccion")
 private String direccion;
 @Column(name = "username")
 private String username;
 @Column(name = "password_usuario")
 private String password;
 @Column(name = "estado")
 private boolean enabled;

 public Integer getId() {
 return id;
 }
 public void setId(Integer id) {
 this.id = id;
 }
 public String getUsername() {
 return username;
 }
 public void setUsername(String username) {
 this.username = username;
 }
 public String getPassword() {
 return password;
 }
 public void setPassword(String password) {
 this.password = password;
 }
 public boolean isEnabled() {
 return enabled;
 }
 public void setEnabled(boolean enabled) {
 this.enabled = enabled;
 }

public String getNombre() {
    return nombre;
}
public void setNombre(String nombre) {
    this.nombre = nombre;
}
public Integer getTelefono() {
    return telefono;
}
public void setTelefono(Integer telefono) {
    this.telefono = telefono;
}
public String getDireccion() {
    return direccion;
}
public void setDireccion(String direccion) {
    this.direccion = direccion;
}
 }
