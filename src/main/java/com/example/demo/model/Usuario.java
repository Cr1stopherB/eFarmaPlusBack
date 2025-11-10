package com.example.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "usuarios")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    // Relación ManyToOne con ROL (ID_ROL FK)
    @ManyToOne
    @JoinColumn(name = "ID_ROL", nullable = false) 
    private Rol rol;
    
    // Atributos de la tabla
    @Column(name = "nombreRol", length = 50, nullable = false)
    private String nombre;
    @Column(name = "Rut", length = 15)
    private String rut;
    
    @Column(name = "Contacto", length = 255)
    private String contacto;
    
    @Column(name = "Direccion", length = 255)
    private String direccion;

    @Column(name = "Email", unique = true, nullable = false, length = 255)
    private String email;

    @Column(name = "Contrasena", nullable = false, length = 255)
    private String contrasenaHash;

    @Column(name = "Telefono", length = 20)
    private String telefono;
}
