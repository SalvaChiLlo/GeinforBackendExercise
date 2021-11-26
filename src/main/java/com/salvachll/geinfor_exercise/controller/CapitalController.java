package com.salvachll.geinfor_exercise.controller;

import com.salvachll.geinfor_exercise.service.CapitalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("capitalController")
@RequestMapping("/api/capital")
public class CapitalController {
    @Autowired
    @Qualifier("capitalService")
    CapitalService capitalService;
}
