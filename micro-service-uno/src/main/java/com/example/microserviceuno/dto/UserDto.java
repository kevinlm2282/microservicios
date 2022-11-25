package com.example.microserviceuno.dto;

public class UserDto {
    private Integer user_id;
private String nombre;   
private Integer telefono;
private String direccion;   
private String user;
private String password;
private boolean estado;

public UserDto(Integer user_id, String nombre, Integer telefono, String direccion, String user, String password,
        boolean estado) {
    this.user_id = user_id;
    this.nombre = nombre;
    this.telefono = telefono;
    this.direccion = direccion;
    this.user = user;
    this.password = password;
    this.estado = estado;
}

public Integer getUser_id() {
    return user_id;
}

public void setUser_id(Integer user_id) {
    this.user_id = user_id;
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

public String getUser() {
    return user;
}

public void setUser(String user) {
    this.user = user;
}

public String getPassword() {
    return password;
}

public void setPassword(String password) {
    this.password = password;
}

public boolean isEstado() {
    return estado;
}

public void setEstado(boolean estado) {
    this.estado = estado;
}


        
   
    
}
