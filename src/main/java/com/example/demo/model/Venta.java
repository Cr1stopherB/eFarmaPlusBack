package com.example.demo.model;

import java.time.LocalDateTime;

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
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Venta")
public class Venta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id; // ID_PEDIDO INT

    // ID_USUARIO INT fk a USUARIO
    @ManyToOne 
    @JoinColumn(name = "ID_USUARIO", nullable = false) 
    private Usuario usuario; 

    // ID_ESTADO INT fk ESTADO_PEDIDO
    @ManyToOne 
    @JoinColumn(name = "ID_ESTADO", nullable = false)
    private Estado estado; 
    
    @Column(name = "FECHA_CREACION", nullable = false)
    private LocalDateTime fechaCreacion; 

    @Column(name = "TOTAL", nullable = false)
    private Double total; 

    @Column(name = "DIRECCION_ENVIO", length = 255)
    private String direccionEnvio;

}
