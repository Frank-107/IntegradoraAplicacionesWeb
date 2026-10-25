package mx.edu.utez.proyecto1D.controller.generacion;

import mx.edu.utez.proyecto1D.model.generacion.Generacion;
import mx.edu.utez.proyecto1D.service.generacion.GeneracionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@CrossOrigin("*")
@RequestMapping("/generacion")
public class GeneracionController {

    private final GeneracionService generacionService;

    @Autowired
    public GeneracionController(GeneracionService generacionService) {
        this.generacionService = generacionService;
    }

    @GetMapping
    public ResponseEntity<List<Generacion>> getAll() {
        List<Generacion> generaciones = generacionService.findAll();
        return new ResponseEntity<>(generaciones, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Generacion> getById(@PathVariable("id") Long id) {
        Generacion generacion = generacionService.findById(id);
        if (generacion == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(generacion, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Generacion> create(@RequestBody Generacion generacion) {
        Generacion nuevaGeneracion = generacionService.save(generacion);
        return new ResponseEntity<>(nuevaGeneracion, HttpStatus.CREATED);
    }

    @PutMapping
    public ResponseEntity<Generacion> update(@RequestBody Generacion generacion) {
        Generacion generacionActualizada = generacionService.save(generacion);
        return new ResponseEntity<>(generacionActualizada, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable("id") Long id) {
        generacionService.deleteById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
