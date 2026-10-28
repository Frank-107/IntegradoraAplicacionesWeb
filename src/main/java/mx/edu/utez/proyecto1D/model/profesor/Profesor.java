package mx.edu.utez.proyecto1D.model.profesor;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import mx.edu.utez.proyecto1D.model.usuario.Usuario;

@Table(name = "Profesor")
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Profesor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id_Profesor")
    private Long idProfesor;

    @ManyToOne
    @JoinColumn(name = "Usuario_Id_Usuario", nullable = false)
    private Usuario usuario;

    @Column(name = "Nombre", length = 50, nullable = false)
    private String nombre;

    @Column(name = "Apellido", length = 50, nullable = false)
    private String apellido;

    @Column(name = "Telefono")
    private Long telefono;
}
