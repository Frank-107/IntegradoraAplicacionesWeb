package mx.edu.utez.proyecto1D.model.materia;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import mx.edu.utez.proyecto1D.model.profesor.Profesor;
import mx.edu.utez.proyecto1D.model.carrera.Carrera;

@Entity
@Table(name = "Materia")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Materia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id_materia")
    private Long idMateria;

    @ManyToOne
    @JoinColumn(name = "Profesor_Id_Profesor", nullable = false)
    private Profesor profesor;

    @ManyToOne
    @JoinColumn(name = "Carrera_Id_carrera", nullable = false)
    private Carrera carrera;

    @Column(name = "Nombre", length = 100, nullable = false)
    private String nombre;

    @Column(name = "Cuatrimestre")
    private Short cuatrimestre;

    @Column(name = "Num_unidades")
    private Short numUnidades;
}

