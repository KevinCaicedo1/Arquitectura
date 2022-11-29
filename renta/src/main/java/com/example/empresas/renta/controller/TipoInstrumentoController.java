package com.example.empresas.renta.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.empresas.renta.model.TipoInstrumento;
import com.example.empresas.renta.repository.TipoInstrumentoRepository;

@RestController
@RequestMapping("/api/tipoInstrumento")

public class TipoInstrumentoController {

    @Autowired
    private TipoInstrumentoRepository tipoInstrumentoRepository;

    @GetMapping("/all")
    public List<TipoInstrumento> findAll() {
        return tipoInstrumentoRepository.findAll();
    }

    @GetMapping("/codEmpresa/{codEmpresa}")
    public List<TipoInstrumento> findByPkCodEmpresa(Integer codEmpresa) {
        return tipoInstrumentoRepository.findByPkCodEmpresa(codEmpresa);
    }

    @GetMapping("/codTipoInstrumento/{codTipoInstrumento}")
    public List<TipoInstrumento> findByPkCodTipoInstrumento(String codTipoInstrumento) {
        return tipoInstrumentoRepository.findByPkCodTipoInstrumento(codTipoInstrumento);
    }

    


}
