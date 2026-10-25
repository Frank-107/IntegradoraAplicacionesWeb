package mx.edu.utez.proyecto1D.dto.generacion;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class RequestGeneracionDTO {

    private Long id_generacion;

    @NotBlank(message = "El nombre de la generación es obligatorio")
    @Size(max = 50, message = "El nombre no debe exceder los 50 caracteres")
    private String nombre;

    @NotNull(message = "La fecha de inicio es obligatoria")
    private Date fecha_inicio;

    @NotNull(message = "El ID de la carrera es obligatorio")
    private Long carreraId;
}
