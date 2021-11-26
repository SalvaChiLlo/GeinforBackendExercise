package com.salvachll.geinfor_exercise.controller;

import com.salvachll.geinfor_exercise.models.ComunidadModel;
import com.salvachll.geinfor_exercise.service.ComunidadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController("comunidadController")
@RequestMapping("/api/comunidad")
public class ComunidadController {
    @Autowired
    @Qualifier("comunidadService")
    ComunidadService comunidadService;

    @GetMapping("")
    public ResponseEntity<List<ComunidadModel>> index() {
        return new ResponseEntity<>(comunidadService.index(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ComunidadModel> show(
            @PathVariable("id") int id
    ) {
        return new ResponseEntity<>(comunidadService.show(id), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Integer> delete(
            @PathVariable("id") int id
    ) {
        return new ResponseEntity<>(comunidadService.delete(id) + id, HttpStatus.OK);
    }

    @PostMapping("")
    public ResponseEntity<ComunidadModel> create(
            @RequestBody(required = true) ComunidadModel model
    ) {
        return new ResponseEntity<>(comunidadService.create(model), HttpStatus.OK);
    }

    @PutMapping("")
    public ResponseEntity<ComunidadModel> update(
            @RequestBody(required = true) ComunidadModel model
    ) {
        return new ResponseEntity<>(comunidadService.update(model), HttpStatus.OK);
    }
}
