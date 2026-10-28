package mx.edu.utez.proyecto1D.model.estudiante;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name = "Usuario")
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private Long id_Profesor;
    @Column(nullable = false,length = 50)
    private String correo;
    @Column(nullable = false,length = 15)
    private String contrasena;
    @Column(nullable = false)
    private EstadoUsuario estado;

}
