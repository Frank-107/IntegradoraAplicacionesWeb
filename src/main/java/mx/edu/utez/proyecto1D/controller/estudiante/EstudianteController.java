package mx.edu.utez.proyecto1D.controller.estudiante;

import jakarta.validation.Valid;
import mx.edu.utez.proyecto1D.dto.estudiante.RequestEstudianteDTO;
import mx.edu.utez.proyecto1D.model.estudiante.Estudiante;
import mx.edu.utez.proyecto1D.service.estudiante.EstudianteService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin({"*"})
@RequestMapping("/estudiante")

public class EstudianteController {
    private final EstudianteService estudianteService;
    public EstudianteController(EstudianteService estudianteService){
        this.estudianteService = estudianteService;
    }

    @PostMapping("/add")
    public ResponseEntity<Estudiante> addEstudiante(@RequestBody @Valid RequestEstudianteDTO payload){
        Estudiante estudiante = new Estudiante();
        return ResponseEntity.status(201).body(estudianteService.addEstudiante(payload));


    }

}
