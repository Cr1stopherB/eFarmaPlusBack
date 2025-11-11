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

// Marca = razon social (nombre labo)

/*
 **
 * Cambiaso Hnos. S.A.C
 * Knop Laboratorios S.A.
 * Instituto Bioquímico Beta S.A.
 * Itf- Labomed Farmacéutica Ltda.
 * Instituto Sanitas S.A.
 * Laboratorio Bagó De Chile S.A.
 * 
 * SELECCIONADOS PARA PRUEBAS
 * 
 * Laboratorio Biosano S.A.
 * Laboratorio Chile S.A.  
 * Laboratorio Maver S.A.  
 * Laboratorio Pasteur S.A. 
 * Laboratorio Sanderson S.A. 
 * Laboratorio Valma Spa.
 * 
 * 
 * Laboratorios Andrómaco S.A.  
 * Laboratorios Garden House Farmacéutica S.A.                                                                                                                                                                                    
 * Laboratorios Prater S.A. 
 * Laboratorios Recalcine S.A.
 * Laboratorios Saval S.A. 
 * Mintlab Co. S.A.
 * Laura Ximena Polanco González
 * Synthon Chile Ltda.
 * Positron Pharma S.A.
 * Eurofarma Chile Spa. (Ex.Prod.Fcéuticos Medipharm Spa.)
 * Difem Laboratorios S.A.
 * Comisión Chilena De Energía Nuclear Cchen
 * Ecolab Spa
 * Cgm Nuclear S.A.
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Laboratorio")
public class Laboratorio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id; // ID_LABORATORIO PK

    @Column(name = "NOMBRE", length = 150, nullable = false)
    private String nombre;
}
