package com.example.empresas.renta.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;


@Data
@Entity
@Table(name = "EMPRESA")
public class Empresa implements Serializable {


    @Id
    @Column(name = "COD_EMPRESA", nullable = false, unique = true)
    private Integer codEmpresa;

    @Column(name = "NOMBRE", nullable = false, length = 150)
    private String nombre;

    @Column(name = "COD_LOGOTIPO_EMPRESA", nullable = false, length = 8)
    private Integer codLogotipoEmpresa;

    @Column(name = "COD_LOGOTIPO_REPORTE", nullable = false, length = 8)
    private Integer codLogotipoReporte;

    @Column(name = "RAZON_SOCIAL", nullable = false, length = 250)
    private String razonSocial;

}

