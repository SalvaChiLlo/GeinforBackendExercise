package com.salvachll.geinfor_exercise.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/say")
public class HelloWorldController {

    @GetMapping(value = "/hello-world", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> helloWorld() {
        return new ResponseEntity<String>("[{\"message\":\"Hello World\"}]", HttpStatus.OK);
    }

}
