package mx.edu.utez.proyecto1D.model.generacion;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import mx.edu.utez.proyecto1D.model.carrera.Carrera;

import java.util.Date;

@Table(name = "generacion")
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Generacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_generacion;

    @Column(length = 50)
    private String nombre;

    @Column
    private Date fehca_inicio;

    @ManyToOne
    @JoinColumn(name = "id_carrera_fk", nullable = false)
    private Carrera carrera;


}



