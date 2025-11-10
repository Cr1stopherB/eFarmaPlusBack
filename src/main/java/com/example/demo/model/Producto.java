package com.example.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Productos")
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "ID_CATEGORIA") // Nombres de atributos FK en mayusculas para unir tablas
    private Integer idCategoria; 

    @Column(name = "nombreProducto", length = 200, nullable = false)
    private String nombre;

    @Column(name = "descripcion", length = 255, nullable = false)
    private String descripcion;

    @Column(name = "precio", nullable = false)
    private Double precio;

    @Column(name = "stock", nullable = false)
    private Integer stock;

    @Column(name = "requiereReceta", nullable = false)
    private Boolean requiereReceta;

    @Column(name = "imagenUrl", nullable = false)
    private String imagenUrl;

    // Relación ManyToOne: FK a CATEGORIA
    // Muchos PRODUCTOS pertenecen a UNA CATEGORIA
    // @ManyToOne 
    // @JoinColumn(name = "ID_CATEGORIA", nullable = false) 
    // private Categoria categoria;
}
