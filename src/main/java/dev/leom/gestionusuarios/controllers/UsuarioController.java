package dev.leom.gestionusuarios.controllers;

import dev.leom.gestionusuarios.models.Usuario;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class UsuarioController {

    @RequestMapping("index")
    public String index() {
        return "index Test app!";
    }

    @GetMapping("/usuarios")
    public List<Usuario> getAll() {
        return List.of(Usuario.builder()
                .nombre("Luis")
                .apellido("Ontiveros")
                .email("luis@example.com")
                .telefono("123-4567-8901")
                .build(), Usuario.builder()
                .nombre("Luis")
                .apellido("Mendoza")
                .email("mendoza@example.com")
                .telefono("123-4567-8901")
                .build());
    }

    @GetMapping("/usuario/{id}")
    public Usuario get(@PathVariable long id) {
        return Usuario.builder()
                .nombre("Luis")
                .apellido("Ontiveros")
                .email("luis@example.com")
                .telefono("123-4567-8901")
                .build();
    }

    @PutMapping("/usuario")
    public Usuario update() {
        return Usuario.builder().build();
    }

    @DeleteMapping("/usuario")
    public void delete() {}
}
