package com.firstcrud.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "personas", schema = "spring-boot")
public class Persona {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String apellido;
    private int edad;

    //@ManyToOne
    //@JoinColumn(name = "pais-id")
    // private Pais pais;
    private int pais;
    //@ManyToOne
    //@JoinColumn(name = "estado-id")
    // private Estado estado;
    private int estado;

    public Persona() {

    }

    public Persona(String nombre, String apellido, int edad, int pais, int estado) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.pais = pais;
        this.estado = estado;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    // public Pais getPais() {
    // return pais;
    // }
    public int getPais() {
        return pais;
    }

    // public void setPais(Pais pais) {
    // this.pais = pais;
    // }
    public void setPais(int pais) {
        this.pais = pais;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    

    // public Estado getEstado() {
    // return estado;
    // }
    // public int getEstado(int estado) {
    //     return estado;
    // }

    // public void setEstado(Estado estado) {
    // this.estado = estado;
    // }
    // public void setEstado(int estado) {
    //     this.estado = estado;
    // }

}
