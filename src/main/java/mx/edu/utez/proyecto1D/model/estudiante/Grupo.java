package mx.edu.utez.proyecto1D.model.estudiante;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name = "Grupo")
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Grupo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private Long id_generacion;
    @Column(nullable = false)
    private char letra;
    @Column(nullable = false)
    private int cuatrimestre_actual;
    @Column(nullable = false)
    private char estado;
}
