package com.firstcrud.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table (name = "estado")
public class Estado {
    
    private int id;
    private String nombre;
    private Pais pais;
}
