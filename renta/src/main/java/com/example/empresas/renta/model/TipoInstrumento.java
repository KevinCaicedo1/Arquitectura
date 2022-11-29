package com.example.empresas.renta.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@Table(name = "TIPO_INSTRUMENTO")
public class TipoInstrumento implements Serializable {
    @EmbeddedId
    private TipoInstrumentoPK pk;
    @Column(name = "NOMBRE", nullable = false, length = 100)
    private String nombre;
    @Column(name = "TIPO_RENTA", nullable = false, length = 2)
    private String tipoRenta;
    @Column(name = "COD_CLASE_INSTRUMENTO", nullable = false, length = 15)
    private String codClaseInstrumento;
    @Column(name = "ESTADO", nullable = false, length = 3)
    private String estado;
    @Column(name = "FECHA_CREACION", nullable = false)
    private Date fechaCreacion;

    @ManyToOne
    @JoinColumns({
        @JoinColumn(name = "COD_EMPRESA", referencedColumnName = "COD_EMPRESA", insertable = false, updatable = false),
        @JoinColumn(name = "COD_CATEGORIA_INSTRUMENTO", referencedColumnName = "COD_CATEGORIA_INSTRUMENTO", insertable = false, updatable = false)
    })
    private CategoriaInstrumento categoriaInstrumento;

    public TipoInstrumento(TipoInstrumentoPK pk) {
        this.pk = pk;
    }

}

