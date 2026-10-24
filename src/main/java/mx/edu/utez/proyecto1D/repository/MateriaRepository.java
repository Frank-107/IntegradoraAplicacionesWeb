package mx.edu.utez.proyecto1D.repository;

import mx.edu.utez.proyecto1D.model.materia.Materia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MateriaRepository extends JpaRepository<Materia, Long> {
}