package com.salvachll.geinfor_exercise.controller;

import com.salvachll.geinfor_exercise.service.PaisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("paisController")
@RequestMapping("/api/pais")
public class PaisController {
    @Autowired
    @Qualifier("paisService")
    PaisService paisService;

    @GetMapping("/{id}")
    public ResponseEntity<String> show(
            @PathVariable("id") int id
    ) {
        return new ResponseEntity<>("HOLA " + id, HttpStatus.OK);
    }
}
