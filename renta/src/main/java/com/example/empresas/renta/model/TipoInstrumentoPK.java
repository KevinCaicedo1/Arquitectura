package com.example.empresas.renta.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Embeddable
@NoArgsConstructor
public class TipoInstrumentoPK implements Serializable {
    @Column(name = "COD_EMPRESA", nullable = false)
    private Integer codEmpresa;
    @Column(name = "COD_TIPO_INSTRUMENTO", nullable = false, length = 15)
    private String codTipoInstrumento;
}

