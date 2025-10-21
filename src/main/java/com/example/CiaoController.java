package com.example.ciao.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CiaoController {

    @GetMapping("/v1/ciao")
    public String ciao(@RequestParam String nome,
                       @RequestParam String provincia) {
        return String.format("Ciao %s, com'è il tempo in %s?", nome, provincia);
    }
}