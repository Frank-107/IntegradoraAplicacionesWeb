package mx.edu.utez.proyecto1D.controller;

import jakarta.validation.Valid;
import mx.edu.utez.proyecto1D.dto.RequestMateriaDTO;
import mx.edu.utez.proyecto1D.model.materia.Materia;
import mx.edu.utez.proyecto1D.service.MateriaService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/materias")
public class MateriaController {

    private final MateriaService materiaService;

    public MateriaController(MateriaService materiaService) {
        this.materiaService = materiaService;
    }

    @PostMapping
    public ResponseEntity<Materia> addMateria(@Valid @RequestBody RequestMateriaDTO payload) {
        return new ResponseEntity<>(materiaService.addMateria(payload), HttpStatus.CREATED);
    }
}