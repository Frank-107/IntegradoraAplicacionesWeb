package mx.edu.utez.proyecto1D.dto.carrera;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class RequestCarreraDTO {

    private Long id_carrera;

    @NotBlank(message = "El nombre de la carrera es obligatorio")
    @Size(max = 50, message = "El nombre no debe exceder los 50 caracteres")
    private String nombre;

    @NotBlank(message = "La clave es obligatoria")
    @Size(max = 30, message = "La clave no debe exceder los 30 caracteres")
    private String clave;

    @NotNull(message = "El número de cuatrimestre es obligatorio")
    @Min(value = 1, message = "El número de cuatrimestre debe ser al menos 1")
    private Integer num_cuatrimestre;
}
