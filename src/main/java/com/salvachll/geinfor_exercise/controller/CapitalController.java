package com.salvachll.geinfor_exercise.controller;

import com.salvachll.geinfor_exercise.models.CapitalModel;
import com.salvachll.geinfor_exercise.service.CapitalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController("capitalController")
@RequestMapping("/api/capital")
public class CapitalController {
    @Autowired
    @Qualifier("capitalService")
    CapitalService capitalService;

    @GetMapping("")
    public ResponseEntity<List<CapitalModel>> index() {
        return new ResponseEntity<>(capitalService.index(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<CapitalModel> show(
            @PathVariable("id") int id
    ) {
        return new ResponseEntity<>(capitalService.show(id), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Integer> delete(
            @PathVariable("id") int id
    ) {
        return new ResponseEntity<>(capitalService.delete(id) + id, HttpStatus.OK);
    }

    @PostMapping("")
    public ResponseEntity<CapitalModel> create(
            @RequestBody(required = true) CapitalModel model
    ) {
        return new ResponseEntity<>(capitalService.create(model), HttpStatus.OK);
    }

    @PutMapping("")
    public ResponseEntity<CapitalModel> update(
            @RequestBody(required = true) CapitalModel model
    ) {
        return new ResponseEntity<>(capitalService.update(model), HttpStatus.OK);
    }
}
