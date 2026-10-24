package mx.edu.utez.proyecto1D.service;

import mx.edu.utez.proyecto1D.dto.RequestProfesorDTO;
import mx.edu.utez.proyecto1D.exception.customExceptions.CustomBadRequestException;
import mx.edu.utez.proyecto1D.model.profesor.Profesor;
import mx.edu.utez.proyecto1D.model.usuario.Usuario;
import mx.edu.utez.proyecto1D.repository.ProfesorRepository;
import mx.edu.utez.proyecto1D.repository.UsuarioRepository;
import org.springframework.stereotype.Service;

@Service
public class ProfesorService {

    private final ProfesorRepository profesorRepository;
    private final UsuarioRepository usuarioRepository;

    public ProfesorService(ProfesorRepository profesorRepository, UsuarioRepository usuarioRepository) {
        this.profesorRepository = profesorRepository;
        this.usuarioRepository = usuarioRepository;
    }

    public Profesor addProfesor(RequestProfesorDTO payload) {
        Usuario usuario = usuarioRepository.findById(payload.getIdUsuario())
                .orElseThrow(() -> new CustomBadRequestException("El Usuario con id " + payload.getIdUsuario() + " no existe"));

        Profesor profesor = new Profesor();
        profesor.setUsuario(usuario);
        profesor.setNombre(payload.getNombre());
        profesor.setApellido(payload.getApellido());
        profesor.setTelefono(payload.getTelefono());

        return profesorRepository.save(profesor);
    }
}