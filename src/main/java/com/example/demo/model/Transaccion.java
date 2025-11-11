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
@Table(name = "Transaccion")
public class Transaccion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    // Muchas TRANSACCIONES pertenecen a UN PEDIDO
    @ManyToOne 
    @JoinColumn(name = "ID_PEDIDO", nullable = false) 
    private Pedido pedido; 

    @Column(name = "FechaTransaccion", nullable = false)
    private LocalDateTime fechaTransaccion; 
    
    @Column(name = "Monto", nullable = false)
    private Double monto; 
    
    @Column(name = "MetodoPago", length = 50)
    private String metodoPago; 
    
    @Column(name = "EstadoPago", length = 50, nullable = false)
    private String estadoPago;
}
