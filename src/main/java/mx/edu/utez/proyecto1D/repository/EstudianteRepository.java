package mx.edu.utez.proyecto1D.repository;

import mx.edu.utez.proyecto1D.model.estudiante.Estudiante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

public interface EstudianteRepository extends JpaRepository<Estudiante,Long> {

    Optional<Estudiante> findByMatricula(String matricula);
}
