package mx.edu.utez.proyecto1D.model.calificacion;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import mx.edu.utez.proyecto1D.model.estudiante.Estudiante;
import mx.edu.utez.proyecto1D.model.profesor.Profesor;
import mx.edu.utez.proyecto1D.model.unidad.Unidad;

@Table(name = "calificacion")
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Calificacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_calificacion;

    @Column(nullable = false, length = 10)
    private String matricula;

    @Column(nullable = false, length = 50)
    private String nombre;

    @Column(nullable = false, length = 50)
    private String apellido;

    @Column(length = 10)
    private String telefono;

    @Column(nullable = false)
    private boolean estado = true;

    @ManyToOne
    @JoinColumn(name = "id_profesor_fk", nullable = false)
    private Profesor profesor;

    @ManyToOne
    @JoinColumn(name = "id_unidad_fk", nullable = false)
    private Unidad unidad;

    @ManyToOne
    @JoinColumn(name = "id_estudiante_fk", nullable = false)
    private Estudiante estudiante;
}
