package mx.edu.utez.proyecto1D.model.unidad;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import mx.edu.utez.proyecto1D.model.materia.Materia;

@Table(name = "unidad")
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Unidad {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_unidad;

    @Column(nullable = false)
    private Integer numero;

    @Column(nullable = false, length = 50)
    private String nombre;

    @ManyToOne
    @JoinColumn(name = "id_materia_fk", nullable = false)
    private Materia materia;
}
