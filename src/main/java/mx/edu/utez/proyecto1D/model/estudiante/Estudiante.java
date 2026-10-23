package mx.edu.utez.proyecto1D.model.estudiante;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name = "estudiante")
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Estudiante {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 50)
    private String nombre;

    @Column(nullable = false, length =10 )
    private String matricula;
    @Column(nullable = false, length = 50)
    private String apellidoPaterno;

    @Column(length = 50)
    private String apellidoMaterno;

    @Column(nullable = false)
    private boolean estado = true;

}
