package com.salvachll.geinfor_exercise.controller;

import com.salvachll.geinfor_exercise.service.ComunidadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("comunidadController")
@RequestMapping("/api/comunidad")
public class ComunidadController {
    @Autowired
    @Qualifier("comunidadService")
    ComunidadService comunidadService;
}
