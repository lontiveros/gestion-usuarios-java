package dev.leom.gestionusuarios.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsuarioController {

    @RequestMapping("index")
    public String index() {
        return "index Test";
    }
}
