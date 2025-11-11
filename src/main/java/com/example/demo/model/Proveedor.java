package com.example.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Proveedor")
public class Proveedor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "nombreProveedor", length = 255, nullable = false)
    private String nombre;

    @Column(name = "rut", length = 12, nullable = false, unique = true)
    private String rut;

    @Column(name = "contacto", length = 100, nullable = false)
    private String contacto;

    @Column(name = "telefono", length = 100, nullable = false)
    private String telefono;

    @Column(name = "email", length = 100, unique = true)
    private String email;

    @Column(name = "direccion", length = 255, nullable = false)
    private String direccion;
}
