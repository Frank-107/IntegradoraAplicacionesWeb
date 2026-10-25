package mx.edu.utez.proyecto1D.repository.calificacion;

import mx.edu.utez.proyecto1D.model.calificacion.Calificacion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CalificacionRepository extends JpaRepository<Calificacion,Long> {
}
