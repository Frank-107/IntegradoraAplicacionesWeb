package mx.edu.utez.proyecto1D.repository.estudiante;

import mx.edu.utez.proyecto1D.model.estudiante.Estudiante;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface EstudianteRepository extends JpaRepository<Estudiante,Long> {

    Optional<Estudiante> findByMatricula(String matricula);
}
