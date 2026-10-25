package mx.edu.utez.proyecto1D.model.carrera;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import mx.edu.utez.proyecto1D.model.generacion.Generacion;

import java.util.List;

@Table(name = "carrera")
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Carrera {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_carrera;

    @Column(length = 50)
    private String nombre;

    @Column(length = 30)
    private Character clave;

    @Column(length = 2)
    private Integer num_Cuatrimestre;



}
