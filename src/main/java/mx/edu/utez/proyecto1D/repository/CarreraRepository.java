package mx.edu.utez.proyecto1D.repository;

import mx.edu.utez.proyecto1D.model.carrera.Carrera;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarreraRepository extends JpaRepository<Carrera, Long> {
}