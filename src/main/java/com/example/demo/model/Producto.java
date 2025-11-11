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
@Table(name = "Producto")
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "ID_CATEGORIA")
    private Integer idCategoria; 

    @Column(name = "NOMBRE_PRODUCTO", length = 200, nullable = false)
    private String nombre;

    @Column(name = "DESCRIPCION", length = 255, nullable = false)
    private String descripcion;

    @Column(name = "PRECIO", nullable = false)
    private Double precio;

    @Column(name = "STOCK", nullable = false)
    private Integer stock;

    @Column(name = "REQUIERE_RECETA", nullable = false)
    private Boolean requiereReceta;

}
