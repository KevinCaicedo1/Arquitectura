package com.example.empresas.renta.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.Data;
@Data
@Entity
@Table(name = "CATEGORIA_INSTRUMENTO")
public class CategoriaInstrumento implements Serializable {
    @EmbeddedId
    private CategoriaInstrumentoPK pk;
    @Column(name = "NOMBRE", nullable = false, length = 100)
    private String nombre;
    @Column(name = "TIPO_RENTA", nullable = false, length = 2)
    private String tipoRenta;

    @ManyToOne
    @JoinColumn(name = "COD_EMPRESA", referencedColumnName = "COD_EMPRESA", insertable = false, updatable = false)
    private Empresa empresa;

    public CategoriaInstrumento(CategoriaInstrumentoPK pk) {
        this.pk = pk;
    }


}

