package com.example.ciao.controller;

import org.springframework.web.bind.annotation.*;
import java.util.Map;

@RestController
@RequestMapping("/v2")

public class CiaoV2Controller {

    @GetMapping("/ciao/{provincia}")
   public Map<String, String> saluta(
           @PathVariable String provincia,
           @RequestParam String nome) {

        String saluto = "Ciao " + nome + ", com'è il tempo in " + provincia + "?";

        return Map.of(
                "nome", nome,
                "provincia", provincia,
                "saluto", saluto
        );
    }
}
