package mx.edu.utez.proyecto1D.repository;

import mx.edu.utez.proyecto1D.model.profesor.Profesor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfesorRepository extends JpaRepository<Profesor, Long> {
}