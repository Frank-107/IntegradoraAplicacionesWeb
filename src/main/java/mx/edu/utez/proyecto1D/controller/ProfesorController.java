package mx.edu.utez.proyecto1D.controller;

import jakarta.validation.Valid;
import mx.edu.utez.proyecto1D.dto.RequestProfesorDTO;
import mx.edu.utez.proyecto1D.model.profesor.Profesor;
import mx.edu.utez.proyecto1D.service.ProfesorService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/profesores")
public class ProfesorController {

    private final ProfesorService profesorService;

    public ProfesorController(ProfesorService profesorService) {
        this.profesorService = profesorService;
    }

    @PostMapping
    public ResponseEntity<Profesor> addProfesor(@Valid @RequestBody RequestProfesorDTO payload) {
        return new ResponseEntity<>(profesorService.addProfesor(payload), HttpStatus.CREATED);
    }
}