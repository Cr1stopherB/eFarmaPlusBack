package com.example.demo.model;

import java.math.BigDecimal;
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
@Table(name = "Pedido")
public class Pedido {
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
    private EstadoPedido estado; 

    // Atributos de la tabla
    
    @Column(name = "FECHA_CREACION", nullable = false)
    private LocalDateTime fechaCreacion; 

    @Column(name = "Total", nullable = false)
    private Double total; 

    @Column(name = "DIRECCION_ENVIO", length = 255)
    private String direccionEnvio;

}
