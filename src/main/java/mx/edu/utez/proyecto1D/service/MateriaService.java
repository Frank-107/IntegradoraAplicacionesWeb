package mx.edu.utez.proyecto1D.service;

import mx.edu.utez.proyecto1D.dto.RequestMateriaDTO;
import mx.edu.utez.proyecto1D.exception.customExceptions.CustomBadRequestException;
import mx.edu.utez.proyecto1D.model.carrera.Carrera;
import mx.edu.utez.proyecto1D.model.materia.Materia;
import mx.edu.utez.proyecto1D.model.profesor.Profesor;
import mx.edu.utez.proyecto1D.repository.CarreraRepository;
import mx.edu.utez.proyecto1D.repository.MateriaRepository;
import mx.edu.utez.proyecto1D.repository.ProfesorRepository;
import org.springframework.stereotype.Service;

@Service
public class MateriaService {

    private final MateriaRepository materiaRepository;
    private final ProfesorRepository profesorRepository;
    private final CarreraRepository carreraRepository;

    public MateriaService(MateriaRepository materiaRepository, ProfesorRepository profesorRepository, CarreraRepository carreraRepository) {
        this.materiaRepository = materiaRepository;
        this.profesorRepository = profesorRepository;
        this.carreraRepository = carreraRepository;
    }

    public Materia addMateria(RequestMateriaDTO payload) {
        Profesor profesor = profesorRepository.findById(payload.getIdProfesor())
                .orElseThrow(() -> new CustomBadRequestException("El Profesor con id " + payload.getIdProfesor() + " no existe"));

        Carrera carrera = carreraRepository.findById(payload.getIdCarrera())
                .orElseThrow(() -> new CustomBadRequestException("La Carrera con id " + payload.getIdCarrera() + " no existe"));

        Materia materia = new Materia();
        materia.setProfesor(profesor);
        materia.setCarrera(carrera);
        materia.setNombre(payload.getNombre());
        materia.setCuatrimestre(payload.getCuatrimestre());
        materia.setNumUnidades(payload.getNumUnidades());

        return materiaRepository.save(materia);
    }
}