package com.example.empresas.renta.controller;

import com.example.empresas.renta.model.Empresa;
import com.example.empresas.renta.service.EmpresaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/empresa")
public class EmpresaController {

    @Autowired
    private EmpresaService empresaService;

    @GetMapping
    public ResponseEntity<List<Empresa>> findAll() {
        return ResponseEntity.ok(empresaService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Empresa> findById(@PathVariable Integer id) {
        return ResponseEntity.ok(empresaService.findById(id));
    }

    @GetMapping("/nombre/{nombre}")
    public ResponseEntity<List<Empresa>> findByNombre(@PathVariable String nombre) {
        return ResponseEntity.ok(empresaService.findByNombre(nombre));
    }

    @GetMapping("/codEmpresa/{codEmpresa}")
    public ResponseEntity<List<Empresa>> findByCodEmpresa(@PathVariable Integer codEmpresa) {
        return ResponseEntity.ok(empresaService.findByCodEmpresa(codEmpresa));
    }

}

