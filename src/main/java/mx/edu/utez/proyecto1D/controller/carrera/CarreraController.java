package mx.edu.utez.proyecto1D.controller.carrera;

import mx.edu.utez.proyecto1D.model.carrera.Carrera;
import mx.edu.utez.proyecto1D.service.carrera.CarreraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/carrera")
public class CarreraController {
    private final CarreraService carreraService;

    @Autowired
    public CarreraController(CarreraService carreraService) {
        this.carreraService = carreraService;
    }

    // 1. Obtener todas las carreras (GET /carrera)
    @GetMapping
    public ResponseEntity<List<Carrera>> getAll() {
        List<Carrera> carreras = carreraService.findAll();
        return new ResponseEntity<>(carreras, HttpStatus.OK);
    }

    // 2. Obtener una carrera por ID (GET /carrera/{id})
    @GetMapping("/{id}")
    public ResponseEntity<Carrera> getById(@PathVariable("id") Long id) {
        Carrera carrera = carreraService.findById(id);
        if (carrera == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(carrera, HttpStatus.OK);
    }

    // 3. Registrar una nueva carrera (POST /carrera)
    @PostMapping
    public ResponseEntity<Carrera> create(@RequestBody Carrera carrera) {
        Carrera nuevaCarrera = carreraService.save(carrera);
        return new ResponseEntity<>(nuevaCarrera, HttpStatus.CREATED);
    }

    // 4. Actualizar una carrera existente (PUT /carrera)
    @PutMapping
    public ResponseEntity<Carrera> update(@RequestBody Carrera carrera) {
        Carrera carreraActualizada = carreraService.save(carrera);
        return new ResponseEntity<>(carreraActualizada, HttpStatus.OK);
    }

    // 5. Eliminar una carrera por ID (DELETE /carrera/{id})
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable("id") Long id) {
        carreraService.deleteById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }


}
