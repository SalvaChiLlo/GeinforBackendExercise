package com.salvachll.geinfor_exercise.controller;

import com.salvachll.geinfor_exercise.models.PaisModel;
import com.salvachll.geinfor_exercise.service.PaisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController("paisController")
@RequestMapping("/api/pais")
public class PaisController {
    @Autowired
    @Qualifier("paisService")
    PaisService paisService;

    @GetMapping("")
    public ResponseEntity<List<PaisModel>> index() {
        return new ResponseEntity<>(paisService.index(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<PaisModel> show(
            @PathVariable("id") int id
    ) {
        return new ResponseEntity<>(paisService.show(id), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Integer> delete(
            @PathVariable("id") int id
    ) {
        return new ResponseEntity<>(paisService.delete(id) + id, HttpStatus.OK);
    }

    @PostMapping("")
    public ResponseEntity<PaisModel> create(
            @RequestBody(required = true) PaisModel model
    ) {
        return new ResponseEntity<>(paisService.create(model), HttpStatus.OK);
    }

    @PutMapping("")
    public ResponseEntity<PaisModel> update(
            @RequestBody(required = true) PaisModel model
    ) {
        return new ResponseEntity<>(paisService.update(model), HttpStatus.OK);
    }
}
