package mx.edu.utez.proyecto1D.service;

import mx.edu.utez.proyecto1D.dto.RequestEstudianteDTO;
import mx.edu.utez.proyecto1D.exception.customExceptions.CustomBadRequestException;
import mx.edu.utez.proyecto1D.model.estudiante.Estudiante;
import mx.edu.utez.proyecto1D.repository.EstudianteRepository;
import org.springframework.stereotype.Service;

@Service
public class EstudianteService {

    private final EstudianteRepository estudianteRepository;
    public EstudianteService(EstudianteRepository estudianteRepository){
        this.estudianteRepository = estudianteRepository;

    }

    public Estudiante addEstudiante(RequestEstudianteDTO payload){
        if(estudianteRepository.findByMatricula(payload.getMatricula()).isPresent()){
            throw new CustomBadRequestException("El Estudiante con matricula "+ payload.getMatricula() +" ya existe");
        }
        Estudiante estudiante = new Estudiante();
        estudiante.setNombre(payload.getNombre());
        estudiante.setMatricula(payload.getMatricula());
        estudiante.setApellidoPaterno(payload.getApellidoPaterno());
        estudiante.setApellidoMaterno(payload.getApellidoMaterno());
        return estudianteRepository.save(estudiante);
    }

}
